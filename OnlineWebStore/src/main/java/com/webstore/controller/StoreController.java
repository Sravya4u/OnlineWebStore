package com.webstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.webstore.common.WebStoreLogger;
import com.webstore.exceptions.WebStoreException;
import com.webstore.model.InCartProducts;
import com.webstore.model.Products;
import com.webstore.service.IStoreService;

@RestController
public class StoreController { 

	private final static WebStoreLogger LOGGER = WebStoreLogger.getLogger(StoreController.class.getName());
	
	@Autowired
	private IStoreService storeService;
    
    @RequestMapping("/products")
    public ModelAndView getProducts() throws WebStoreException{
    	LOGGER.debug("get products method: START");
    	
    	ModelAndView mav = new ModelAndView("/products");
    	 Products products = storeService.getProducts();
    	mav.addObject("products", products);
    	
    	LOGGER.debug("get products method: END");
    	return mav;
    }


	@RequestMapping("/buyProducts")
    public ModelAndView buyProducts(@ModelAttribute("products") Products products,HttpServletRequest request) throws WebStoreException{
		LOGGER.debug("buy products method: START");
		System.out.println(request.getParameter("summary"));
    	ModelAndView mav = new ModelAndView("/products");
    	//Set Cart Products
    	InCartProducts cartProducts = new InCartProducts();
    	cartProducts.setFirstProduct(products.getFirstProductSold());
    	cartProducts.setSecondProduct(products.getSecondProductSold());
    	
    	products = storeService.updateProducts(products);
    	
    	//Update Product Summary
    	products.setProductSummary(cartProducts);
    	
    	mav.addObject("products", products);
    	
    	LOGGER.debug("buy products method: END");
    	return mav;
    }
	
	@ExceptionHandler(WebStoreException.class)
	public ModelAndView handleStoreException(HttpServletRequest request, Exception ex){
		LOGGER.error("Requested URL="+request.getRequestURL());
		LOGGER.error("Exception Raised="+ex);
		
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("exception", ex);
	    modelAndView.addObject("url", request.getRequestURL());
	    
	    modelAndView.setViewName("error");
	    return modelAndView;
	}	

}

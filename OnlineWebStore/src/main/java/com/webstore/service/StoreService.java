/**
 * 
 */
package com.webstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webstore.common.WebStoreLogger;
import com.webstore.dao.IProductDAO;
import com.webstore.exceptions.WebStoreException;
import com.webstore.model.Product;
import com.webstore.model.Products;

/**
 * @author SravyaWin
 *
 */
@Service("storeService")
public class StoreService implements IStoreService {
	
	private final static WebStoreLogger LOGGER = WebStoreLogger.getLogger(StoreService.class.getName());
	
	@Autowired
	IProductDAO productDAO;
	
	@Autowired
	Products products;
	
	/**
	 * @return Products
	 * @throws WebStoreException
	 */
	@Override
	public Products getProducts() throws WebStoreException {
		LOGGER.debug("get products service method: START");
		try {
			List<Product> productList = productDAO.getProducts();
			if(!productList.isEmpty()){
			 products = createProductsVO(productList);
			}else{
				throw new WebStoreException("No Products Found");
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw new WebStoreException(e.getMessage());
		}
		LOGGER.debug("get products service method: END");
		return products;
	}


	/**
	 * @param products
	 * @return Products
	 * @throws WebStoreException
	 */
	@Override
	public Products updateProducts(Products products) throws WebStoreException {
		LOGGER.debug("update products service method: START");
		try {
			List<Product> productList = productDAO.updateProducts(products);
			
			if(!productList.isEmpty()){
				 products = createProductsVO(productList);
				}else{
					throw new WebStoreException("No Products Found");
				}
				
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw new WebStoreException(e.getMessage());
			
		}
		LOGGER.debug("update products service method: END");
		return products;
	}
	
	/**
	 * Method to map entity to VO.
	 * 
	 * @param productList
	 * @return
	 */
	private Products createProductsVO(List<Product> productList) {
	    	Products products = new Products();
	    	products.setFirstProductCount(productList.get(0).getProductCount());
	    	products.setFirstProductName(productList.get(0).getProductName());
	    	products.setFirstProductSold(productList.get(0).getProductSold());
	    	products.setSecondProductCount(productList.get(1).getProductCount());
	    	products.setSecondProductName(productList.get(1).getProductName());
	    	products.setSecondProductSold(productList.get(1).getProductSold());
	    	return products;
			
	    	
		}

}

/**
 * 
 */
package com.webstore.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.webstore.common.WebStoreLogger;
import com.webstore.exceptions.WebStoreException;
import com.webstore.model.Product;
import com.webstore.model.Products;

/**
 * @author SravyaWin
 *
 */
@Repository("productDAO")
public class ProductDAO implements IProductDAO {
	
	private final static WebStoreLogger LOGGER = WebStoreLogger.getLogger(ProductDAO.class.getName());
	
	// Dummy database. Initialize with some dummy values.
	private static List<Product> products;
	{
		
			initializeProducts(20,10);
		
	}

	/**
	 * Method to initialize data
	 * 
	 */
	private void initializeProducts(int item1Count,int item2Count) {
		products = new ArrayList<Product>();
		products.add(new Product("ItemA",100,item1Count,0));
		products.add(new Product("ItemB",200,item2Count,0));
	}

	/**
	 * @return productList
	 */
	@Override
	public List<Product> getProducts(){
		LOGGER.debug("get products DAO method: START");
		
		LOGGER.debug("get products DAO method: END");
		
		return products;
	}

	/**
	 * @param products
	 * @return
	 * @throws WebStoreException
	 */
	@Override
	public List<Product> updateProducts(Products purchasedProducts) throws WebStoreException {
		LOGGER.debug("update products DAO method: START");
		try {
			int product1Stock = 0;
			int product2Stock = 0;
			if(products.get(0).getProductCount() >0){
			 product1Stock = products.get(0).getProductCount()-purchasedProducts.getFirstProductSold();
			}
			if(products.get(0).getProductCount() >0){
			 product2Stock = products.get(1).getProductCount()-purchasedProducts.getSecondProductSold();
			}
			initializeProducts(product1Stock,product2Stock);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw new WebStoreException(e.getMessage(),e);
		}
		LOGGER.debug("update products DAO method: END");
		return products;
		
	}


}


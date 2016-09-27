/**
 * 
 */
package com.webstore.service;

import com.webstore.exceptions.WebStoreException;
import com.webstore.model.Products;

/**
 * @author SravyaWin
 *
 */
public interface IStoreService {
	
	/**
	 * @return Products
	 * @throws WebStoreException
	 */
	public Products getProducts() throws WebStoreException;

	/**
	 * @param products
	 * @return Products
	 * @throws WebStoreException
	 */
	public Products updateProducts(Products products) throws WebStoreException;

}

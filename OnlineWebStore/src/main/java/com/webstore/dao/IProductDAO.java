package com.webstore.dao;

import java.util.List;

import com.webstore.exceptions.WebStoreException;
import com.webstore.model.Product;
import com.webstore.model.Products;

public interface IProductDAO {

	/**
	 * @return
	 */
	public List<Product> getProducts() ;

	/**
	 * @param products
	 * @return
	 * @throws WebStoreException
	 */
	public List<Product> updateProducts(Products products) throws  WebStoreException;
}

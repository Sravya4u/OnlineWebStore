/**
 * 
 */
package com.webstore.model;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author SravyaWin
 *
 */
@Component
public class ProductList {
	
	private List<Product> productList;
	private int productSold;
	
	

	/**
	 * @return the productSold
	 */
	public int getProductSold() {
		return productSold;
	}

	/**
	 * @param productSold the productSold to set
	 */
	public void setProductSold(int productSold) {
		this.productSold = productSold;
	}

	/**
	 * @return the productList
	 */
	public List<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
}

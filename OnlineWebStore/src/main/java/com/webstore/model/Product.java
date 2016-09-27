/**
 * 
 */
package com.webstore.model;

/**
 * @author SravyaWin
 *
 */
public class Product {
	
	private String productName;
	
	private int productCost;
	
	private int productCount;
	
	private int productSold;

	
	public Product(String productName, int productCost,int productCount,int productSold) {
		this.productName = productName;
		this.productCost = productCost;
		this.productCount = productCount;
		this.productSold = productSold;
	}
	
	public Product() {
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productCount
	 */
	public int getProductCost() {
		return productCost;
	}

	/**
	 * @param productCount the productCount to set
	 */
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	/**
	 * @return the productCount
	 */
	public int getProductCount() {
		return productCount;
	}

	/**
	 * @param productCount the productCount to set
	 */
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

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

	
}

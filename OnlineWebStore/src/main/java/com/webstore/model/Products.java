/**
 * 
 */
package com.webstore.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * @author SravyaWin
 *
 */
@Component
public class Products implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1183239037118057014L;

	private String firstProductName;
	
	private int firstProductCount;
	
	private int firstProductSold;
	
	private String secondProductName;
	
	private int secondProductCount;
	
	private int secondProductSold;
	
	private String summary;
	
	private InCartProducts productSummary = null;  

	/**
	 * @return the firstProductName
	 */
	public String getFirstProductName() {
		return firstProductName;
	}

	/**
	 * @param firstProductName the firstProductName to set
	 */
	public void setFirstProductName(String firstProductName) {
		this.firstProductName = firstProductName;
	}

	/**
	 * @return the firstProductCount
	 */
	public int getFirstProductCount() {
		return firstProductCount;
	}

	/**
	 * @param firstProductCount the firstProductCount to set
	 */
	public void setFirstProductCount(int firstProductCount) {
		this.firstProductCount = firstProductCount;
	}

	/**
	 * @return the firstProductSold
	 */
	public int getFirstProductSold() {
		return firstProductSold;
	}

	/**
	 * @param firstProductSold the firstProductSold to set
	 */
	public void setFirstProductSold(int firstProductSold) {
		this.firstProductSold = firstProductSold;
	}

	/**
	 * @return the secondProductName
	 */
	public String getSecondProductName() {
		return secondProductName;
	}

	/**
	 * @param secondProductName the secondProductName to set
	 */
	public void setSecondProductName(String secondProductName) {
		this.secondProductName = secondProductName;
	}

	/**
	 * @return the secondProductCount
	 */
	public int getSecondProductCount() {
		return secondProductCount;
	}

	/**
	 * @param secondProductCount the secondProductCount to set
	 */
	public void setSecondProductCount(int secondProductCount) {
		this.secondProductCount = secondProductCount;
	}

	/**
	 * @return the secondProductSold
	 */
	public int getSecondProductSold() {
		return secondProductSold;
	}

	/**
	 * @param secondProductSold the secondProductSold to set
	 */
	public void setSecondProductSold(int secondProductSold) {
		this.secondProductSold = secondProductSold;
	}

	/**
	 * @return the productSummary
	 */
	public InCartProducts getProductSummary() {
		return productSummary;
	}

	/**
	 * @param productSummary the productSummary to set
	 */
	public void setProductSummary(InCartProducts productSummary) {
		this.productSummary = productSummary;
	}

	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	

}

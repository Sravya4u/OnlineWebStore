/**
 * 
 */
package com.webstore.exceptions;

/**
 * @author SravyaWin
 *
 */
public class WebStoreException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9007125190426348203L;
	
	/**
	 * Constructs a new exception with the specified detail message.
	 * 
	 * @param message
	 */
	public WebStoreException(String message) {
		super(message);
	}

	/**
	 * Constructs a new exception with the specified detail message and cause
	 * 
	 * @param message
	 * @param cause
	 */
	public WebStoreException(String message, Throwable cause) {
		super(message, cause);
	}

}

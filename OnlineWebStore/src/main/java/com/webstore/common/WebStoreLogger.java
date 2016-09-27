/**
 * 
 */
package com.webstore.common;

import org.apache.log4j.Level;

import com.webstore.common.WebStoreLogger;

/**
 * @author SravyaWin
 *
 */
public class WebStoreLogger {

	// ---------- Instance variables:

    /**
     * The log4j <code>Logger</code> instance associated with this logger.
     */
    org.apache.log4j.Logger logger;  // Log4j Logger instance.

    // ---------- Constructors:

    /**
     * Create a <code>Logger</code> object named using the parameter
     * <code>loggerName</code>.
     *
     * @param loggerName    The name given to the Logger object.
     */
    private WebStoreLogger( String loggerName ) {
        this.logger = org.apache.log4j.Logger.getLogger( loggerName );
    }

    /**
     * Get a <code>Logger</code> object named using the parameter
     * <code>loggerName</code>. The object returned will be appropriate to 
     * the caller's environment (Application Server tier, Web Server tier, 
     * etc.).
     *
     * @param loggerName    The name given to the Logger object.
     */
    public static WebStoreLogger getLogger( String loggerName ) {
        return new WebStoreLogger( loggerName );
    }

    /**
     * Get a <code>Logger</code> object named using the class name of the
     * parameter <code>clazz</code>.
     *
     * @param clazz         The name of this class is given to the Logger
     *                      object.
     */
    public static WebStoreLogger getLogger( Class<Object> clazz ) {
        return getLogger( clazz.getName() );
    }


    /**
     * Write a message with the <code>DEBUG</code> severity to the log.
     *
     * @param message	    The message to log.
     */
    public final void debug( String message ) {
        this.logger.log( WebStoreLogger.class.getName(), Level.DEBUG, message, null);
    }

    /**
     * Write a message and exception with the <code>DEBUG</code> severity to
     * the log.
     *
     * @param message	    The message to log.
     * @param error		    The exception or error to log.
     */
    public final void debug( String message, Throwable error ) {
        this.logger.log( WebStoreLogger.class.getName(), Level.DEBUG, message, error);
    }
    
    
    /**
     * Write a message with the <code>DEBUG</code> severity to the log.
     *
     * @param message	    The message to log.
     */
    public final void info( String message ) {
        this.logger.log( WebStoreLogger.class.getName(), Level.INFO, message, null);
    }

    /**
     * Write a message with the <code>DEBUG</code> severity to the log.
     *
     * @param message	    The message to log.
     */
    public final void warn( String message ) {
        this.logger.log( WebStoreLogger.class.getName(), Level.WARN, message, null);
    }


    /**
     * Write a message with the <code>DEBUG</code> severity to the log.
     *
     * @param message	    The message to log.
     */
    public final void error( String message ) {
        this.logger.log( WebStoreLogger.class.getName(), Level.ERROR, message, null);
    }
    
    /**
     * Write a message and exception with the <code>DEBUG</code> severity to
     * the log.
     *
     * @param message       The message to log.
     * @param error         The exception or error to log.
     */
    public final void fatal( String message, Throwable error ) {
        this.logger.log( WebStoreLogger.class.getName(), Level.FATAL, message, error);
    }
    
    public final boolean isDebugEnabled() {
    	return this.logger.isDebugEnabled();
    }
}

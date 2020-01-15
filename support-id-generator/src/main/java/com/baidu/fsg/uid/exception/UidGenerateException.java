package com.baidu.fsg.uid.exception;

/**
 * @Classname UidGenerateException
 * @Description TODO
 * @Date 2020/1/15 4:47 PM
 * @Created by nihui
 */
public class UidGenerateException extends RuntimeException {
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = -27048199131316992L;

    /**
     * Default constructor
     */
    public UidGenerateException() {
        super();
    }

    /**
     * Constructor with message & cause
     *
     * @param message
     * @param cause
     */
    public UidGenerateException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor with message
     *
     * @param message
     */
    public UidGenerateException(String message) {
        super(message);
    }

    /**
     * Constructor with message format
     *
     * @param msgFormat
     * @param args
     */
    public UidGenerateException(String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
    }

    /**
     * Constructor with cause
     *
     * @param cause
     */
    public UidGenerateException(Throwable cause) {
        super(cause);
    }
}

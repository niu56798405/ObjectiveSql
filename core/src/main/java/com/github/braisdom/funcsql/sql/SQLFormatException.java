package com.github.braisdom.funcsql.sql;

public class SQLFormatException extends RuntimeException {
    public SQLFormatException() {
    }

    public SQLFormatException(String message) {
        super(message);
    }

    public SQLFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public SQLFormatException(Throwable cause) {
        super(cause);
    }

    public SQLFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
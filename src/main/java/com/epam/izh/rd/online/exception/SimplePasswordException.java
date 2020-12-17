package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Exception {
    public SimplePasswordException(String err, Throwable throwable) {
        super(err, throwable);
    }

    public SimplePasswordException(String err) {
        super(err);
    }
}

package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {
    public NotCorrectPasswordException(String message) {
        super(message);
    }

    public NotCorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}

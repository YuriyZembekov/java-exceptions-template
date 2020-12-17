package com.epam.izh.rd.online.exception;

public class UserAlreadyRegisteredException extends Exception {
    public UserAlreadyRegisteredException(String err, Throwable throwable) {
        super(err, throwable);
    }

    public UserAlreadyRegisteredException(String err) {
        super(err);
    }
}

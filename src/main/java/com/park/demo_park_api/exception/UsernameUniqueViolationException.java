package com.park.demo_park_api.exception;


import javax.management.RuntimeErrorException;

public class UsernameUniqueViolationException extends RuntimeException {

    public UsernameUniqueViolationException(String message) {
        super(message);
    }
}

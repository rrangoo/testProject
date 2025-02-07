package org.examlpe.testproject.exceptions;

public class NumberNotFoundException extends RuntimeException {
    public NumberNotFoundException(String message) {
        super(message);
    }
}

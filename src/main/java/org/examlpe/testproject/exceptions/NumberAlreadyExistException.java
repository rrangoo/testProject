package org.examlpe.testproject.exceptions;

public class NumberAlreadyExistException extends RuntimeException {
    public NumberAlreadyExistException(String message) {
        super(message);
    }
}

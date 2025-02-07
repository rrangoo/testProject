package org.examlpe.testproject.controller;

import org.examlpe.testproject.dto.NumberRequest;
import org.examlpe.testproject.dto.NumberResponse;

public interface PhoneLibraryController {
    void createNewNumber(String name, NumberRequest number);
    NumberResponse getNumber(String name);
}

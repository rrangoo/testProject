package org.examlpe.testproject.service;

import org.examlpe.testproject.dto.NumberResponse;

public interface NumberService {

    NumberResponse getNumberByName(String name);
    void addNumber(String name, String number);
}

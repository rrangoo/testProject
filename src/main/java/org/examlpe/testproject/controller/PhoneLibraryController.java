package org.examlpe.testproject.controller;

import org.examlpe.testproject.dto.NumberRequest;
import org.examlpe.testproject.dto.NumberResponse;

public interface PhoneLibraryController {
    /**
     * создать новый номер в базе
     * @param name название номера
     * @param number номер в виде строки
     */
    void createNewNumber(String name, NumberRequest number);


    /**
     * получить информацию о номере по названию
     * @param name название номера
     * @return номер
     */
    NumberResponse getNumber(String name);
}

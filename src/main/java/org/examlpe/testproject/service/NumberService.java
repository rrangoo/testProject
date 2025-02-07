package org.examlpe.testproject.service;

import org.examlpe.testproject.dto.NumberResponse;

public interface NumberService {

    /**
     * возвращает из базы номер по названию
     * @param name название номера
     * @return номер
     */
    NumberResponse getNumberByName(String name);

    /**
     * добавляет новый номер в базу
     * @param name название номера
     * @param number номер
     */
    void addNumber(String name, String number);
}

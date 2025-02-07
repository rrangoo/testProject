package org.examlpe.testproject.service;

import org.examlpe.testproject.dto.MessageResponse;

public interface CallService {
    /**
     * совершает звонок на указанный номер и возвращает запись звонка
     * @param name название номера
     * @return запись звонка
     */
    MessageResponse call(String name);
}

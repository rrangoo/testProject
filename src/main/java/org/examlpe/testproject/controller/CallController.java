package org.examlpe.testproject.controller;

import org.examlpe.testproject.domain.CallMessage;
import org.examlpe.testproject.dto.MessageResponse;

public interface CallController {
    /**
     * совершить звонок на номер по названию
     * @param name название номера
     * @return запись звонка
     */
    MessageResponse call(String name);
}

package org.examlpe.testproject.client;

import org.examlpe.testproject.domain.CallMessage;
import org.examlpe.testproject.domain.Number;

public interface CallClient {


    /**
     * инициация начала звонка
     * @param number номер для звонка
     */
    void startCall(Number number);

    /**
     * завершение звонка
     * @return случайное целое число от 0 до 100
     */
    CallMessage stopCall();
}

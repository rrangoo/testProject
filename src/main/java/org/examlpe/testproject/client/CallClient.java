package org.examlpe.testproject.client;

import org.examlpe.testproject.domain.CallMessage;

public interface CallClient {


    /**
     * инициация начала звонка
     * @param number номер для звонка
     */
    void startCall(String number);

    /**
     * завершение звонка
     * @return случайное целое число от 0 до 100
     */
    CallMessage stopCall();
}

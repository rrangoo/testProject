package org.examlpe.testproject.client;

import org.examlpe.testproject.domain.CallMessage;
import org.examlpe.testproject.domain.Number;
import org.examlpe.testproject.exceptions.CallClientFreeException;
import org.examlpe.testproject.exceptions.CallClientOccupiedException;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CallClientImpl implements CallClient {

    // номер на который совершается текущий звонок
    private Number currentNumber;

    // Состояние клиента (FREE - свободен, OCCUPIED - совершается звонок)
    private CallStatus status;

    public CallClientImpl() {
        status = CallStatus.FREE;
    }

    @Override
    public void startCall(Number number) {
        if (status != CallStatus.FREE) {
            throw new CallClientOccupiedException("Call client occupied");
        }

        // обновление состояния
        currentNumber = number;
        status = CallStatus.OCCUPIED;
    }

    @Override
    public CallMessage stopCall() {
        if (status != CallStatus.OCCUPIED) {
            throw new CallClientFreeException("Call client free");
        }

        // генерация сообщения
        Random rand = new Random();
        CallMessage message = new CallMessage(rand.nextInt(101), currentNumber);

        // сброс состояния
        currentNumber = null;
        status = CallStatus.FREE;

        return message;
    }
}

package org.examlpe.testproject.client;

import org.examlpe.testproject.domain.CallMessage;
import org.examlpe.testproject.exceptions.CallClientFreeException;
import org.examlpe.testproject.exceptions.CallClientOccupiedException;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CallClientImpl implements CallClient {

    private String currentNumber;
    private CallStatus status;

    public CallClientImpl() {
        status = CallStatus.FREE;
    }

    @Override
    public void startCall(String number) {
        if (status != CallStatus.FREE) {
            throw new CallClientOccupiedException("Call client occupied");
        }

        currentNumber = number;
        status = CallStatus.OCCUPIED;
    }

    @Override
    public CallMessage stopCall() {
        if (status != CallStatus.OCCUPIED) {
            throw new CallClientFreeException("Call client free");
        }

        Random rand = new Random();
        CallMessage message = new CallMessage(rand.nextInt(101), currentNumber);

        currentNumber = null;

        status = CallStatus.FREE;

        return message;
    }
}

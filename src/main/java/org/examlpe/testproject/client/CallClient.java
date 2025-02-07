package org.examlpe.testproject.client;

import org.examlpe.testproject.domain.CallMessage;

public interface CallClient {
    void startCall(String number);

    CallMessage stopCall();
}

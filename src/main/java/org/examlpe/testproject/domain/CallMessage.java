package org.examlpe.testproject.domain;

import lombok.Getter;

@Getter
public class CallMessage {
    private int message;
    private String number;

    public CallMessage(int message, String number) {
        this.message = message;
        this.number = number;
    }
}

package org.examlpe.testproject.domain;

import lombok.Getter;

@Getter
public class CallMessage {
    private int message;
    private Number number;

    public CallMessage(int message, Number number) {
        this.message = message;
        this.number = number;
    }
}

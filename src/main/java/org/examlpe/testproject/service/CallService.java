package org.examlpe.testproject.service;

import org.examlpe.testproject.domain.CallMessage;
import org.examlpe.testproject.dto.MessageResponse;

public interface CallService {
    MessageResponse call(String name);
}

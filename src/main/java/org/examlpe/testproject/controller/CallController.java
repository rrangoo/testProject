package org.examlpe.testproject.controller;

import org.examlpe.testproject.domain.CallMessage;
import org.examlpe.testproject.dto.MessageResponse;

public interface CallController {
    MessageResponse call(String name);
}

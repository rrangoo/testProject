package org.examlpe.testproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.examlpe.testproject.domain.CallMessage;

@Getter
@Setter
@AllArgsConstructor
public class MessageResponse {
    private CallMessage message;
}

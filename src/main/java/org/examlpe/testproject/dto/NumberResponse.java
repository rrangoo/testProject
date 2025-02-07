package org.examlpe.testproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.examlpe.testproject.domain.Number;

@Getter
@Setter
@AllArgsConstructor
public class NumberResponse {
    private Number number;
}

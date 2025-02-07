package org.examlpe.testproject.controller;

import lombok.RequiredArgsConstructor;
import org.examlpe.testproject.domain.CallMessage;
import org.examlpe.testproject.dto.ErrorResponse;
import org.examlpe.testproject.dto.MessageResponse;
import org.examlpe.testproject.service.CallService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("call")
@RequiredArgsConstructor
public class CallControllerImpl implements CallController {
    private final CallService callService;

    @GetMapping("{name}")
    public MessageResponse call(@PathVariable String name) {
        return callService.call(name);
    }


    // Обработка ошибок

    @ExceptionHandler(Exception.class)
    public ErrorResponse exceptionHandle(Exception e){
        return new ErrorResponse(e.getMessage() + "...from call");
    }
}

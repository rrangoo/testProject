package org.examlpe.testproject.controller;

import lombok.RequiredArgsConstructor;
import org.examlpe.testproject.domain.CallMessage;
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

    @ExceptionHandler(Exception.class)
    public String exceptionHandle(Exception e){
        return e.getMessage() + "...from call";
    }
}

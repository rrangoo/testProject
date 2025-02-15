package org.examlpe.testproject.controller;

import lombok.RequiredArgsConstructor;
import org.examlpe.testproject.domain.Number;
import org.examlpe.testproject.dto.ErrorResponse;
import org.examlpe.testproject.dto.NumberRequest;
import org.examlpe.testproject.dto.NumberResponse;
import org.examlpe.testproject.service.NumberService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lib")
@RequiredArgsConstructor
public class PhoneLibraryControllerImpl implements PhoneLibraryController {
    private final NumberService numberService;

    @PostMapping("{name}")
    public void createNewNumber(@PathVariable String name, @RequestBody NumberRequest number) {
        numberService.addNumber(name, number.getNumber());
    }

    @GetMapping("{name}")
    public NumberResponse getNumber(@PathVariable String name) {
        return numberService.getNumberByName(name);
    }


    // Обработка ошибок

    @ExceptionHandler(Exception.class)
    public ErrorResponse exceptionHandle(Exception e){
        return new ErrorResponse(e.getMessage() + "...from library");
    }
}

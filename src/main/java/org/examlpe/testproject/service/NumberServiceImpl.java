package org.examlpe.testproject.service;

import lombok.RequiredArgsConstructor;
import org.examlpe.testproject.domain.Number;
import org.examlpe.testproject.dto.NumberResponse;
import org.examlpe.testproject.exceptions.NumberAlreadyExistException;
import org.examlpe.testproject.exceptions.NumberNotFoundException;
import org.examlpe.testproject.store.PhoneLibraryRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NumberServiceImpl implements NumberService {
    private final PhoneLibraryRepository phoneLibraryRepository;

    @Override
    public NumberResponse getNumberByName(String name) {
        Optional<Number> number = phoneLibraryRepository.findByName(name);

        if (number.isEmpty()) {
            throw new NumberNotFoundException("Number with name <" + name + "> not found");
        }

        return new NumberResponse(number.get());
    }

    @Override
    public void addNumber(String name, String number) {

        // формирование нового номера
        Number newNumber = new Number();
        newNumber.setNumber(number);
        newNumber.setName(name);

        try {
            phoneLibraryRepository.save(newNumber);
        } catch (DataIntegrityViolationException e) {
            throw new NumberAlreadyExistException("Number with name <" + name + "> already exists");
        }
    }
}

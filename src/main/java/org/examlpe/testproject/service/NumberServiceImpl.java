package org.examlpe.testproject.service;

import lombok.RequiredArgsConstructor;
import org.examlpe.testproject.dto.NumberResponse;
import org.examlpe.testproject.store.PhoneLibraryStore;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NumberServiceImpl implements NumberService {
    private final PhoneLibraryStore phoneLibraryStore;

    @Override
    public NumberResponse getNumberByName(String name) {
        return new NumberResponse(phoneLibraryStore.getNumberByName(name));
    }

    @Override
    public void addNumber(String name, String number) {
        phoneLibraryStore.addNumber(name, number);
    }
}

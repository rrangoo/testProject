package org.examlpe.testproject.service;

import lombok.RequiredArgsConstructor;
import org.examlpe.testproject.client.CallClient;
import org.examlpe.testproject.domain.Number;
import org.examlpe.testproject.dto.MessageResponse;
import org.examlpe.testproject.exceptions.NumberNotFoundException;
import org.examlpe.testproject.store.PhoneLibraryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CallServiceImpl implements CallService {
    private final PhoneLibraryRepository phoneLibraryRepository;
    private final CallClient callClient;

    @Override
    public MessageResponse call(String name) {
        Optional<Number> number = phoneLibraryRepository.findByName(name);

        if (number.isEmpty()) {
            throw new NumberNotFoundException("Number with name <" + name + "> not found");
        }

        callClient.startCall(number.get());

        return new MessageResponse(callClient.stopCall());
    }
}

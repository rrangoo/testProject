package org.examlpe.testproject.service;

import lombok.RequiredArgsConstructor;
import org.examlpe.testproject.client.CallClient;
import org.examlpe.testproject.domain.CallMessage;
import org.examlpe.testproject.dto.MessageResponse;
import org.examlpe.testproject.store.PhoneLibraryStore;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CallServiceImpl implements CallService {
    private final PhoneLibraryStore phoneLibraryStore;
    private final CallClient callClient;

    @Override
    public MessageResponse call(String name) {
        String number = phoneLibraryStore.getNumberByName(name);

        callClient.startCall(number);

        return new MessageResponse(callClient.stopCall());
    }
}

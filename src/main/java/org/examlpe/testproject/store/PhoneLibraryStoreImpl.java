package org.examlpe.testproject.store;

import org.examlpe.testproject.exceptions.NumberAlreadyExistException;
import org.examlpe.testproject.exceptions.NumberNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class PhoneLibraryStoreImpl implements PhoneLibraryStore {

    private final HashMap<String, String> store;

    public PhoneLibraryStoreImpl(HashMap<String, String> store) {
        this.store = store;
    }

    @Override
    public String getNumberByName(String name) {
        if (store.containsKey(name)) {
            return store.get(name);
        }

        throw new NumberNotFoundException("String with name <" + name + "> not found");
    }

    @Override
    public void addNumber(String name, String number) {
        if (store.containsKey(name)) {
            throw new NumberAlreadyExistException("String with name <" + name + "> already exists");
        }

        store.put(name, number);
    }
}

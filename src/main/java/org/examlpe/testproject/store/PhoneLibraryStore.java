package org.examlpe.testproject.store;

public interface PhoneLibraryStore {

    String getNumberByName(String name);
    void addNumber(String name, String number);
}

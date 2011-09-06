package com.mysema;

import java.util.Arrays;
import java.util.List;

public class DogServiceImpl implements DogService {
    @Override
    public List<Dog> findMany(String name) {
        System.err.println("Search for dogs named: " + name);
        return Arrays.asList(new Dog(name), new Dog("fifi"));
    }

    @Override
    public void save(Dog dog) {
        System.err.println("Saving dog with name: " + dog.getName());
    }

    @Override
    public List<Dog> getAll() {
        System.err.println("Retrieving all dogs...");
        return Arrays.asList(new Dog("Fifi"), new Dog("Fido"));
    }
}

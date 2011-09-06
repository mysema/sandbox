package com.mysema;

import java.util.List;

public interface DogService {
    List<Dog> getAll();

    List<Dog> findMany(String name);

    void save(Dog dog);
}

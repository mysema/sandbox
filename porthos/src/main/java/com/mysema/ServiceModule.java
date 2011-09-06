package com.mysema;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DogService.class).to(DogServiceImpl.class);
        bind(CatService.class).to(CatServiceImpl.class);
    }

    public Injector getInjector() {
        return Guice.createInjector(new ServiceModule());
    }
}

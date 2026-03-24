package com.example.carexample.service;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final Engine engine;

    public CarService(Engine engine) {
        this.engine = engine;
    }

    public String drive(){
        return "Car is ready. " + engine.start();
    }
}

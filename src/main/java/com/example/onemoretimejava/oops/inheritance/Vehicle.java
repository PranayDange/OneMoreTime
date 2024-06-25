package com.example.onemoretimejava.oops.inheritance;

public class Vehicle {
    public String name;
    public String model;
    public int numberOfTyres;

    public Vehicle() {
    }

    public Vehicle(String name, String model, int numberOfTyres) {
        this.name = name;
        this.model = model;
        this.numberOfTyres = numberOfTyres;
    }

    void startEngine() {
        System.out.printf("engine is starting of %s : %s\n", name, model);
    }

    void stopEngine() {
        System.out.printf("engine is stoping of %s : %s\n", name, model);
    }
}

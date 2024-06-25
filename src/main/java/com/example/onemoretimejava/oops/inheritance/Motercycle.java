package com.example.onemoretimejava.oops.inheritance;

public class Motercycle extends Vehicle {
    String handleBarStyle;
    String suspensionType;

    public Motercycle(String name, String model, int numberOfTyres, String handleBarStyle, String suspensionType) {
        super(name, model, numberOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wehiellleee() {
        System.out.println("moter cycle is doinf wehileeeee!!!  " + name);
    }
}

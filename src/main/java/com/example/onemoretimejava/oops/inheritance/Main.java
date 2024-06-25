package com.example.onemoretimejava.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("suzuki", "900", 4, 4, "deiesel");
        c.startAc();
        c.startEngine();
        c.stopEngine();

        Motercycle m = new Motercycle("splender", "passen", 2, "sexy", "mono");
        m.wehiellleee();
        m.startEngine();
        m.stopEngine();
    }
}

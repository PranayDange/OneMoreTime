package com.example.onemoretime.coupling;

public class DogLooseCoupling implements AnimalLooseCoupling {
    @Override
    public void play() {
        System.out.println("dog is playing");
    }
}

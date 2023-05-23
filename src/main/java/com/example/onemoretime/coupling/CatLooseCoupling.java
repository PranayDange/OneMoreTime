package com.example.onemoretime.coupling;

public class CatLooseCoupling implements AnimalLooseCoupling {


    @Override
    public void play() {
        System.out.println("cat is playing with lion");

    }
}

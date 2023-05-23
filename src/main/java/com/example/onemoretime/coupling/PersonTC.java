package com.example.onemoretime.coupling;

public class PersonTC {

    //this is tight coupling
    AnimalTC animal = new AnimalTC();

    public void playWithAnimal() {
        //using animal
        animal.play();
    }

    public static void main(String[] args) {
        PersonTC p = new PersonTC();
        p.playWithAnimal();
    }
}

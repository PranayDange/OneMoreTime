package com.example.onemoretime.coupling;

public class PersonLooseCoupling {

    AnimalLooseCoupling animalLooseCoupling;

    public PersonLooseCoupling(AnimalLooseCoupling animalLooseCoupling) {
        this.animalLooseCoupling = animalLooseCoupling;
    }
    public void playWithAnimal() {
        //using animal
        animalLooseCoupling.play();
    }

    public static void main(String[] args) {
        AnimalLooseCoupling an2 = new DogLooseCoupling();
        //or
       // DogLooseCoupling an2 = new DogLooseCoupling();
        PersonLooseCoupling p1 = new PersonLooseCoupling(an2);


        CatLooseCoupling c1 = new CatLooseCoupling();
        PersonLooseCoupling p2 = new PersonLooseCoupling(c1);

        p1.playWithAnimal();
        p2.playWithAnimal();

    }
}

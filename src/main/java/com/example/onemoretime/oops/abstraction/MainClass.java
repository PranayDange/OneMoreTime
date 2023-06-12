package com.example.onemoretime.oops.abstraction;

public class MainClass {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        dog.makeSound();
        dog.sleep();

        Animal cat = new Cat("Whiskers");
        cat.makeSound();
        cat.sleep();
        Cat c1 = new Cat();
        c1.substract();


        Animal ani = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("hahahahahah");
            }
        };
        ani.sum();
    }
}


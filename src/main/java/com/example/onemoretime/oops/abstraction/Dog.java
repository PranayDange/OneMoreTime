package com.example.onemoretime.oops.abstraction;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("bhw bhw");
    }

}

package com.example.onemoretime.basic.overriding.withoutparameters;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

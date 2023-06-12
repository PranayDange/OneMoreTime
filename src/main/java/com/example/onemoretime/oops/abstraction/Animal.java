package com.example.onemoretime.oops.abstraction;

public abstract class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void sum() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        System.out.println(sum);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }


}

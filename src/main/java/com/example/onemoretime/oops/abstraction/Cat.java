package com.example.onemoretime.oops.abstraction;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public  void substract() {
        int a = 1;
        int b = 2;
        int sum = a - b;
        System.out.println(sum);
    }
}

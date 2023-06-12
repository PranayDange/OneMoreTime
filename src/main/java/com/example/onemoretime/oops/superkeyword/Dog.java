package com.example.onemoretime.oops.superkeyword;

import static com.intellij.openapi.roots.ui.configuration.CommonContentEntriesEditor.getName;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Call the superclass constructor
        this.breed = breed;
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Max", 3, "Labrador");
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}

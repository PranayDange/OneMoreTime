package com.example.onemoretime.basic.overriding.withoutparameters;

public class Main {
    public static void main(String[] args) {

/*        In Java, method overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass.
                This allows the subclass to provide a specific implementation of the method while still maintaining the same method signature as the superclass.*/
        Animal animal = new Animal();
        animal.makeSound();  // Output: "The animal makes a sound"

        Cat cat = new Cat();
        cat.makeSound();  // Output: "Meow"

        Dog dog = new Dog();
        dog.makeSound();  // Output: "Woof"

        Animal animal1 = new Dog();
        animal1.makeSound();
    }
}

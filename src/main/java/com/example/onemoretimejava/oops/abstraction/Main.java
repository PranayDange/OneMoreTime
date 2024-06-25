package com.example.onemoretimejava.oops.abstraction;

//abstraction can we acheived by using abstract class or interface
//interface was introduced later abstract class


interface Animal {
    //in interface koi bhi method private nahi ho skta sb public honge
    //every method is implicitly public
    void attack();//interface by default are public

    void eat();

    default void sleep() {
        //this method is not necessary to be implemented
        System.out.println("bird is sleeping");
    }
}

interface Walk {
    void walking();
}
//interface are by default public static final
//in intercface ek class can implement multiple interface but not possible in abstract class

class Lion implements Animal, Walk {

    @Override
    public void attack() {
        System.out.println("lion attacks");
    }

    @Override
    public void eat() {
        System.out.println("lion eats");

    }

    @Override
    public void walking() {
        System.out.println("lion is walking");
    }
}
/*     This is also a method declaration, but it explicitly uses the abstract keyword.
        However, this is redundant because all methods in an interface are abstract by default.
        Including the abstract keyword does not change the behavior or requirements for this method.*/

abstract class Bird {
    //abstract cannot be instantiated
    abstract void fly();//

    abstract void eat();

    public void sleep() {
        //abstract class can have both abstract and non abstract mehtods
        //this method is not necessary to be implemented
        System.out.println("bird is sleeping");
    }
}

class Sparrow extends Bird {

    //interface ke case meh implement aata hai
    //bird is extract class therefore we need to use extends

    @Override
    void fly() {
        System.out.println("sparrow bird flying");
    }

    @Override
    void eat() {
        System.out.println("sparrow bird eating");

    }
}

public class Main {
    public static void main(String[] args) {
        // Bird b = new Bird();//bird ek abstract hai this cannot be in  instantiated
        Bird bb = new Sparrow();
        bb.fly();
        bb.eat();
        Sparrow s = new Sparrow();

        //  Animal kk = new Animal();
        Animal kk = new Lion();
        //both of abstract class and interface objects cannot be made
    }
}

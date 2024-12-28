package com.example.java8features;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    public void sayHello();//this is functional interface becoz it has only one abstract method
    //public void sayHello(); this is a abstract method //abstract method jiski body nahi hoti

    // public void sayBye();//now it has two abstract methods so this is not a functional interface anymore
    default void sayBye(){}//functional interface can have default method
    public static void sayOk(){}//functional interface can have static method
}

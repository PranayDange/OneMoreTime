package com.example.onemoretimejava.oops.inheritance;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    public Car(String name, String model, int numberOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, numberOfTyres);//this keyword is used to  get/set the values of parent class
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAc() {
        System.out.println("Ac started of " + name);
    }

    //Super Keyword
    //1.Refer to instance of immediate parent
    //2.invokes constructor of immediate parent
    //3.invokes a method of immediate parent

}

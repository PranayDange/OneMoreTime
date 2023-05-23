package com.example.onemoretime.designpattern.creationalpattern.singleton;

public class Principle {
    //constructor is called/invoked when we create object
    //  private String name;

    private static Principle principle;


    private Principle() {
    }

    //lazy way of creating singleton object
    /*public synchronized static Principle getPrinciple() { //method synchronization instead use synchronized block
        //this method will create a object of this class

        //if this new object is created so this can be also called multiple times
        // Student student = new Student();

        if (principle == null) {
            principle = new Principle();
        }


        return principle;
    }*/
    public static Principle getPrinciple() { //method synchronization instead use synchronized block
        //this method will create a object of this class

        //if this new object is created so this can be also called multiple times
        // Student student = new Student();

        if (principle == null) {
            synchronized (Principle.class) {
                if (principle == null) {
                    principle = new Principle();
                }

            }
        }


        return principle;
    }
    /*
     * 1.Constructor should be private
     * 2.create a static method
     * 3.create a static property.
     * 4. this type of initialization is called lazy initialization
     * */
}

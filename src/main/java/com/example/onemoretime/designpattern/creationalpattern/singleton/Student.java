package com.example.onemoretime.designpattern.creationalpattern.singleton;

public class Student {
    //constructor is called/invoked when we create object
    //  private String name;

    private static Student student;


    private Student() {
    }

    //lazy way of creating singleton object
    public static Student getStudent() {
        //this method will create a object of this class

        //if this new object is created so this can be also called multiple times
        // Student student = new Student();

        if (student == null) {
            student = new Student();
        }


        return student;
    }
    /*
     * 1.Constructor should be private
     * 2.create a static method
     * 3.create a static property.
     * 4. this type of initialization is called lazy initialization
     * */
}

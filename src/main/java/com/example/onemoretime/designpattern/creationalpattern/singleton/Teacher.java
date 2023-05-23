package com.example.onemoretime.designpattern.creationalpattern.singleton;

public class Teacher {
    //eager way of creating singleton  object
    private static Teacher teacher = new Teacher();

    // private static Teacher teacher = new Teacher();
    //when class is loaded ....static initialization comes first so new Teacher() this will be initialised
    //and suppose there is no use of this object..still this object is created ....weather you use it or not

    //agar object use nahi kiya ja raha hai phir bhi object create kiya jayenga while class loading

    public static Teacher getTeacher() {
        return teacher;
    }
}

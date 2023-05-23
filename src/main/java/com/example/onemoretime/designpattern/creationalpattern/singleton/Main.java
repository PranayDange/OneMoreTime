package com.example.onemoretime.designpattern.creationalpattern.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //  new Student();
        Student student = Student.getStudent();
        System.out.println(student.hashCode());

        Student student1 = Student.getStudent();
        System.out.println(student1.hashCode());

        Teacher teacher = Teacher.getTeacher();
        System.out.println(teacher.hashCode());

        Teacher teacher1 = Teacher.getTeacher();
        System.out.println(teacher1.hashCode());
    }

}
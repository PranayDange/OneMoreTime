package com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        System.out.println("android developer");
        return "ANDROID DEVELOPER";
    }
}

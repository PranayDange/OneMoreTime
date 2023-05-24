package com.example.onemoretime.designpattern.creationalpattern.factory;

public class AnrodiDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("androd developer 50K");
        return 50000;
    }
}

package com.example.onemoretime.designpattern.creationalpattern.factory;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("web developer 45k");
        return 45000;
    }
}

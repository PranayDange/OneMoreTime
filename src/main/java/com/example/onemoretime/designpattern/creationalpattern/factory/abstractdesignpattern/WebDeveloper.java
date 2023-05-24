package com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("web developer");
        return "WEB DEVELOPER";
    }
}

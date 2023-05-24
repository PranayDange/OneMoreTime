package com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern;

public class WebDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}

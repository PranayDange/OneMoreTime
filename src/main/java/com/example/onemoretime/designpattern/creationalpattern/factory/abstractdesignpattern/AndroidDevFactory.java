package com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern;

public class AndroidDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}

package com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();


    }
}

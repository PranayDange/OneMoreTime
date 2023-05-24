package com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern;

public class ManagerFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}

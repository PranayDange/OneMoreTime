package com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern;

import com.example.onemoretime.designpattern.creationalpattern.factory.abstractdesignpattern.EmployeeFactory;

public class Client {
    public static void main(String[] args) {
        //i want to get android developer
        Employee employee1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee1.name();
        employee1.salary();


        //i want to get web developer
        Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
        employee2.name();
        employee2.salary();

        //i want to get manager
        Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
        employee3.name();
        employee3.salary();
    }
}

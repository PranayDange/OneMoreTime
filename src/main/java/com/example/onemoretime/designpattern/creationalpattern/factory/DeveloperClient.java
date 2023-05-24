package com.example.onemoretime.designpattern.creationalpattern.factory;

public class DeveloperClient {
    public static void main(String[] args) {

        //tightly coupled
        Employee androidDeveloper = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        androidDeveloper.salary();

        Employee employee = EmployeeFactory.getEmployee("WEB DEVELOPER");
        employee.salary();
        System.out.println(employee.salary());
    }
}

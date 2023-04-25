package com.example.onemoretime.serialization;

import java.io.*;


public class Serial {
    public static void main(String[] args) {


        try {
            // create object of student class
            Student st = new Student("pranay", "pranay@gmail.com", 20, "rajura");

            // write data to file using try-with-resources
            try (FileOutputStream fs = new FileOutputStream("ob.txt");
                 ObjectOutputStream oos = new ObjectOutputStream(fs)) {
                // how to serialize
                oos.writeObject(st);
                System.out.println("Object state is transferred to file ob!!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // handle any other exceptions appropriately
        }

    }
}

package com.example.onemoretime.serialization;

import com.amazon.ion.IonException;

import java.io.*;

public class Deserial {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("ob.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student student = (Student) ois.readObject();
            student.displayName();
        } catch (IOException ex) {
            // log the exception or provide a more user-friendly error message
            System.err.println("Error reading serialized data: " + ex.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to deserialize Student object", e);
        }

    }
}

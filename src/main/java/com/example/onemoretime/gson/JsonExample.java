package com.example.onemoretime.gson;


import net.minidev.json.JSONObject;


//mainly this import is used in code level
//import org.json.JSONObject;


public class JsonExample {
    public static void main(String[] args) {
        //creating a json object
        JSONObject jsonObject = new JSONObject();

        //adding key value pairs to jsonObject
        jsonObject.put("name", "pranay");
        jsonObject.put("age", 25);
        jsonObject.put("city", "rajura");

        //converting json object to string
        String jsonString = jsonObject.toString();

        System.out.println(jsonString);
    }
}

package com.example.onemoretime.gson;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonToString {
    public static void main(String[] args) {
       /* {"city":"New York","name":"John Doe","age":30}
        if we are this json then how to particular key value in a string in java*/
        String jsonString = "{\"city\":\"New York\",\"name\":\"John Doe\",\"age\":30}";


        //create a Gson object
        Gson gson = new Gson();

        //parse an json string into a json object
        JsonObject jsonObject = gson.fromJson(jsonString, JsonObject.class);

        //retrive the value of particular key
        String name = jsonObject.get("name").getAsString();


        System.out.println(name);

    }
}

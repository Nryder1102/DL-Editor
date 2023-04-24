package com.dleditor.classes;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

public class Text {
    
    public static ArrayList<JsonObject> createTextList() throws IOException{
        ArrayList<JsonObject> textList = new ArrayList<>();
        String fileName = "src/main/resources/com/dleditor/files/TextLabel.json";

        Gson gson = new Gson();
        //Get full file as a jsonreader
        JsonReader reader = new JsonReader(new FileReader(fileName));
        //Turn the file into a json object
        JsonObject data = gson.fromJson(reader, JsonObject.class);
        //Get specifically the entry for "dict" from data
        JsonObject dict = data.get("dict").getAsJsonObject();
        //Get specifically the entry for "entriesValue" from dict
        JsonObject entries = dict.get("entriesValue").getAsJsonObject();
        //Get the array the contains the characters as a json array from entriesValue
        JsonArray entryArray = entries.get("Array").getAsJsonArray();

        for(JsonElement element : entryArray){
            textList.add(element.getAsJsonObject());
        }
    
        return textList;
    }
}

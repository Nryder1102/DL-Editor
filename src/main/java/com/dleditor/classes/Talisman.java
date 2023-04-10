package com.dleditor.classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.dleditor.Console;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;

public class Talisman {

    private int id;
    private String name;
    private int baseHp;
    private int baseAtk;
    private int talismanCharaId;
    private int sellCoin;

    private static String textFile = "src/main/resources/com/dleditor/files/TextLabel.json";

    public Talisman(){

    }

    public static ArrayList<JsonObject> createTalismanList() throws FileNotFoundException{
        ArrayList<JsonObject> talismanList = new ArrayList<>();
        String fileName = "src/main/resources/com/dleditor/files/TalismanData.json";

        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(fileName));
        JsonObject data = gson.fromJson(reader, JsonObject.class);
        JsonObject dict = data.get("dict").getAsJsonObject();
        JsonObject entries = dict.get("entriesValue").getAsJsonObject();
        JsonArray talismanEntries = entries.get("Array").getAsJsonArray();

        for(JsonElement element : talismanEntries){
            talismanList.add(element.getAsJsonObject());
        }
        
        return talismanList;
    }

    //Getters and setters
    public static int getId(JsonObject element) {
        return element.get("_Id").getAsInt();
    }
    public static void setId(JsonObject element, int id) {
        element.addProperty("_Id", id);
    }
    public static String getName(JsonObject element) {
        String name = element.get("_Name").getAsString();
        try{
            return Console.grabText(textFile, name, 1).split(": ")[1].replace('"',' ').strip();
        }catch(Exception e){
            return "Name not Found";
        }
    }
    //public static void setName(String name) {
    //    this.name = name;
    //}
    public static String getNameId(JsonObject element) {
        return element.get("_Name").getAsString();
    }
    public static void setNameId(JsonObject element, String name) {
        element.addProperty("_Name", name);
    }
    public static int getBaseHp(JsonObject element) {
        return element.get("_BaseHp").getAsInt();
    }
    public static void setBaseHp(JsonObject element, int baseHp) {
        element.addProperty("_BaseHp", baseHp);
    }
    public static int getBaseAtk(JsonObject element) {
        return element.get("_BaseAtk").getAsInt();
    }
    public static void setBaseAtk(JsonObject element, int baseAtk) {
        element.addProperty("_BaseAtk", baseAtk);
    }
    public static int getTalismanCharaId(JsonObject element) {
        return element.get("_TalismanCharaId").getAsInt();
    }
    public static void setTalismanCharaId(JsonObject element, int talismanCharaId) {
        element.addProperty("_TalismanCharaId", talismanCharaId);
    }
    public static int getSellCoin(JsonObject element) {
        return element.get("_SellCoin").getAsInt();
    }
    public static void setSellCoin(JsonObject element, int sellCoin) {
        element.addProperty("_SellCoin", sellCoin);
    }
}

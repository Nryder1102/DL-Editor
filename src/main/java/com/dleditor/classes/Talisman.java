package com.dleditor.classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.dleditor.Console;

public class Talisman {

    private int id;
    private String name;
    private int baseHp;
    private int baseAtk;
    private int talismanCharaId;
    private int sellCoin;

    private String textFile = "src/main/resources/com/dleditor/files/TextLabel.json";

    public Talisman(){

    }

    public Talisman(int id, String name, int baseHp, int baseAtk, int talismanCharaId, int sellCoin) {
        this.id = id;
        this.name = name;
        this.baseHp = baseHp;
        this.baseAtk = baseAtk;
        this.talismanCharaId = talismanCharaId;
        this.sellCoin = sellCoin;
    }

    public static ArrayList<Talisman> createTalismanList(){
        ArrayList<String> tempTalisman = new ArrayList<>();
        ArrayList<Talisman> talismanList = new ArrayList<>();
        String fileName = "src/main/resources/com/dleditor/files/TalismanData.json";
        try {
            ArrayList<String> baseFile = Console.splitFile(fileName,"},");
            boolean firstID = true;
            for(int i = 6; i < baseFile.size(); i++){
                String[] currentLine = baseFile.get(i).split(",");
                for(int k = 0; k < currentLine.length; k++){
                    String[] currentEntry = currentLine[k].split(": ");
                    if(i == 6 && firstID == true){
                        tempTalisman.add(currentEntry[3].strip());
                        firstID = false;
                    }else{
                        tempTalisman.add(currentEntry[1].replace("}","").replace("]","").strip());
                    }
                    }
                if(tempTalisman.size() != 2){
                    Talisman newTalisman = new Talisman(Integer.parseInt(tempTalisman.get(0)),tempTalisman.get(1),Integer.parseInt(tempTalisman.get(2)),Integer.parseInt(tempTalisman.get(3)),Integer.parseInt(tempTalisman.get(4)),Integer.parseInt(tempTalisman.get(5)));
                        talismanList.add(newTalisman);
                }
                tempTalisman = new ArrayList<>();
            }
                
        } catch (FileNotFoundException e) {
            System.out.println("Uh oh, stinky!");
        }
        return talismanList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        try{
            return Console.grabText(textFile, this.name, 1).split(": ")[1].replace('"',' ').strip();
        }catch(Exception e1){
            return "Unknown ID: " + id;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(int baseHp) {
        this.baseHp = baseHp;
    }

    public int getBaseAtk() {
        return baseAtk;
    }

    public void setBaseAtk(int baseAtk) {
        this.baseAtk = baseAtk;
    }

    public int getTalismanCharaId() {
        return talismanCharaId;
    }

    public void setTalismanCharaId(int talismanCharaId) {
        this.talismanCharaId = talismanCharaId;
    }

    public int getSellCoin() {
        return sellCoin;
    }

    public void setSellCoin(int sellCoin) {
        this.sellCoin = sellCoin;
    }

    

    

    
}

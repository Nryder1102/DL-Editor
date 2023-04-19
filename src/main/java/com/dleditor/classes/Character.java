package com.dleditor.classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import com.dleditor.Console;
import com.dleditor.classes.Types.Element;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;
public class Character{

    private static String textFile = "src/main/resources/com/dleditor/files/TextLabel.json";

    public Character(){
        
    }

    public static ArrayList<JsonObject> createCharacterList() throws IOException{
        ArrayList<JsonObject> characterList = new ArrayList<>();
        String fileName = "src/main/resources/com/dleditor/files/CharaData.json";

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
        JsonArray characterEntries = entries.get("Array").getAsJsonArray();

        //For each element in characterEntries, add a new json object to characterList
        //As far as I know, the only way I can do this is through this 
        for(JsonElement element : characterEntries){
            characterList.add(element.getAsJsonObject());
        }
    
        return characterList;
    }

    //Getters and setters, but for the specific JsonObject
    //These should hopefully work
    //They do in theory
    public static int getId(JsonObject element) {
        return element.get("_Id").getAsInt();
    }
    public static void setId(JsonObject element, int id) {
        element.addProperty("_Id", id);
    }
    public static int getBaseId(JsonObject element) {
        return element.get("_BaseId").getAsInt();
    }
    public static void setBaseId(JsonObject element, int baseId) {
        element.addProperty("_BaseId", baseId);
    }
    public static int getVariationId(JsonObject element) {
        return element.get("_VariationId").getAsInt();
    }
    public static void setVariationId(JsonObject element,int variationId) {
        element.addProperty("_VariationId", variationId);
    }
    public static String getName(JsonObject element) {
        String name = element.get("_Name").getAsString();
        try{
            return Console.grabText(textFile, name, 1).split(": ")[1].replace('"',' ').strip();
        }catch(Exception e){
            return "Name not Found";
        }
    }
    //public static void setName(JsonObject element, String name) {
        //this.name = name;
    //}
    public static String getNameId(JsonObject element) {
        return element.get("_Name").getAsString();
    }
    public static void setNameId(JsonObject element, String name) {
        element.addProperty("_Name", name);
    }
    public static String getSecondName(JsonObject element) {
        String secondName = element.get("_SecondName").getAsString();
        try{
            return Console.grabText(textFile, secondName, 1).split(": ")[1].replace('"',' ').strip();
        }catch(Exception e){
            return "Name not Found";
        }
    }
    //public static void setsecondName(JsonObject element, String secondName) {
        //this.secondName = secondName;
    //}
    public static String getSecondNameId(JsonObject element) {
        return element.get("_SecondName").getAsString();
    }
    public static void setSecondNameId(JsonObject element, String secondName) {
        element.addProperty("_SecondName", secondName);
    }
    public static String getFullName(JsonObject element){
        String tempName;
        int id = element.get("_Id").getAsInt();
        String name = element.get("_Name").getAsString();
        String secondName = element.get("_SecondName").getAsString();
        /*Unplayable/Tutorial IDs are these, do something about them:
        Zethia: 19900001
        Leif 1: 19900002
        Yellow Notte: 19900003
        Puppy: 19900004
        Leif 2: 19900005
        Blue Notte: 19900006
        Gunner Cleo: 99900009
        99130001
        99230001
        99330001
        99430001
        99530001
        99630001
        99730001
        99830001
        99930001
        */
        try{
            switch(id){
                case 19900001:{tempName = "Tutorial Zethia";break;}
                case 19900002:{tempName = "Story Leif 1";break;}
                case 19900003:{tempName = "Yellow Notte";break;}
                case 19900004:{tempName = "Puppy";break;}
                case 19900005:{tempName = "Story Leif 2";break;}
                case 19900006:{tempName = "Blue Notte";break;}
                case 99900009:{tempName = "Gunner Cleo";break;}
                case 99130001:{tempName = "Unplayable ID: " + id;break;}
                case 99230001:{tempName = "Unplayable ID: " + id;break;}
                case 99330001:{tempName = "Unplayable ID: " + id;break;}
                case 99430001:{tempName = "Unplayable ID: " + id;break;}
                case 99530001:{tempName = "Unplayable ID: " + id;break;}
                case 99630001:{tempName = "Unplayable ID: " + id;break;}
                case 99730001:{tempName = "Unplayable ID: " + id;break;}
                case 99830001:{tempName = "Unplayable ID: " + id;break;}
                case 99930001:{tempName = "Unplayable ID: " + id;break;}
                default :{tempName = Console.grabText(textFile, secondName, 1).split(": ")[1].replace('"',' ').strip();break;}
            }
        }catch(Exception e){
            try{
                tempName = Console.grabText(textFile, name, 1).split(": ")[1].replace('"',' ').strip();
            }catch(Exception e1){
                tempName = "Unknown ID: " + id;
            }
        }

        return tempName;

    }
    public static int getEmblemId(JsonObject element) {
        return element.get("_EmblemId").getAsInt();
    }
    public static void setEmblemId(JsonObject element, int emblemId) {
        element.addProperty("_EmblemId",emblemId);
    }
    public static String getEpithet(JsonObject element){
        String epithet = "EMBLEM_NAME_"+getEmblemId(element);
        try{
            return Console.grabText(textFile, epithet, 1).split(": ")[1].replace('"',' ').strip();
        }catch(Exception e){
            return "Epithet not Found";
        }
    }
    public static String getWeaponType(JsonObject element) {
        return Types.getWeapon(element.get("_WeaponType").getAsInt());
    }
    public static void setWeaponType(JsonObject element, int weaponType) {
        element.addProperty("_WeaponType", weaponType);
    }
    public static String getElementalType(JsonObject element) {
        return Types.getElement(element.get("_ElementalType").getAsInt());
    }
    public static void setElementalType(JsonObject element, int elementalType) {
        element.addProperty("_ElementalType", elementalType);
    }
    public static String getCharaType(JsonObject element) {
        return Types.getRole(element.get("_CharaType").getAsInt());
    }
    public static void setCharaType(JsonObject element, int charaType) {
        element.addProperty("_CharaType", charaType);
    }
    public static int getRarity(JsonObject element) {
        return element.get("_Rarity").getAsInt();
    }
    public static void setRarity(JsonObject element, int rarity) {
        element.addProperty("_Rarity",rarity);
    }
    //I'll deal with these later
/*    public static int getMaxLimitBreakCount(JsonObject element) {
        return element.get() maxLimitBreakCount;
    }
    public static void setMaxLimitBreakCount(JsonObject element, int maxLimitBreakCount) {
        this.maxLimitBreakCount = maxLimitBreakCount;
    }
    public static int getMinHp3(JsonObject element) {
        return element.get() minHp3;
    }

    public static void setMinHp3(JsonObject element, int minHp3) {
        this.minHp3 = minHp3;
    }
    public static int getMinHp4(JsonObject element) {
        return element.get() minHp4;
    }
    public static void setMinHp4(JsonObject element, int minHp4) {
        this.minHp4 = minHp4;
    }
    public static int getMinHp5(JsonObject element) {
        return element.get() minHp5;
    }
    public static void setMinHp5(JsonObject element, int minHp5) {
        this.minHp5 = minHp5;
    }
    public static int getMaxHp(JsonObject element) {
        return element.get() maxHp;
    }
    public static void setMaxHp(JsonObject element, int maxHp) {
        this.maxHp = maxHp;
    }
    public static int getAddMaxHp1(JsonObject element) {
        return element.get() addMaxHp1;
    }
    public static void setAddMaxHp1(JsonObject element, int addMaxHp1) {
        this.addMaxHp1 = addMaxHp1;
    }
    public static int getPlusHp0(JsonObject element) {
        return element.get() plusHp0;
    }
    public static void setPlusHp0(JsonObject element, int plusHp0) {
        this.plusHp0 = plusHp0;
    }
    public static int getPlusHp1(JsonObject element) {
        return element.get() plusHp1;
    }
    public static void setPlusHp1(JsonObject element, int plusHp1) {
        this.plusHp1 = plusHp1;
    }
    public static int getPlusHp2(JsonObject element) {
        return element.get() plusHp2;
    }
    public static void setPlusHp2(JsonObject element, int plusHp2) {
        this.plusHp2 = plusHp2;
    }
    public static int getPlusHp3(JsonObject element) {
        return element.get() plusHp3;
    }
    public static void setPlusHp3(JsonObject element, int plusHp3) {
        this.plusHp3 = plusHp3;
    }
    public static int getPlusHp4(JsonObject element) {
        return element.get() plusHp4;
    }
    public static void setPlusHp4(JsonObject element, int plusHp4) {
        this.plusHp4 = plusHp4;
    }
    public static int getPlusHp5(JsonObject element) {
        return element.get() plusHp5;
    }
    public static void setPlusHp5(JsonObject element, int plusHp5) {
        this.plusHp5 = plusHp5;
    }
    public static int getMcFullBonusHp5(JsonObject element) {
        return element.get() mcFullBonusHp5;
    }
    public static void setMcFullBonusHp5(JsonObject element, int mcFullBonusHp5) {
        this.mcFullBonusHp5 = mcFullBonusHp5;
    }
    public static int getMinAtk3(JsonObject element) {
        return element.get() minAtk3;
    }
    public static void setMinAtk3(JsonObject element, int minAtk3) {
        this.minAtk3 = minAtk3;
    }
    public static int getMinAtk4(JsonObject element) {
        return element.get() minAtk4;
    }
    public static void setMinAtk4(JsonObject element, int minAtk4) {
        this.minAtk4 = minAtk4;
    }
    public static int getMinAtk5(JsonObject element) {
        return element.get() minAtk5;
    }
    public static void setMinAtk5(JsonObject element, int minAtk5) {
        this.minAtk5 = minAtk5;
    }
    public static int getMaxAtk(JsonObject element) {
        return element.get() maxAtk;
    }
    public static void setMaxAtk(JsonObject element, int maxAtk) {
        this.maxAtk = maxAtk;
    }
    public static int getAddMaxAtk1(JsonObject element) {
        return element.get() addMaxAtk1;
    }
    public static void setAddMaxAtk1(JsonObject element, int addMaxAtk1) {
        this.addMaxAtk1 = addMaxAtk1;
    }
    public static int getPlusAtk0(JsonObject element) {
        return element.get() plusAtk0;
    }
    public static void setPlusAtk0(JsonObject element, int plusAtk0) {
        this.plusAtk0 = plusAtk0;
    }
    public static int getPlusAtk1(JsonObject element) {
        return element.get() plusAtk1;
    }
    public static void setPlusAtk1(JsonObject element, int plusAtk1) {
        this.plusAtk1 = plusAtk1;
    }
    public static int getPlusAtk2(JsonObject element) {
        return element.get() plusAtk2;
    }
    public static void setPlusAtk2(JsonObject element, int plusAtk2) {
        this.plusAtk2 = plusAtk2;
    }
    public static int getPlusAtk3(JsonObject element) {
        return element.get() plusAtk3;
    }
    public static void setPlusAtk3(JsonObject element, int plusAtk3) {
        this.plusAtk3 = plusAtk3;
    }
    public static int getPlusAtk4(JsonObject element) {
        return element.get() plusAtk4;
    }
    public static void setPlusAtk4(JsonObject element, int plusAtk4) {
        this.plusAtk4 = plusAtk4;
    }
    public static int getPlusAtk5(JsonObject element) {
        return element.get() plusAtk5;
    }
    public static void setPlusAtk5(JsonObject element, int plusAtk5) {
        this.plusAtk5 = plusAtk5;
    }
    public static int getMcFullBonusAtk5(JsonObject element) {
        return element.get() mcFullBonusAtk5;
    }
    public static void setMcFullBonusAtk5(JsonObject element, int mcFullBonusAtk5) {
        this.mcFullBonusAtk5 = mcFullBonusAtk5;
    }
    public static int getMinDef(JsonObject element) {
        return element.get() minDef;
    }
    public static void setMinDef(JsonObject element, int minDef) {
        this.minDef = minDef;
    }
    public static double getDefCoef(JsonObject element) {
        return element.get() defCoef;
    }
    public static void setDefCoef(double defCoef) {
        this.defCoef = defCoef;
    }
    public static int getModeChangeType(JsonObject element) {
        return element.get() modeChangeType;
    }
    public static void setModeChangeType(JsonObject element, int modeChangeType) {
        this.modeChangeType = modeChangeType;
    }
    public static int getModeId1(JsonObject element) {
        return element.get() modeId1;
    }
    public static void setModeId1(JsonObject element, int modeId1) {
        this.modeId1 = modeId1;
    }
    public static int getModeId2(JsonObject element) {
        return element.get() modeId2;
    }
    public static void setModeId2(JsonObject element, int modeId2) {
        this.modeId2 = modeId2;
    }
    public static int getModeId3(JsonObject element) {
        return element.get() modeId3;
    }
    public static void setModeId3(JsonObject element, int modeId3) {
        this.modeId3 = modeId3;
    }
    public static int getModeId4(JsonObject element) {
        return element.get() modeId4;
    }
    public static void setModeId4(JsonObject element, int modeId4) {
        this.modeId4 = modeId4;
    }
    public static int getKeepModeOnRevive(JsonObject element) {
        return element.get() keepModeOnRevive;
    }
    public static void setKeepModeOnRevive(JsonObject element, int keepModeOnRevive) {
        this.keepModeOnRevive = keepModeOnRevive;
    }
    public static int getOriginCombo(JsonObject element) {
        return element.get() originCombo;
    }
    public static void setOriginCombo(JsonObject element, int originCombo) {
        this.originCombo = originCombo;
    }
    public static int getMode1Combo(JsonObject element) {
        return element.get() mode1Combo;
    }
    public static void setMode1Combo(JsonObject element, int mode1Combo) {
        this.mode1Combo = mode1Combo;
    }
    public static int getMode2Combo(JsonObject element) {
        return element.get() mode2Combo;
    }
    public static void setMode2Combo(JsonObject element, int mode2Combo) {
        this.mode2Combo = mode2Combo;
    }
    public static double getSearchRange(JsonObject element) {
        return element.get() searchRange;
    }
    public static void setSearchRange(double searchRange) {
        this.searchRange = searchRange;
    }
    public static double getSearchAngle(JsonObject element) {
        return element.get() searchAngle;
    }
    public static void setSearchAngle(double searchAngle) {
        this.searchAngle = searchAngle;
    }
    public static int getAttackRangeType(JsonObject element) {
        return element.get() attackRangeType;
    }
    public static void setAttackRangeType(JsonObject element, int attackRangeType) {
        this.attackRangeType = attackRangeType;
    }
    public static int getBurstAttack(JsonObject element) {
        return element.get() burstAttack;
    }
    public static void setBurstAttack(JsonObject element, int burstAttack) {
        this.burstAttack = burstAttack;
    }
    public static int getDashAttack(JsonObject element) {
        return element.get() dashAttack;
    }
    public static void setDashAttack(JsonObject element, int dashAttack) {
        this.dashAttack = dashAttack;
    }
    public static int getAvoid(JsonObject element) {
        return element.get() avoid;
    }
    public static void setAvoid(JsonObject element, int avoid) {
        this.avoid = avoid;
    }
    public static int getAvoidOnCombo(JsonObject element) {
        return element.get() avoidOnCombo;
    }
    public static void setAvoidOnCombo(JsonObject element, int avoidOnCombo) {
        this.avoidOnCombo = avoidOnCombo;
    }
    public static int getBackAvoidOnCombo(JsonObject element) {
        return element.get() backAvoidOnCombo;
    }
    public static void setBackAvoidOnCombo(JsonObject element, int backAvoidOnCombo) {
        this.backAvoidOnCombo = backAvoidOnCombo;
    }
    public static int getGuts(JsonObject element) {
        return element.get() guts;
    }
    public static void setGuts(JsonObject element, int guts) {
        this.guts = guts;
    }
    public static int getAppear(JsonObject element) {
        return element.get() appear;
    }
    public static void setAppear(JsonObject element, int appear) {
        this.appear = appear;
    }
    public static int getRevive(JsonObject element) {
        return element.get() revive;
    }
    public static void setRevive(JsonObject element, int revive) {
        this.revive = revive;
    }
    public static int getDisappear(JsonObject element) {
        return element.get() disappear;
    }
    public static void setDisappear(JsonObject element, int disappear) {
        this.disappear = disappear;
    }
    public static int getWin(JsonObject element) {
        return element.get() win;
    }
    public static void setWin(JsonObject element, int win) {
        this.win = win;
    }
    public static String getEffNameCriticalHit(JsonObject element) {
        return element.get() effNameCriticalHit;
    }
    public static void setEffNameCriticalHit(String effNameCriticalHit) {
        this.effNameCriticalHit = effNameCriticalHit;
    }
    public static int getSkill1(JsonObject element) {
        return element.get() skill1;
    }
    public static void setSkill1(JsonObject element, int skill1) {
        this.skill1 = skill1;
    }
    public static int getSkill2(JsonObject element) {
        return element.get() skill2;
    }
    public static void setSkill2(JsonObject element, int skill2) {
        this.skill2 = skill2;
    }
    public static double getSkillChainValidTime(JsonObject element) {
        return element.get() skillChainValidTime;
    }
    public static void setSkillChainValidTime(double skillChainValidTime) {
        this.skillChainValidTime = skillChainValidTime;
    }
    public static int getSkillChainSpbarCount(JsonObject element) {
        return element.get() skillChainSpbarCount;
    }
    public static void setSkillChainSpbarCount(JsonObject element, int skillChainSpbarCount) {
        this.skillChainSpbarCount = skillChainSpbarCount;
    }
    public static int getSupportSkillNum(JsonObject element) {
        return element.get() supportSkillNum;
    }
    public static void setSupportSkillNum(JsonObject element, int supportSkillNum) {
        this.supportSkillNum = supportSkillNum;
    }
    public static int getAbilities11(JsonObject element) {
        return element.get() abilities11;
    }
    public static void setAbilities11(JsonObject element, int abilities11) {
        this.abilities11 = abilities11;
    }
    public static int getAbilities12(JsonObject element) {
        return element.get() abilities12;
    }
    public static void setAbilities12(JsonObject element, int abilities12) {
        this.abilities12 = abilities12;
    }
    public static int getAbilities13(JsonObject element) {
        return element.get() abilities13;
    }
    public static void setAbilities13(JsonObject element, int abilities13) {
        this.abilities13 = abilities13;
    }
    public static int getAbilities14(JsonObject element) {
        return element.get() abilities14;
    }
    public static void setAbilities14(JsonObject element, int abilities14) {
        this.abilities14 = abilities14;
    }
    public static int getAbilities21(JsonObject element) {
        return element.get() abilities21;
    }
    public static void setAbilities21(JsonObject element, int abilities21) {
        this.abilities21 = abilities21;
    }
    public static int getAbilities22(JsonObject element) {
        return element.get() abilities22;
    }
    public static void setAbilities22(JsonObject element, int abilities22) {
        this.abilities22 = abilities22;
    }
    public static int getAbilities23(JsonObject element) {
        return element.get() abilities23;
    }
    public static void setAbilities23(JsonObject element, int abilities23) {
        this.abilities23 = abilities23;
    }
    public static int getAbilities24(JsonObject element) {
        return element.get() abilities24;
    }
    public static void setAbilities24(JsonObject element, int abilities24) {
        this.abilities24 = abilities24;
    }
    public static int getAbilities31(JsonObject element) {
        return element.get() abilities31;
    }
    public static void setAbilities31(JsonObject element, int abilities31) {
        this.abilities31 = abilities31;
    }
    public static int getAbilities32(JsonObject element) {
        return element.get() abilities32;
    }
    public static void setAbilities32(JsonObject element, int abilities32) {
        this.abilities32 = abilities32;
    }
    public static int getAbilities33(JsonObject element) {
        return element.get() abilities33;
    }
    public static void setAbilities33(JsonObject element, int abilities33) {
        this.abilities33 = abilities33;
    }
    public static int getAbilities34(JsonObject element) {
        return element.get() abilities34;
    }
    public static void setAbilities34(JsonObject element, int abilities34) {
        this.abilities34 = abilities34;
    }
    public static int getExAbilityData1(JsonObject element) {
        return element.get() exAbilityData1;
    }
    public static void setExAbilityData1(JsonObject element, int exAbilityData1) {
        this.exAbilityData1 = exAbilityData1;
    }
    public static int getExAbilityData2(JsonObject element) {
        return element.get() exAbilityData2;
    }
    public static void setExAbilityData2(JsonObject element, int exAbilityData2) {
        this.exAbilityData2 = exAbilityData2;
    }
    public static int getExAbilityData3(JsonObject element) {
        return element.get() exAbilityData3;
    }
    public static void setExAbilityData3(JsonObject element, int exAbilityData3) {
        this.exAbilityData3 = exAbilityData3;
    }
    public static int getExAbilityData4(JsonObject element) {
        return element.get() exAbilityData4;
    }
    public static void setExAbilityData4(JsonObject element, int exAbilityData4) {
        this.exAbilityData4 = exAbilityData4;
    }
    public static int getExAbilityData5(JsonObject element) {
        return element.get() exAbilityData5;
    }
    public static void setExAbilityData5(JsonObject element, int exAbilityData5) {
        this.exAbilityData5 = exAbilityData5;
    }
    public static int getExAbility2Data1(JsonObject element) {
        return element.get() exAbility2Data1;
    }
    public static void setExAbility2Data1(JsonObject element, int exAbility2Data1) {
        this.exAbility2Data1 = exAbility2Data1;
    }
    public static int getExAbility2Data2(JsonObject element) {
        return element.get() exAbility2Data2;
    }
    public static void setExAbility2Data2(JsonObject element, int exAbility2Data2) {
        this.exAbility2Data2 = exAbility2Data2;
    }
    public static int getExAbility2Data3(JsonObject element) {
        return element.get() exAbility2Data3;
    }
    public static void setExAbility2Data3(JsonObject element, int exAbility2Data3) {
        this.exAbility2Data3 = exAbility2Data3;
    }
    public static int getExAbility2Data4(JsonObject element) {
        return element.get() exAbility2Data4;
    }
    public static void setExAbility2Data4(JsonObject element, int exAbility2Data4) {
        this.exAbility2Data4 = exAbility2Data4;
    }
    public static int getExAbility2Data5(JsonObject element) {
        return element.get() exAbility2Data5;
    }
    public static void setExAbility2Data5(JsonObject element, int exAbility2Data5) {
        this.exAbility2Data5 = exAbility2Data5;
    }
    public static int getChargeType(JsonObject element) {
        return element.get() chargeType;
    }
    public static void setChargeType(JsonObject element, int chargeType) {
        this.chargeType = chargeType;
    }
    public static int getMaxChargeLv(JsonObject element) {
        return element.get() maxChargeLv;
    }
    public static void setMaxChargeLv(JsonObject element, int maxChargeLv) {
        this.maxChargeLv = maxChargeLv;
    }
    public static int getOnChangeBADuringCharge(JsonObject element) {
        return element.get() onChangeBADuringCharge;
    }
    public static void setOnChangeBADuringCharge(JsonObject element, int onChangeBADuringCharge) {
        this.onChangeBADuringCharge = onChangeBADuringCharge;
    }
    public static int getHoldEditSkillCost(JsonObject element) {
        return element.get() holdEditSkillCost;
    }
    public static void setHoldEditSkillCost(JsonObject element, int holdEditSkillCost) {
        this.holdEditSkillCost = holdEditSkillCost;
    }
    public static int getEditSkillId(JsonObject element) {
        return element.get() editSkillId;
    }
    public static void setEditSkillId(JsonObject element, int editSkillId) {
        this.editSkillId = editSkillId;
    }
    public static int getEditSkillLevelNum(JsonObject element) {
        return element.get() editSkillLevelNum;
    }
    public static void setEditSkillLevelNum(JsonObject element, int editSkillLevelNum) {
        this.editSkillLevelNum = editSkillLevelNum;
    }
    public static int getEditSkillCost(JsonObject element) {
        return element.get() editSkillCost;
    }
    public static void setEditSkillCost(JsonObject element, int editSkillCost) {
        this.editSkillCost = editSkillCost;
    }
    public static int getEditSkillRelationId(JsonObject element) {
        return element.get() editSkillRelationId;
    }
    public static void setEditSkillRelationId(JsonObject element, int editSkillRelationId) {
        this.editSkillRelationId = editSkillRelationId;
    }
    public static int getEditReleaseEntityType1(JsonObject element) {
        return element.get() editReleaseEntityType1;
    }
    public static void setEditReleaseEntityType1(JsonObject element, int editReleaseEntityType1) {
        this.editReleaseEntityType1 = editReleaseEntityType1;
    }
    public static int getEditReleaseEntityId1(JsonObject element) {
        return element.get() editReleaseEntityId1;
    }
    public static void setEditReleaseEntityId1(JsonObject element, int editReleaseEntityId1) {
        this.editReleaseEntityId1 = editReleaseEntityId1;
    }
    public static int getEditReleaseEntityQuantity1(JsonObject element) {
        return element.get() editReleaseEntityQuantity1;
    }
    public static void setEditReleaseEntityQuantity1(JsonObject element, int editReleaseEntityQuantity1) {
        this.editReleaseEntityQuantity1 = editReleaseEntityQuantity1;
    }
    public static int getIsUnuseDmodeEditSkill(JsonObject element) {
        return element.get() isUnuseDmodeEditSkill;
    }
    public static void setIsUnuseDmodeEditSkill(JsonObject element, int isUnuseDmodeEditSkill) {
        this.isUnuseDmodeEditSkill = isUnuseDmodeEditSkill;
    }*/
    public static String getManaCircleName(JsonObject element) {
        return element.get("_ManaCircleName").getAsString();
    }
    public static void setManaCircleName(JsonObject element, String manaCircleName) {
        element.addProperty("_ManaCircleName", manaCircleName);
    }
    public static int getCharaLimitBreak(JsonObject element) {
        return element.get("_CharaLimitBreak").getAsInt();
    }
    public static void setCharaLimitBreak(JsonObject element, int charaLimitBreak) {
        element.addProperty("_CharaLimitBreak", charaLimitBreak);
    }
    public static int getPieceElementGroupId(JsonObject element) {
        return element.get("_PieceElementGroupId").getAsInt();
    }
    public static void setPieceElementGroupId(JsonObject element, int pieceElementGroupId) {
        element.addProperty("_PieceElementGroupId", pieceElementGroupId);
    }
    public static int getPieceMaterialElementId(JsonObject element) {
        return element.get("_PieceMaterialElementId").getAsInt();
    }
    public static void setPieceMaterialElementId(JsonObject element, int pieceMaterialElementId) {
        element.addProperty("_PieceMaterialElementId", pieceMaterialElementId);
    }/*
    public static int getAwakeNeedEntityType4(JsonObject element) {
        return element.get() awakeNeedEntityType4;
    }
    public static void setAwakeNeedEntityType4(JsonObject element, int awakeNeedEntityType4) {
        this.awakeNeedEntityType4 = awakeNeedEntityType4;
    }
    public static int getAwakeNeedEntityId4(JsonObject element) {
        return element.get() awakeNeedEntityId4;
    }
    public static void setAwakeNeedEntityId4(JsonObject element, int awakeNeedEntityId4) {
        this.awakeNeedEntityId4 = awakeNeedEntityId4;
    }
    public static int getAwakeNeedEntityQuantity4(JsonObject element) {
        return element.get() awakeNeedEntityQuantity4;
    }
    public static void setAwakeNeedEntityQuantity4(JsonObject element, int awakeNeedEntityQuantity4) {
        this.awakeNeedEntityQuantity4 = awakeNeedEntityQuantity4;
    }
    public static int getAwakeNeedEntityType5(JsonObject element) {
        return element.get() awakeNeedEntityType5;
    }
    public static void setAwakeNeedEntityType5(JsonObject element, int awakeNeedEntityType5) {
        this.awakeNeedEntityType5 = awakeNeedEntityType5;
    }
    public static int getAwakeNeedEntityId5(JsonObject element) {
        return element.get() awakeNeedEntityId5;
    }
    public static void setAwakeNeedEntityId5(JsonObject element, int awakeNeedEntityId5) {
        this.awakeNeedEntityId5 = awakeNeedEntityId5;
    }
    public static int getAwakeNeedEntityQuantity5(JsonObject element) {
        return element.get() awakeNeedEntityQuantity5;
    }
    public static void setAwakeNeedEntityQuantity5(JsonObject element, int awakeNeedEntityQuantity5) {
        this.awakeNeedEntityQuantity5 = awakeNeedEntityQuantity5;
    }*/
    public static String getCvInfo(JsonObject element) {
        String cvInfo = element.get("_CvInfo").getAsString();
        try{
            return Console.grabText(textFile, cvInfo, 1).split(": ")[1].replace('"',' ').strip();
        }catch(Exception e){
            return "Name not Found";
        }
    }
    //public static void setCvInfo(JsonObject element, String cvInfo) {
    //    this.cvInfo = cvInfo;
    //}
    public static String getCvInfoEn(JsonObject element) {
        String cvInfoEn = element.get("_CvInfoEn").getAsString();
        try{
            return Console.grabText(textFile, cvInfoEn, 1).split(": ")[1].replace('"',' ').strip();
        }catch(Exception e){
            return "Name not Found";
        }
    }
    //public static void setCvInfoEn(JsonObject element, String cvInfoEn) {
    //    this.cvInfoEn = cvInfoEn;
    //}
    public static String getCvInfoID(JsonObject element) {
        return element.get("_CvInfo").getAsString();
    }
    public static void setCvInfoID(JsonObject element, String cvInfo) {
        element.addProperty("_CvInfo", cvInfo);
    }
    public static String getCvInfoEnID(JsonObject element) {
        return element.get("_CvInfoEn").getAsString();
    }
    public static void setCvInfoEnID(JsonObject element, String cvInfoEn) {
        element.addProperty("_CvInfoEn", cvInfoEn);
    }
    /*
    public static String getProfileText(JsonObject element) {
        return element.get() profileText;
    }
    public static void setProfileText(String profileText) {
        this.profileText = profileText;
    }
    public static String getReleaseStartDate(JsonObject element) {
        return element.get() releaseStartDate;
    }
    public static void setReleaseStartDate(String releaseStartDate) {
        this.releaseStartDate = releaseStartDate;
    }
    public static int getIsViewSummonScene(JsonObject element) {
        return element.get() isViewSummonScene;
    }
    public static void setIsViewSummonScene(JsonObject element, int isViewSummonScene) {
        this.isViewSummonScene = isViewSummonScene;
    }
    public static int getMotionType(JsonObject element) {
        return element.get() motionType;
    }
    public static void setMotionType(JsonObject element, int motionType) {
        this.motionType = motionType;
    }
    public static int getPersonMotionType(JsonObject element) {
        return element.get() personMotionType;
    }
    public static void setPersonMotionType(JsonObject element, int personMotionType) {
        this.personMotionType = personMotionType;
    }
    public static int getIsDetailimage(JsonObject element) {
        return element.get() isDetailimage;
    }
    public static void setIsDetailimage(JsonObject element, int isDetailimage) {
        this.isDetailimage = isDetailimage;
    }
    public static int getVoiceType(JsonObject element) {
        return element.get() voiceType;
    }
    public static void setVoiceType(JsonObject element, int voiceType) {
        this.voiceType = voiceType;
    }
    public static int getSeasonVoiceId(JsonObject element) {
        return element.get() seasonVoiceId;
    }
    public static void setSeasonVoiceId(JsonObject element, int seasonVoiceId) {
        this.seasonVoiceId = seasonVoiceId;
    }
    public static int getSpecialOndamageVoice(JsonObject element) {
        return element.get() specialOndamageVoice;
    }
    public static void setSpecialOndamageVoice(JsonObject element, int specialOndamageVoice) {
        this.specialOndamageVoice = specialOndamageVoice;
    }
    public static double getBaseScale(JsonObject element) {
        return element.get() baseScale;
    }
    public static void setBaseScale(double baseScale) {
        this.baseScale = baseScale;
    }
    public static int getUniqueWeaponId(JsonObject element) {
        return element.get() uniqueWeaponId;
    }
    public static void setUniqueWeaponId(JsonObject element, int uniqueWeaponId) {
        this.uniqueWeaponId = uniqueWeaponId;
    }
    public static int getUniqueWeaponSkinId(JsonObject element) {
        return element.get() uniqueWeaponSkinId;
    }
    public static void setUniqueWeaponSkinId(JsonObject element, int uniqueWeaponSkinId) {
        this.uniqueWeaponSkinId = uniqueWeaponSkinId;
    }
    public static int getAttachWeaponHandType(JsonObject element) {
        return element.get() attachWeaponHandType;
    }
    public static void setAttachWeaponHandType(JsonObject element, int attachWeaponHandType) {
        this.attachWeaponHandType = attachWeaponHandType;
    }
    public static int getWinFaceEyeMotion(JsonObject element) {
        return element.get() winFaceEyeMotion;
    }
    public static void setWinFaceEyeMotion(JsonObject element, int winFaceEyeMotion) {
        this.winFaceEyeMotion = winFaceEyeMotion;
    }
    public static int getWinFaceMouthMotion(JsonObject element) {
        return element.get() winFaceMouthMotion;
    }
    public static void setWinFaceMouthMotion(JsonObject element, int winFaceMouthMotion) {
        this.winFaceMouthMotion = winFaceMouthMotion;
    }
    public static int getUniqueDragonId(JsonObject element) {
        return element.get() uniqueDragonId;
    }
    public static void setUniqueDragonId(JsonObject element, int uniqueDragonId) {
        this.uniqueDragonId = uniqueDragonId;
    }
    public static int getIsConvertDragonSkillLevel(JsonObject element) {
        return element.get() isConvertDragonSkillLevel;
    }
    public static void setIsConvertDragonSkillLevel(JsonObject element, int isConvertDragonSkillLevel) {
        this.isConvertDragonSkillLevel = isConvertDragonSkillLevel;
    }
    public static int getIsEnhanceChara(JsonObject element) {
        return element.get() isEnhanceChara;
    }
    public static void setIsEnhanceChara(JsonObject element, int isEnhanceChara) {
        this.isEnhanceChara = isEnhanceChara;
    }
    public static int getIsPlayable(JsonObject element) {
        return element.get() isPlayable;
    }
    public static void setIsPlayable(JsonObject element, int isPlayable) {
        this.isPlayable = isPlayable;
    }
    public static int getDefaultAbility1Level(JsonObject element) {
        return element.get() defaultAbility1Level;
    }
    public static void setDefaultAbility1Level(JsonObject element, int defaultAbility1Level) {
        this.defaultAbility1Level = defaultAbility1Level;
    }
    public static int getDefaultAbility2Level(JsonObject element) {
        return element.get() defaultAbility2Level;
    }
    public static void setDefaultAbility2Level(JsonObject element, int defaultAbility2Level) {
        this.defaultAbility2Level = defaultAbility2Level;
    }
    public static int getDefaultAbility3Level(JsonObject element) {
        return element.get() defaultAbility3Level;
    }
    public static void setDefaultAbility3Level(JsonObject element, int defaultAbility3Level) {
        this.defaultAbility3Level = defaultAbility3Level;
    }
    public static int getDefaultBurstAttackLevel(JsonObject element) {
        return element.get() defaultBurstAttackLevel;
    }
    public static void setDefaultBurstAttackLevel(JsonObject element, int defaultBurstAttackLevel) {
        this.defaultBurstAttackLevel = defaultBurstAttackLevel;
    }
    public static int getDefaultIsUnlockEditSkill(JsonObject element) {
        return element.get() defaultIsUnlockEditSkill;
    }
    public static void setDefaultIsUnlockEditSkill(JsonObject element, int defaultIsUnlockEditSkill) {
        this.defaultIsUnlockEditSkill = defaultIsUnlockEditSkill;
    }
    public static int getUniqueGrowMaterialId1(JsonObject element) {
        return element.get() uniqueGrowMaterialId1;
    }
    public static void setUniqueGrowMaterialId1(JsonObject element, int uniqueGrowMaterialId1) {
        this.uniqueGrowMaterialId1 = uniqueGrowMaterialId1;
    }
    public static int getUniqueGrowMaterialId2(JsonObject element) {
        return element.get() uniqueGrowMaterialId2;
    }
    public static void setUniqueGrowMaterialId2(JsonObject element, int uniqueGrowMaterialId2) {
        this.uniqueGrowMaterialId2 = uniqueGrowMaterialId2;
    }
    public static int getMaxFriendshipPoint(JsonObject element) {
        return element.get("_MaxFriendshipPoint").getAsInt();
    }
    public static void setMaxFriendshipPoint(JsonObject element, int maxFriendshipPoint) {
        this.maxFriendshipPoint = maxFriendshipPoint;
    }
    public static String getGrowMaterialOnlyStartDate(JsonObject element) {
        return element.get() growMaterialOnlyStartDate;
    }
    public static void setGrowMaterialOnlyStartDate(String growMaterialOnlyStartDate) {
        this.growMaterialOnlyStartDate = growMaterialOnlyStartDate;
    }
    public static String getGrowMaterialOnlyEndDate(JsonObject element) {
        return element.get() growMaterialOnlyEndDate;
    }
    public static void setGrowMaterialOnlyEndDate(String growMaterialOnlyEndDate) {
        this.growMaterialOnlyEndDate = growMaterialOnlyEndDate;
    }
    public static int getGrowMaterialId(JsonObject element) {
        return element.get() growMaterialId;
    }
    public static void setGrowMaterialId(JsonObject element, int growMaterialId) {
        this.growMaterialId = growMaterialId;
    }
    public static int getDmodeLevelGroupId(JsonObject element) {
        return element.get() dmodeLevelGroupId;
    }
    public static void setDmodeLevelGroupId(JsonObject element, int dmodeLevelGroupId) {
        this.dmodeLevelGroupId = dmodeLevelGroupId;
    }
    public static int getMcFullReleaseEntityType1(JsonObject element) {
        return element.get() mcFullReleaseEntityType1;
    }
    public static void setMcFullReleaseEntityType1(JsonObject element, int mcFullReleaseEntityType1) {
        this.mcFullReleaseEntityType1 = mcFullReleaseEntityType1;
    }
    public static int getMcFullReleaseEntityId1(JsonObject element) {
        return element.get() mcFullReleaseEntityId1;
    }
    public static void setMcFullReleaseEntityId1(JsonObject element, int mcFullReleaseEntityId1) {
        this.mcFullReleaseEntityId1 = mcFullReleaseEntityId1;
    }
    public static int getMcFullReleaseEntityQuantity1(JsonObject element) {
        return element.get() mcFullReleaseEntityQuantity1;
    }
    public static void setMcFullReleaseEntityQuantity1(JsonObject element, int mcFullReleaseEntityQuantity1) {
        this.mcFullReleaseEntityQuantity1 = mcFullReleaseEntityQuantity1;
    }
    public static int getMcFullReleaseEntityType2(JsonObject element) {
        return element.get() mcFullReleaseEntityType2;
    }
    public static void setMcFullReleaseEntityType2(JsonObject element, int mcFullReleaseEntityType2) {
        this.mcFullReleaseEntityType2 = mcFullReleaseEntityType2;
    }
    public static int getMcFullReleaseEntityId2(JsonObject element) {
        return element.get() mcFullReleaseEntityId2;
    }
    public static void setMcFullReleaseEntityId2(JsonObject element, int mcFullReleaseEntityId2) {
        this.mcFullReleaseEntityId2 = mcFullReleaseEntityId2;
    }
    public static int getMcFullReleaseEntityQuantity2(JsonObject element) {
        return element.get() mcFullReleaseEntityQuantity2;
    }
    public static void setMcFullReleaseEntityQuantity2(JsonObject element, int mcFullReleaseEntityQuantity2) {
        this.mcFullReleaseEntityQuantity2 = mcFullReleaseEntityQuantity2;
    }
    public static int getBaseAuraMaxLimitLevel(JsonObject element) {
        return element.get() baseAuraMaxLimitLevel;
    }
    public static void setBaseAuraMaxLimitLevel(JsonObject element, int baseAuraMaxLimitLevel) {
        this.baseAuraMaxLimitLevel = baseAuraMaxLimitLevel;
    }
    public static int getFootprintsType(JsonObject element) {
        return element.get("_FootprintsType").getAsInt();
    }
    public static void setFootprintsType(JsonObject element, int footprintsType) {
        this.footprintsType = footprintsType;
    }
    public static int getUniqueIndex(JsonObject element) {
        return element.get("_UniqueIndex").getAsInt();
    }
    public static void setUniqueIndex(JsonObject element, int uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }

 */


}

package com.dledit.Classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.dledit.Console;

public class Dragon {

    private int id; 
    private String name; 
    private String secondName; 
    private int emblemId;
    private int rarity;
    private int elementalType;
    private int maxLimitBreakCount;
    private int baseId; 
    private int variationId; 
    private int isPlayable;
    private int charaBaseId; 
    private String animFileName;
    private int deco1; 
    private int deco2;
    private int minHp; 
    private int maxHp; 
    private int addMaxHp1;
    private int ninAtk;
    private int naxAtk; 
    private int addMaxAtk1; 
    private int limitBreakId; 
    private int skill1; 
    private int skill2; 
    private int skillFinalAttack; 
    private int abilities11; 
    private int abilities12; 
    private int abilities13;
    private int abilities14;
    private int abilities15;
    private int abilities16; 
    private int abilities21;
    private int abilities22; 
    private int abilities23; 
    private int abilities24;
    private int abilities25; 
    private int abilities26;
    private String dragonExplosionDetail; 
    private String dragonExplosionIcon; 
    private String profile; 
    private String releaseStartDate; 
    private int favoriteType; 
    private int voiceType; 
    private String cvInfo; 
    private String cvInfoEn;
    private int sellCoin;
    private int sellDewPoint;
    private int limitBreakMaterialId;
    private int defaultReliabilityLevel;
    private int isNoneViewDragonContact;
    private int avoidActionFront; 
    private int avoidActionBack;
    private int transform; 
    private int defaultSkill; 
    private int burstAttack; 
    private int comboMax;
    private int maxChargeLv;
    private Double scaleSize;
    private Double dcScaleSize;
    private Double dcRotationY; 
    private Double shadowSize; 
    private Double gaugeHeightOffset; 
    private Double moveSpeed; 
    private Double dashSpeedRatio;
    private Double turnSpeed; 
    private int isTurnToDamageDir; 
    private int isLongRangeInGame; 
    private Double dragonCameraDistance; 
    private int moveType;
    private int isLongLange;
    private int isDetailimage; 
    private int silhouetteValue; 
    private Double searchRange; 
    private int aiType;
    private String servantFollowPosition;
    private int footprintsType;
    private int dmodePassiveAbilityId;
    private int uniqueIndex;

    private String textFile = "src/main/resources/com/dledit/files/TextLabel.json";

    public Dragon(){

    }

    public Dragon(int id, String name, String secondName, int emblemId, int rarity, int elementalType,
            int maxLimitBreakCount, int baseId, int variationId, int isPlayable, int charaBaseId, String animFileName,
            int deco1, int deco2, int minHp, int maxHp, int addMaxHp1, int ninAtk, int naxAtk, int addMaxAtk1,
            int limitBreakId, int skill1, int skill2, int skillFinalAttack, int abilities11, int abilities12,
            int abilities13, int abilities14, int abilities15, int abilities16, int abilities21, int abilities22,
            int abilities23, int abilities24, int abilities25, int abilities26, String dragonExplosionDetail,
            String dragonExplosionIcon, String profile, String releaseStartDate, int favoriteType, int voiceType,
            String cvInfo, String cvInfoEn, int sellCoin, int sellDewPoint, int limitBreakMaterialId,
            int defaultReliabilityLevel, int isNoneViewDragonContact, int avoidActionFront, int avoidActionBack,
            int transform, int defaultSkill, int burstAttack, int comboMax, int maxChargeLv, Double scaleSize,
            Double dcScaleSize, Double dcRotationY, Double shadowSize, Double gaugeHeightOffset, Double moveSpeed,
            Double dashSpeedRatio, Double turnSpeed, int isTurnToDamageDir, int isLongRangeInGame,
            Double dragonCameraDistance, int moveType, int isLongLange, int isDetailimage, int silhouetteValue,
            Double searchRange, int aiType, String servantFollowPosition, int footprintsType, int dmodePassiveAbilityId,
            int uniqueIndex) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.emblemId = emblemId;
        this.rarity = rarity;
        this.elementalType = elementalType;
        this.maxLimitBreakCount = maxLimitBreakCount;
        this.baseId = baseId;
        this.variationId = variationId;
        this.isPlayable = isPlayable;
        this.charaBaseId = charaBaseId;
        this.animFileName = animFileName;
        this.deco1 = deco1;
        this.deco2 = deco2;
        this.minHp = minHp;
        this.maxHp = maxHp;
        this.addMaxHp1 = addMaxHp1;
        this.ninAtk = ninAtk;
        this.naxAtk = naxAtk;
        this.addMaxAtk1 = addMaxAtk1;
        this.limitBreakId = limitBreakId;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skillFinalAttack = skillFinalAttack;
        this.abilities11 = abilities11;
        this.abilities12 = abilities12;
        this.abilities13 = abilities13;
        this.abilities14 = abilities14;
        this.abilities15 = abilities15;
        this.abilities16 = abilities16;
        this.abilities21 = abilities21;
        this.abilities22 = abilities22;
        this.abilities23 = abilities23;
        this.abilities24 = abilities24;
        this.abilities25 = abilities25;
        this.abilities26 = abilities26;
        this.dragonExplosionDetail = dragonExplosionDetail;
        this.dragonExplosionIcon = dragonExplosionIcon;
        this.profile = profile;
        this.releaseStartDate = releaseStartDate;
        this.favoriteType = favoriteType;
        this.voiceType = voiceType;
        this.cvInfo = cvInfo;
        this.cvInfoEn = cvInfoEn;
        this.sellCoin = sellCoin;
        this.sellDewPoint = sellDewPoint;
        this.limitBreakMaterialId = limitBreakMaterialId;
        this.defaultReliabilityLevel = defaultReliabilityLevel;
        this.isNoneViewDragonContact = isNoneViewDragonContact;
        this.avoidActionFront = avoidActionFront;
        this.avoidActionBack = avoidActionBack;
        this.transform = transform;
        this.defaultSkill = defaultSkill;
        this.burstAttack = burstAttack;
        this.comboMax = comboMax;
        this.maxChargeLv = maxChargeLv;
        this.scaleSize = scaleSize;
        this.dcScaleSize = dcScaleSize;
        this.dcRotationY = dcRotationY;
        this.shadowSize = shadowSize;
        this.gaugeHeightOffset = gaugeHeightOffset;
        this.moveSpeed = moveSpeed;
        this.dashSpeedRatio = dashSpeedRatio;
        this.turnSpeed = turnSpeed;
        this.isTurnToDamageDir = isTurnToDamageDir;
        this.isLongRangeInGame = isLongRangeInGame;
        this.dragonCameraDistance = dragonCameraDistance;
        this.moveType = moveType;
        this.isLongLange = isLongLange;
        this.isDetailimage = isDetailimage;
        this.silhouetteValue = silhouetteValue;
        this.searchRange = searchRange;
        this.aiType = aiType;
        this.servantFollowPosition = servantFollowPosition;
        this.footprintsType = footprintsType;
        this.dmodePassiveAbilityId = dmodePassiveAbilityId;
        this.uniqueIndex = uniqueIndex;
    }

    public static ArrayList<Dragon> createDragonList(){
        ArrayList<String> tempDrag = new ArrayList<>();
        ArrayList<Dragon> dragonList = new ArrayList<>();
        String fileName = "src/main/resources/com/dledit/files/DragonData.json";

        try {
            ArrayList<String> baseFile = Console.SplitFile(fileName, "},");
            boolean firstID = true;
            for(int i = 6; i < baseFile.size(); i++){
                String[] currentLine = baseFile.get(i).split(",");
                for(int k = 0; k < currentLine.length; k++){
                    String[] currentEntry = currentLine[k].split(": ");
                    if(i == 6 && firstID == true){
                        tempDrag.add(currentEntry[3].strip());
                        firstID = false;
                    }else{
                        tempDrag.add(currentEntry[1].replace("}","").replace("]","").strip());
                    }
  
                }
                if(tempDrag.size() != 2){
                    Dragon newDragon = new Dragon(Integer.parseInt(tempDrag.get(0)),tempDrag.get(1),tempDrag.get(2),Integer.parseInt(tempDrag.get(3)),Integer.parseInt(tempDrag.get(4)),Integer.parseInt(tempDrag.get(5)),Integer.parseInt(tempDrag.get(6)),Integer.parseInt(tempDrag.get(7)),Integer.parseInt(tempDrag.get(8)),Integer.parseInt(tempDrag.get(9)),Integer.parseInt(tempDrag.get(10)),tempDrag.get(11),Integer.parseInt(tempDrag.get(12)),Integer.parseInt(tempDrag.get(13)),Integer.parseInt(tempDrag.get(14)),Integer.parseInt(tempDrag.get(15)),Integer.parseInt(tempDrag.get(16)),Integer.parseInt(tempDrag.get(17)),Integer.parseInt(tempDrag.get(18)),Integer.parseInt(tempDrag.get(19)),Integer.parseInt(tempDrag.get(20)),Integer.parseInt(tempDrag.get(21)),Integer.parseInt(tempDrag.get(22)),Integer.parseInt(tempDrag.get(23)),Integer.parseInt(tempDrag.get(24)),Integer.parseInt(tempDrag.get(25)),Integer.parseInt(tempDrag.get(26)),Integer.parseInt(tempDrag.get(27)),Integer.parseInt(tempDrag.get(28)),Integer.parseInt(tempDrag.get(29)),Integer.parseInt(tempDrag.get(30)),Integer.parseInt(tempDrag.get(31)),Integer.parseInt(tempDrag.get(32)),Integer.parseInt(tempDrag.get(33)),Integer.parseInt(tempDrag.get(34)),Integer.parseInt(tempDrag.get(35)),tempDrag.get(36),tempDrag.get(37),tempDrag.get(38),tempDrag.get(39),Integer.parseInt(tempDrag.get(40)),Integer.parseInt(tempDrag.get(41)),tempDrag.get(42),tempDrag.get(43),Integer.parseInt(tempDrag.get(44)),Integer.parseInt(tempDrag.get(45)),Integer.parseInt(tempDrag.get(46)),Integer.parseInt(tempDrag.get(47)),Integer.parseInt(tempDrag.get(48)),Integer.parseInt(tempDrag.get(49)),Integer.parseInt(tempDrag.get(50)),Integer.parseInt(tempDrag.get(51)),Integer.parseInt(tempDrag.get(52)),Integer.parseInt(tempDrag.get(53)),Integer.parseInt(tempDrag.get(54)),Integer.parseInt(tempDrag.get(55)),Double.parseDouble(tempDrag.get(56)),Double.parseDouble(tempDrag.get(57)),Double.parseDouble(tempDrag.get(58)),Double.parseDouble(tempDrag.get(59)),Double.parseDouble(tempDrag.get(60)),Double.parseDouble(tempDrag.get(61)),Double.parseDouble(tempDrag.get(62)),Double.parseDouble(tempDrag.get(63)),Integer.parseInt(tempDrag.get(64)),Integer.parseInt(tempDrag.get(65)),Double.parseDouble(tempDrag.get(66)),Integer.parseInt(tempDrag.get(67)),Integer.parseInt(tempDrag.get(68)),Integer.parseInt(tempDrag.get(69)),Integer.parseInt(tempDrag.get(70)),Double.parseDouble(tempDrag.get(71)),Integer.parseInt(tempDrag.get(72)),tempDrag.get(73),Integer.parseInt(tempDrag.get(74)),Integer.parseInt(tempDrag.get(75)),Integer.parseInt(tempDrag.get(76)));
                    dragonList.add(newDragon);
                }
                
                
                tempDrag = new ArrayList<>();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Uh oh, stinky!");
        }

        return dragonList;
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
        }catch(Exception e){
            return "Name not Found";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        try{
            return Console.grabText(textFile, this.secondName, 1).split(": ")[1].replace('"',' ').strip();
        }catch(Exception e){
            return "Name not Found";
        }
    }

    public void setsecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFullName(){
        String tempName;
        /*Unplayable/Unique Shapeshift IDs are these, do something about them:
        29900006
        29900014
        29900017
        29900018
        29900023
        29900001
        29900002
        29900003
        29900004
        29900005
        29900006
        29900007
        29900008
        29900009
        29900010
        29900011
        29900012
        29900013
        29900014
        29900015
        29900016
        29900017
        29900018
        29900019
        29900020
        29900021
        29900022
        29900023
        29900024
        29900025
        29900026
        29900027
        29800001
        29800002
        29800003
        21000001
        21000002
        21000003
        21000004
        21000005
        21000006
        29940301
        29950405
        29950116
        29950522
        29950317
        29950523
        29950518
        29950415
        29950524
        29950416
        29950525
        29950121
        29950320
        */
        try{
            switch(this.id){
                case 29900001:{tempName="Unplayable ID: " + id;break;}
                case 29900002:{tempName="Unplayable ID: " + id;break;}
                case 29900003:{tempName="Unplayable ID: " + id;break;}
                case 29900004:{tempName="Unplayable ID: " + id;break;}
                case 29900005:{tempName="Unplayable ID: " + id;break;}
                case 29900006:{tempName="Unplayable ID: " + id;break;}
                case 29900007:{tempName="Unplayable ID: " + id;break;}
                case 29900008:{tempName="Unplayable ID: " + id;break;}
                case 29900009:{tempName="Unplayable ID: " + id;break;}
                case 29900010:{tempName="Unplayable ID: " + id;break;}
                case 29900011:{tempName="Unplayable ID: " + id;break;}
                case 29900012:{tempName="Unplayable ID: " + id;break;}
                case 29900013:{tempName="Unplayable ID: " + id;break;}
                case 29900014:{tempName="Unplayable ID: " + id;break;}
                case 29900015:{tempName="Unplayable ID: " + id;break;}
                case 29900016:{tempName="Unplayable ID: " + id;break;}
                case 29900017:{tempName="Unplayable ID: " + id;break;}
                case 29900018:{tempName="Unplayable ID: " + id;break;}
                case 29900019:{tempName="Unplayable ID: " + id;break;}
                case 29900020:{tempName="Unplayable ID: " + id;break;}
                case 29900021:{tempName="Unplayable ID: " + id;break;}
                case 29900022:{tempName="Unplayable ID: " + id;break;}
                case 29900023:{tempName="Unplayable ID: " + id;break;}
                case 29900024:{tempName="Unplayable ID: " + id;break;}
                case 29900025:{tempName="Unplayable ID: " + id;break;}
                case 29900026:{tempName="Unplayable ID: " + id;break;}
                case 29900027:{tempName="Unplayable ID: " + id;break;}
                case 29800001:{tempName="Unplayable ID: " + id;break;}
                case 29800002:{tempName="Unplayable ID: " + id;break;}
                case 29800003:{tempName="Unplayable ID: " + id;break;}
                case 21000001:{tempName="Unplayable ID: " + id;break;}
                case 21000002:{tempName="Unplayable ID: " + id;break;}
                case 21000003:{tempName="Unplayable ID: " + id;break;}
                case 21000004:{tempName="Unplayable ID: " + id;break;}
                case 21000005:{tempName="Unplayable ID: " + id;break;}
                case 21000006:{tempName="Unplayable ID: " + id;break;}
                case 29940301:{tempName="Unplayable ID: " + id;break;}
                case 29950405:{tempName="Unplayable ID: " + id;break;}
                case 29950116:{tempName="Unplayable ID: " + id;break;}
                case 29950522:{tempName="Unplayable ID: " + id;break;}
                case 29950317:{tempName="Unplayable ID: " + id;break;}
                case 29950523:{tempName="Unplayable ID: " + id;break;}
                case 29950518:{tempName="Unplayable ID: " + id;break;}
                case 29950415:{tempName="Unplayable ID: " + id;break;}
                case 29950524:{tempName="Unplayable ID: " + id;break;}
                case 29950416:{tempName="Unplayable ID: " + id;break;}
                case 29950525:{tempName="Unplayable ID: " + id;break;}
                case 29950121:{tempName="Unplayable ID: " + id;break;}
                case 29950320:{tempName="Unplayable ID: " + id;break;}
                default :{
                    tempName = Console.grabText(textFile, this.secondName, 1).split(": ")[1].replace('"',' ').strip();
                    break;
                }
            }
        }catch(Exception e){
            try{
                tempName = Console.grabText(textFile, this.name, 1).split(": ")[1].replace('"',' ').strip();
            }catch(Exception e1){
                tempName = "Unknown ID: " + id;
            }
        }

        return tempName;

    }


    public int getEmblemId() {
        return emblemId;
    }

    public void setEmblemId(int emblemId) {
        this.emblemId = emblemId;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public String getElementalType() {
        return Types.getElement(this.elementalType);
    }

    public void setElementalType(int elementalType) {
        this.elementalType = elementalType;
    }

    public int getMaxLimitBreakCount() {
        return maxLimitBreakCount;
    }

    public void setMaxLimitBreakCount(int maxLimitBreakCount) {
        this.maxLimitBreakCount = maxLimitBreakCount;
    }

    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }

    public int getVariationId() {
        return variationId;
    }

    public void setVariationId(int variationId) {
        this.variationId = variationId;
    }

    public int getIsPlayable() {
        return isPlayable;
    }

    public void setIsPlayable(int isPlayable) {
        this.isPlayable = isPlayable;
    }

    public int getCharaBaseId() {
        return charaBaseId;
    }

    public void setCharaBaseId(int charaBaseId) {
        this.charaBaseId = charaBaseId;
    }

    public String getAnimFileName() {
        return animFileName;
    }

    public void setAnimFileName(String animFileName) {
        this.animFileName = animFileName;
    }

    public int getDeco1() {
        return deco1;
    }

    public void setDeco1(int deco1) {
        this.deco1 = deco1;
    }

    public int getDeco2() {
        return deco2;
    }

    public void setDeco2(int deco2) {
        this.deco2 = deco2;
    }

    public int getMinHp() {
        return minHp;
    }

    public void setMinHp(int minHp) {
        this.minHp = minHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAddMaxHp1() {
        return addMaxHp1;
    }

    public void setAddMaxHp1(int addMaxHp1) {
        this.addMaxHp1 = addMaxHp1;
    }

    public int getNinAtk() {
        return ninAtk;
    }

    public void setNinAtk(int ninAtk) {
        this.ninAtk = ninAtk;
    }

    public int getNaxAtk() {
        return naxAtk;
    }

    public void setNaxAtk(int naxAtk) {
        this.naxAtk = naxAtk;
    }

    public int getAddMaxAtk1() {
        return addMaxAtk1;
    }

    public void setAddMaxAtk1(int addMaxAtk1) {
        this.addMaxAtk1 = addMaxAtk1;
    }

    public int getLimitBreakId() {
        return limitBreakId;
    }

    public void setLimitBreakId(int limitBreakId) {
        this.limitBreakId = limitBreakId;
    }

    public int getSkill1() {
        return skill1;
    }

    public void setSkill1(int skill1) {
        this.skill1 = skill1;
    }

    public int getSkill2() {
        return skill2;
    }

    public void setSkill2(int skill2) {
        this.skill2 = skill2;
    }

    public int getSkillFinalAttack() {
        return skillFinalAttack;
    }

    public void setSkillFinalAttack(int skillFinalAttack) {
        this.skillFinalAttack = skillFinalAttack;
    }

    public int getAbilities11() {
        return abilities11;
    }

    public void setAbilities11(int abilities11) {
        this.abilities11 = abilities11;
    }

    public int getAbilities12() {
        return abilities12;
    }

    public void setAbilities12(int abilities12) {
        this.abilities12 = abilities12;
    }

    public int getAbilities13() {
        return abilities13;
    }

    public void setAbilities13(int abilities13) {
        this.abilities13 = abilities13;
    }

    public int getAbilities14() {
        return abilities14;
    }

    public void setAbilities14(int abilities14) {
        this.abilities14 = abilities14;
    }

    public int getAbilities15() {
        return abilities15;
    }

    public void setAbilities15(int abilities15) {
        this.abilities15 = abilities15;
    }

    public int getAbilities16() {
        return abilities16;
    }

    public void setAbilities16(int abilities16) {
        this.abilities16 = abilities16;
    }

    public int getAbilities21() {
        return abilities21;
    }

    public void setAbilities21(int abilities21) {
        this.abilities21 = abilities21;
    }

    public int getAbilities22() {
        return abilities22;
    }

    public void setAbilities22(int abilities22) {
        this.abilities22 = abilities22;
    }

    public int getAbilities23() {
        return abilities23;
    }

    public void setAbilities23(int abilities23) {
        this.abilities23 = abilities23;
    }

    public int getAbilities24() {
        return abilities24;
    }

    public void setAbilities24(int abilities24) {
        this.abilities24 = abilities24;
    }

    public int getAbilities25() {
        return abilities25;
    }

    public void setAbilities25(int abilities25) {
        this.abilities25 = abilities25;
    }

    public int getAbilities26() {
        return abilities26;
    }

    public void setAbilities26(int abilities26) {
        this.abilities26 = abilities26;
    }

    public String getDragonExplosionDetail() {
        return dragonExplosionDetail;
    }

    public void setDragonExplosionDetail(String dragonExplosionDetail) {
        this.dragonExplosionDetail = dragonExplosionDetail;
    }

    public String getDragonExplosionIcon() {
        return dragonExplosionIcon;
    }

    public void setDragonExplosionIcon(String dragonExplosionIcon) {
        this.dragonExplosionIcon = dragonExplosionIcon;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getReleaseStartDate() {
        return releaseStartDate;
    }

    public void setReleaseStartDate(String releaseStartDate) {
        this.releaseStartDate = releaseStartDate;
    }

    public int getFavoriteType() {
        return favoriteType;
    }

    public void setFavoriteType(int favoriteType) {
        this.favoriteType = favoriteType;
    }

    public int getVoiceType() {
        return voiceType;
    }

    public void setVoiceType(int voiceType) {
        this.voiceType = voiceType;
    }

    public String getCvInfo() {
        return cvInfo;
    }

    public void setCvInfo(String cvInfo) {
        this.cvInfo = cvInfo;
    }

    public String getCvInfoEn() {
        return cvInfoEn;
    }

    public void setCvInfoEn(String cvInfoEn) {
        this.cvInfoEn = cvInfoEn;
    }

    public int getSellCoin() {
        return sellCoin;
    }

    public void setSellCoin(int sellCoin) {
        this.sellCoin = sellCoin;
    }

    public int getSellDewPoint() {
        return sellDewPoint;
    }

    public void setSellDewPoint(int sellDewPoint) {
        this.sellDewPoint = sellDewPoint;
    }

    public int getLimitBreakMaterialId() {
        return limitBreakMaterialId;
    }

    public void setLimitBreakMaterialId(int limitBreakMaterialId) {
        this.limitBreakMaterialId = limitBreakMaterialId;
    }

    public int getDefaultReliabilityLevel() {
        return defaultReliabilityLevel;
    }

    public void setDefaultReliabilityLevel(int defaultReliabilityLevel) {
        this.defaultReliabilityLevel = defaultReliabilityLevel;
    }

    public int getIsNoneViewDragonContact() {
        return isNoneViewDragonContact;
    }

    public void setIsNoneViewDragonContact(int isNoneViewDragonContact) {
        this.isNoneViewDragonContact = isNoneViewDragonContact;
    }

    public int getAvoidActionFront() {
        return avoidActionFront;
    }

    public void setAvoidActionFront(int avoidActionFront) {
        this.avoidActionFront = avoidActionFront;
    }

    public int getAvoidActionBack() {
        return avoidActionBack;
    }

    public void setAvoidActionBack(int avoidActionBack) {
        this.avoidActionBack = avoidActionBack;
    }

    public int getTransform() {
        return transform;
    }

    public void setTransform(int transform) {
        this.transform = transform;
    }

    public int getDefaultSkill() {
        return defaultSkill;
    }

    public void setDefaultSkill(int defaultSkill) {
        this.defaultSkill = defaultSkill;
    }

    public int getBurstAttack() {
        return burstAttack;
    }

    public void setBurstAttack(int burstAttack) {
        this.burstAttack = burstAttack;
    }

    public int getComboMax() {
        return comboMax;
    }

    public void setComboMax(int comboMax) {
        this.comboMax = comboMax;
    }

    public int getMaxChargeLv() {
        return maxChargeLv;
    }

    public void setMaxChargeLv(int maxChargeLv) {
        this.maxChargeLv = maxChargeLv;
    }

    public Double getScaleSize() {
        return scaleSize;
    }

    public void setScaleSize(Double scaleSize) {
        this.scaleSize = scaleSize;
    }

    public Double getDcScaleSize() {
        return dcScaleSize;
    }

    public void setDcScaleSize(Double dcScaleSize) {
        this.dcScaleSize = dcScaleSize;
    }

    public Double getDcRotationY() {
        return dcRotationY;
    }

    public void setDcRotationY(Double dcRotationY) {
        this.dcRotationY = dcRotationY;
    }

    public Double getShadowSize() {
        return shadowSize;
    }

    public void setShadowSize(Double shadowSize) {
        this.shadowSize = shadowSize;
    }

    public Double getGaugeHeightOffset() {
        return gaugeHeightOffset;
    }

    public void setGaugeHeightOffset(Double gaugeHeightOffset) {
        this.gaugeHeightOffset = gaugeHeightOffset;
    }

    public Double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(Double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public Double getDashSpeedRatio() {
        return dashSpeedRatio;
    }

    public void setDashSpeedRatio(Double dashSpeedRatio) {
        this.dashSpeedRatio = dashSpeedRatio;
    }

    public Double getTurnSpeed() {
        return turnSpeed;
    }

    public void setTurnSpeed(Double turnSpeed) {
        this.turnSpeed = turnSpeed;
    }

    public int getIsTurnToDamageDir() {
        return isTurnToDamageDir;
    }

    public void setIsTurnToDamageDir(int isTurnToDamageDir) {
        this.isTurnToDamageDir = isTurnToDamageDir;
    }

    public int getIsLongRangeInGame() {
        return isLongRangeInGame;
    }

    public void setIsLongRangeInGame(int isLongRangeInGame) {
        this.isLongRangeInGame = isLongRangeInGame;
    }

    public Double getDragonCameraDistance() {
        return dragonCameraDistance;
    }

    public void setDragonCameraDistance(Double dragonCameraDistance) {
        this.dragonCameraDistance = dragonCameraDistance;
    }

    public int getMoveType() {
        return moveType;
    }

    public void setMoveType(int moveType) {
        this.moveType = moveType;
    }

    public int getIsLongLange() {
        return isLongLange;
    }

    public void setIsLongLange(int isLongLange) {
        this.isLongLange = isLongLange;
    }

    public int getIsDetailimage() {
        return isDetailimage;
    }

    public void setIsDetailimage(int isDetailimage) {
        this.isDetailimage = isDetailimage;
    }

    public int getSilhouetteValue() {
        return silhouetteValue;
    }

    public void setSilhouetteValue(int silhouetteValue) {
        this.silhouetteValue = silhouetteValue;
    }

    public Double getSearchRange() {
        return searchRange;
    }

    public void setSearchRange(Double searchRange) {
        this.searchRange = searchRange;
    }

    public int getAiType() {
        return aiType;
    }

    public void setAiType(int aiType) {
        this.aiType = aiType;
    }

    public String getServantFollowPosition() {
        return servantFollowPosition;
    }

    public void setServantFollowPosition(String servantFollowPosition) {
        this.servantFollowPosition = servantFollowPosition;
    }

    public int getFootprintsType() {
        return footprintsType;
    }

    public void setFootprintsType(int footprintsType) {
        this.footprintsType = footprintsType;
    }

    public int getDmodePassiveAbilityId() {
        return dmodePassiveAbilityId;
    }

    public void setDmodePassiveAbilityId(int dmodePassiveAbilityId) {
        this.dmodePassiveAbilityId = dmodePassiveAbilityId;
    }

    public int getUniqueIndex() {
        return uniqueIndex;
    }

    public void setUniqueIndex(int uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }
    
    
}

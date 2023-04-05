package com.dledit.Classes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.dledit.Console;


public class Character {
    private int id;
    private String name;
    private String secondName;
    private int emblemId;
    private int weaponType;
    private int rarity;
    private int maxLimitBreakCount;
    private int elementalType;
    private int charaType;
    private int baseId;
    private int variationId;
    private int minHp3;
    private int minHp4;
    private int minHp5;
    private int maxHp;
    private int addMaxHp1;
    private int plusHp0;
    private int plusHp1;
    private int plusHp2;
    private int plusHp3;
    private int plusHp4;
    private int plusHp5;
    private int mcFullBonusHp5;
    private int minAtk3;
    private int minAtk4;
    private int minAtk5;
    private int maxAtk;
    private int addMaxAtk1;
    private int plusAtk0;
    private int plusAtk1;
    private int plusAtk2;
    private int plusAtk3;
    private int plusAtk4;
    private int plusAtk5;
    private int mcFullBonusAtk5;
    private int minDef;
    private double defCoef;
    private int modeChangeType;
    private int modeId1;
    private int modeId2;
    private int modeId3;
    private int modeId4;
    private int keepModeOnRevive;
    private int originCombo;
    private int mode1Combo;
    private int mode2Combo; 
    private double searchRange; 
    private double searchAngle; 
    private int attackRangeType; 
    private int burstAttack; 
    private int dashAttack; 
    private int avoid; 
    private int avoidOnCombo; 
    private int backAvoidOnCombo; 
    private int guts; 
    private int appear; 
    private int revive; 
    private int disappear; 
    private int win; 
    private String effNameCriticalHit; 
    private int skill1;
    private int skill2;
    private double skillChainValidTime; 
    private int skillChainSpbarCount; 
    private int supportSkillNum;
    private int abilities11;
    private int abilities12;
    private int abilities13; 
    private int abilities14; 
    private int abilities21; 
    private int abilities22;
    private int abilities23; 
    private int abilities24; 
    private int abilities31; 
    private int abilities32; 
    private int abilities33; 
    private int abilities34; 
    private int exAbilityData1;
    private int exAbilityData2; 
    private int exAbilityData3; 
    private int exAbilityData4; 
    private int exAbilityData5; 
    private int exAbility2Data1; 
    private int exAbility2Data2; 
    private int exAbility2Data3;
    private int exAbility2Data4;
    private int exAbility2Data5; 
    private int chargeType; 
    private int maxChargeLv; 
    private int onChangeBADuringCharge; 
    private int holdEditSkillCost;
    private int editSkillId;
    private int editSkillLevelNum;
    private int editSkillCost;
    private int editSkillRelationId; 
    private int editReleaseEntityType1;
    private int editReleaseEntityId1; 
    private int editReleaseEntityQuantity1; 
    private int isUnuseDmodeEditSkill; 
    private String manaCircleName; 
    private int charaLimitBreak;
    private int pieceElementGroupId; 
    private int pieceMaterialElementId; 
    private int awakeNeedEntityType4;
    private int awakeNeedEntityId4;
    private int awakeNeedEntityQuantity4;
    private int awakeNeedEntityType5;
    private int awakeNeedEntityId5;
    private int awakeNeedEntityQuantity5; 
    private String cvInfo;
    private String cvInfoEn;
    private String profileText;
    private String releaseStartDate;
    private int isViewSummonScene;
    private int motionType;
    private int personMotionType;
    private int isDetailimage;
    private int voiceType;
    private int seasonVoiceId;
    private int specialOndamageVoice;
    private double baseScale;
    private int uniqueWeaponId;
    private int uniqueWeaponSkinId;
    private int attachWeaponHandType;
    private int winFaceEyeMotion;
    private int winFaceMouthMotion;
    private int uniqueDragonId;
    private int isConvertDragonSkillLevel;
    private int isEnhanceChara;
    private int isPlayable;
    private int defaultAbility1Level;
    private int defaultAbility2Level;
    private int defaultAbility3Level;
    private int defaultBurstAttackLevel;
    private int defaultIsUnlockEditSkill;
    private int uniqueGrowMaterialId1;
    private int uniqueGrowMaterialId2;
    private int maxFriendshipPoint;
    private String growMaterialOnlyStartDate;
    private String growMaterialOnlyEndDate;
    private int growMaterialId;
    private int dmodeLevelGroupId;
    private int mcFullReleaseEntityType1;
    private int mcFullReleaseEntityId1;
    private int mcFullReleaseEntityQuantity1;
    private int mcFullReleaseEntityType2; 
    private int mcFullReleaseEntityId2;
    private int mcFullReleaseEntityQuantity2;
    private int baseAuraMaxLimitLevel;
    private int footprintsType;
    private int uniqueIndex;
    
    private String textFile = "src/main/resources/com/dledit/files/TextLabel.json";

    public Character(){
        
    }

    public Character(int id, String name, String secondName, int emblemId, int weaponType, int rarity,
            int maxLimitBreakCount, int elementalType, int charaType, int baseId, int variationId, int minHp3,
            int minHp4, int minHp5, int maxHp, int addMaxHp1, int plusHp0, int plusHp1, int plusHp2, int plusHp3,
            int plusHp4, int plusHp5, int mcFullBonusHp5, int minAtk3, int minAtk4, int minAtk5, int maxAtk,
            int addMaxAtk1, int plusAtk0, int plusAtk1, int plusAtk2, int plusAtk3, int plusAtk4, int plusAtk5,
            int mcFullBonusAtk5, int minDef, double defCoef, int modeChangeType, int modeId1, int modeId2, int modeId3,
            int modeId4, int keepModeOnRevive, int originCombo, int mode1Combo, int mode2Combo, double searchRange,
            double searchAngle, int attackRangeType, int burstAttack, int dashAttack, int avoid, int avoidOnCombo,
            int backAvoidOnCombo, int guts, int appear, int revive, int disappear, int win, String effNameCriticalHit,
            int skill1, int skill2, double skillChainValidTime, int skillChainSpbarCount, int supportSkillNum,
            int abilities11, int abilities12, int abilities13, int abilities14, int abilities21, int abilities22,
            int abilities23, int abilities24, int abilities31, int abilities32, int abilities33, int abilities34,
            int exAbilityData1, int exAbilityData2, int exAbilityData3, int exAbilityData4, int exAbilityData5,
            int exAbility2Data1, int exAbility2Data2, int exAbility2Data3, int exAbility2Data4, int exAbility2Data5,
            int chargeType, int maxChargeLv, int onChangeBADuringCharge, int holdEditSkillCost, int editSkillId,
            int editSkillLevelNum, int editSkillCost, int editSkillRelationId, int editReleaseEntityType1,
            int editReleaseEntityId1, int editReleaseEntityQuantity1, int isUnuseDmodeEditSkill, String manaCircleName,
            int charaLimitBreak, int pieceElementGroupId, int pieceMaterialElementId, int awakeNeedEntityType4,
            int awakeNeedEntityId4, int awakeNeedEntityQuantity4, int awakeNeedEntityType5, int awakeNeedEntityId5,
            int awakeNeedEntityQuantity5, String cvInfo, String cvInfoEn, String profileText, String releaseStartDate,
            int isViewSummonScene, int motionType, int personMotionType, int isDetailimage, int voiceType,
            int seasonVoiceId, int specialOndamageVoice, double baseScale, int uniqueWeaponId, int uniqueWeaponSkinId,
            int attachWeaponHandType, int winFaceEyeMotion, int winFaceMouthMotion, int uniqueDragonId,
            int isConvertDragonSkillLevel, int isEnhanceChara, int isPlayable, int defaultAbility1Level,
            int defaultAbility2Level, int defaultAbility3Level, int defaultBurstAttackLevel,
            int defaultIsUnlockEditSkill, int uniqueGrowMaterialId1, int uniqueGrowMaterialId2, int maxFriendshipPoint,
            String growMaterialOnlyStartDate, String growMaterialOnlyEndDate, int growMaterialId, int dmodeLevelGroupId,
            int mcFullReleaseEntityType1, int mcFullReleaseEntityId1, int mcFullReleaseEntityQuantity1,
            int mcFullReleaseEntityType2, int mcFullReleaseEntityId2, int mcFullReleaseEntityQuantity2,
            int baseAuraMaxLimitLevel, int footprintsType, int uniqueIndex) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.emblemId = emblemId;
        this.weaponType = weaponType;
        this.rarity = rarity;
        this.maxLimitBreakCount = maxLimitBreakCount;
        this.elementalType = elementalType;
        this.charaType = charaType;
        this.baseId = baseId;
        this.variationId = variationId;
        this.minHp3 = minHp3;
        this.minHp4 = minHp4;
        this.minHp5 = minHp5;
        this.maxHp = maxHp;
        this.addMaxHp1 = addMaxHp1;
        this.plusHp0 = plusHp0;
        this.plusHp1 = plusHp1;
        this.plusHp2 = plusHp2;
        this.plusHp3 = plusHp3;
        this.plusHp4 = plusHp4;
        this.plusHp5 = plusHp5;
        this.mcFullBonusHp5 = mcFullBonusHp5;
        this.minAtk3 = minAtk3;
        this.minAtk4 = minAtk4;
        this.minAtk5 = minAtk5;
        this.maxAtk = maxAtk;
        this.addMaxAtk1 = addMaxAtk1;
        this.plusAtk0 = plusAtk0;
        this.plusAtk1 = plusAtk1;
        this.plusAtk2 = plusAtk2;
        this.plusAtk3 = plusAtk3;
        this.plusAtk4 = plusAtk4;
        this.plusAtk5 = plusAtk5;
        this.mcFullBonusAtk5 = mcFullBonusAtk5;
        this.minDef = minDef;
        this.defCoef = defCoef;
        this.modeChangeType = modeChangeType;
        this.modeId1 = modeId1;
        this.modeId2 = modeId2;
        this.modeId3 = modeId3;
        this.modeId4 = modeId4;
        this.keepModeOnRevive = keepModeOnRevive;
        this.originCombo = originCombo;
        this.mode1Combo = mode1Combo;
        this.mode2Combo = mode2Combo;
        this.searchRange = searchRange;
        this.searchAngle = searchAngle;
        this.attackRangeType = attackRangeType;
        this.burstAttack = burstAttack;
        this.dashAttack = dashAttack;
        this.avoid = avoid;
        this.avoidOnCombo = avoidOnCombo;
        this.backAvoidOnCombo = backAvoidOnCombo;
        this.guts = guts;
        this.appear = appear;
        this.revive = revive;
        this.disappear = disappear;
        this.win = win;
        this.effNameCriticalHit = effNameCriticalHit;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skillChainValidTime = skillChainValidTime;
        this.skillChainSpbarCount = skillChainSpbarCount;
        this.supportSkillNum = supportSkillNum;
        this.abilities11 = abilities11;
        this.abilities12 = abilities12;
        this.abilities13 = abilities13;
        this.abilities14 = abilities14;
        this.abilities21 = abilities21;
        this.abilities22 = abilities22;
        this.abilities23 = abilities23;
        this.abilities24 = abilities24;
        this.abilities31 = abilities31;
        this.abilities32 = abilities32;
        this.abilities33 = abilities33;
        this.abilities34 = abilities34;
        this.exAbilityData1 = exAbilityData1;
        this.exAbilityData2 = exAbilityData2;
        this.exAbilityData3 = exAbilityData3;
        this.exAbilityData4 = exAbilityData4;
        this.exAbilityData5 = exAbilityData5;
        this.exAbility2Data1 = exAbility2Data1;
        this.exAbility2Data2 = exAbility2Data2;
        this.exAbility2Data3 = exAbility2Data3;
        this.exAbility2Data4 = exAbility2Data4;
        this.exAbility2Data5 = exAbility2Data5;
        this.chargeType = chargeType;
        this.maxChargeLv = maxChargeLv;
        this.onChangeBADuringCharge = onChangeBADuringCharge;
        this.holdEditSkillCost = holdEditSkillCost;
        this.editSkillId = editSkillId;
        this.editSkillLevelNum = editSkillLevelNum;
        this.editSkillCost = editSkillCost;
        this.editSkillRelationId = editSkillRelationId;
        this.editReleaseEntityType1 = editReleaseEntityType1;
        this.editReleaseEntityId1 = editReleaseEntityId1;
        this.editReleaseEntityQuantity1 = editReleaseEntityQuantity1;
        this.isUnuseDmodeEditSkill = isUnuseDmodeEditSkill;
        this.manaCircleName = manaCircleName;
        this.charaLimitBreak = charaLimitBreak;
        this.pieceElementGroupId = pieceElementGroupId;
        this.pieceMaterialElementId = pieceMaterialElementId;
        this.awakeNeedEntityType4 = awakeNeedEntityType4;
        this.awakeNeedEntityId4 = awakeNeedEntityId4;
        this.awakeNeedEntityQuantity4 = awakeNeedEntityQuantity4;
        this.awakeNeedEntityType5 = awakeNeedEntityType5;
        this.awakeNeedEntityId5 = awakeNeedEntityId5;
        this.awakeNeedEntityQuantity5 = awakeNeedEntityQuantity5;
        this.cvInfo = cvInfo;
        this.cvInfoEn = cvInfoEn;
        this.profileText = profileText;
        this.releaseStartDate = releaseStartDate;
        this.isViewSummonScene = isViewSummonScene;
        this.motionType = motionType;
        this.personMotionType = personMotionType;
        this.isDetailimage = isDetailimage;
        this.voiceType = voiceType;
        this.seasonVoiceId = seasonVoiceId;
        this.specialOndamageVoice = specialOndamageVoice;
        this.baseScale = baseScale;
        this.uniqueWeaponId = uniqueWeaponId;
        this.uniqueWeaponSkinId = uniqueWeaponSkinId;
        this.attachWeaponHandType = attachWeaponHandType;
        this.winFaceEyeMotion = winFaceEyeMotion;
        this.winFaceMouthMotion = winFaceMouthMotion;
        this.uniqueDragonId = uniqueDragonId;
        this.isConvertDragonSkillLevel = isConvertDragonSkillLevel;
        this.isEnhanceChara = isEnhanceChara;
        this.isPlayable = isPlayable;
        this.defaultAbility1Level = defaultAbility1Level;
        this.defaultAbility2Level = defaultAbility2Level;
        this.defaultAbility3Level = defaultAbility3Level;
        this.defaultBurstAttackLevel = defaultBurstAttackLevel;
        this.defaultIsUnlockEditSkill = defaultIsUnlockEditSkill;
        this.uniqueGrowMaterialId1 = uniqueGrowMaterialId1;
        this.uniqueGrowMaterialId2 = uniqueGrowMaterialId2;
        this.maxFriendshipPoint = maxFriendshipPoint;
        this.growMaterialOnlyStartDate = growMaterialOnlyStartDate;
        this.growMaterialOnlyEndDate = growMaterialOnlyEndDate;
        this.growMaterialId = growMaterialId;
        this.dmodeLevelGroupId = dmodeLevelGroupId;
        this.mcFullReleaseEntityType1 = mcFullReleaseEntityType1;
        this.mcFullReleaseEntityId1 = mcFullReleaseEntityId1;
        this.mcFullReleaseEntityQuantity1 = mcFullReleaseEntityQuantity1;
        this.mcFullReleaseEntityType2 = mcFullReleaseEntityType2;
        this.mcFullReleaseEntityId2 = mcFullReleaseEntityId2;
        this.mcFullReleaseEntityQuantity2 = mcFullReleaseEntityQuantity2;
        this.baseAuraMaxLimitLevel = baseAuraMaxLimitLevel;
        this.footprintsType = footprintsType;
        this.uniqueIndex = uniqueIndex;
    }

    public static ArrayList<Character> createCharacterList(){
        ArrayList<String> tempChar = new ArrayList<>();
        ArrayList<Character> characterList = new ArrayList<>();
        String fileName = "src/main/resources/com/dledit/files/CharaData.json";


        /* try {
            ArrayList<String> baseFile = Console.SplitFile(fileName, "},");
            boolean firstID = true;
            for(int i = 6; i < baseFile.size(); i++){
                String[] currentLine = baseFile.get(i).split(",");
                for(int k = 0; k < currentLine.length; k++){
                    String[] currentEntry = currentLine[k].split(": ");
                    if(i == 6 && firstID == true){
                        tempChar.add(currentEntry[3].strip());
                        firstID = false;
                    }else{
                        tempChar.add(currentEntry[1].replace("}","").replace("]","").strip());
                    }
                    
                    
                }
                if(tempChar.size() != 2){
                    Character newCharacter = new Character(Integer.parseInt(tempChar.get(0)),tempChar.get(1),tempChar.get(2),Integer.parseInt(tempChar.get(3)),Integer.parseInt(tempChar.get(4)),Integer.parseInt(tempChar.get(5)),Integer.parseInt(tempChar.get(6)),Integer.parseInt(tempChar.get(7)),Integer.parseInt(tempChar.get(8)),Integer.parseInt(tempChar.get(9)),Integer.parseInt(tempChar.get(10)),Integer.parseInt(tempChar.get(11)),Integer.parseInt(tempChar.get(12)),Integer.parseInt(tempChar.get(13)),Integer.parseInt(tempChar.get(14)),Integer.parseInt(tempChar.get(15)),Integer.parseInt(tempChar.get(16)),Integer.parseInt(tempChar.get(17)),Integer.parseInt(tempChar.get(18)),Integer.parseInt(tempChar.get(19)),Integer.parseInt(tempChar.get(20)),Integer.parseInt(tempChar.get(21)),Integer.parseInt(tempChar.get(22)),Integer.parseInt(tempChar.get(23)),Integer.parseInt(tempChar.get(24)),Integer.parseInt(tempChar.get(25)),Integer.parseInt(tempChar.get(26)),Integer.parseInt(tempChar.get(27)),Integer.parseInt(tempChar.get(28)),Integer.parseInt(tempChar.get(29)),Integer.parseInt(tempChar.get(30)),Integer.parseInt(tempChar.get(31)),Integer.parseInt(tempChar.get(32)),Integer.parseInt(tempChar.get(33)),Integer.parseInt(tempChar.get(34)),Integer.parseInt(tempChar.get(35)),Double.parseDouble(tempChar.get(36)),Integer.parseInt(tempChar.get(37)),Integer.parseInt(tempChar.get(38)),Integer.parseInt(tempChar.get(39)),Integer.parseInt(tempChar.get(40)),Integer.parseInt(tempChar.get(41)),Integer.parseInt(tempChar.get(42)),Integer.parseInt(tempChar.get(43)),Integer.parseInt(tempChar.get(44)),Integer.parseInt(tempChar.get(45)),Double.parseDouble(tempChar.get(46)),Double.parseDouble(tempChar.get(47)),Integer.parseInt(tempChar.get(48)),Integer.parseInt(tempChar.get(49)),Integer.parseInt(tempChar.get(50)),Integer.parseInt(tempChar.get(51)),Integer.parseInt(tempChar.get(52)),Integer.parseInt(tempChar.get(53)),Integer.parseInt(tempChar.get(54)),Integer.parseInt(tempChar.get(55)),Integer.parseInt(tempChar.get(56)),Integer.parseInt(tempChar.get(57)),Integer.parseInt(tempChar.get(58)),tempChar.get(59),Integer.parseInt(tempChar.get(60)),Integer.parseInt(tempChar.get(61)),Double.parseDouble(tempChar.get(62)),Integer.parseInt(tempChar.get(63)),Integer.parseInt(tempChar.get(64)),Integer.parseInt(tempChar.get(65)),Integer.parseInt(tempChar.get(66)),Integer.parseInt(tempChar.get(67)),Integer.parseInt(tempChar.get(68)),Integer.parseInt(tempChar.get(69)),Integer.parseInt(tempChar.get(70)),Integer.parseInt(tempChar.get(71)),Integer.parseInt(tempChar.get(72)),Integer.parseInt(tempChar.get(73)),Integer.parseInt(tempChar.get(74)),Integer.parseInt(tempChar.get(75)),Integer.parseInt(tempChar.get(76)),Integer.parseInt(tempChar.get(77)),Integer.parseInt(tempChar.get(78)),Integer.parseInt(tempChar.get(79)),Integer.parseInt(tempChar.get(80)),Integer.parseInt(tempChar.get(81)),Integer.parseInt(tempChar.get(82)),Integer.parseInt(tempChar.get(83)),Integer.parseInt(tempChar.get(84)),Integer.parseInt(tempChar.get(85)),Integer.parseInt(tempChar.get(86)),Integer.parseInt(tempChar.get(87)),Integer.parseInt(tempChar.get(88)),Integer.parseInt(tempChar.get(89)),Integer.parseInt(tempChar.get(90)),Integer.parseInt(tempChar.get(91)),Integer.parseInt(tempChar.get(92)),Integer.parseInt(tempChar.get(93)),Integer.parseInt(tempChar.get(94)),Integer.parseInt(tempChar.get(95)),Integer.parseInt(tempChar.get(96)),Integer.parseInt(tempChar.get(97)),Integer.parseInt(tempChar.get(98)),tempChar.get(99),Integer.parseInt(tempChar.get(100)),Integer.parseInt(tempChar.get(101)),Integer.parseInt(tempChar.get(102)),Integer.parseInt(tempChar.get(103)),Integer.parseInt(tempChar.get(104)),Integer.parseInt(tempChar.get(105)),Integer.parseInt(tempChar.get(106)),Integer.parseInt(tempChar.get(107)),Integer.parseInt(tempChar.get(108)),tempChar.get(109),tempChar.get(110),tempChar.get(111),tempChar.get(112),Integer.parseInt(tempChar.get(113)),Integer.parseInt(tempChar.get(114)),Integer.parseInt(tempChar.get(115)),Integer.parseInt(tempChar.get(116)),Integer.parseInt(tempChar.get(117)),Integer.parseInt(tempChar.get(118)),Integer.parseInt(tempChar.get(119)),Double.parseDouble(tempChar.get(120)),Integer.parseInt(tempChar.get(121)),Integer.parseInt(tempChar.get(122)),Integer.parseInt(tempChar.get(123)),Integer.parseInt(tempChar.get(124)),Integer.parseInt(tempChar.get(125)),Integer.parseInt(tempChar.get(126)),Integer.parseInt(tempChar.get(127)),Integer.parseInt(tempChar.get(128)),Integer.parseInt(tempChar.get(129)),Integer.parseInt(tempChar.get(130)),Integer.parseInt(tempChar.get(131)),Integer.parseInt(tempChar.get(132)),Integer.parseInt(tempChar.get(133)),Integer.parseInt(tempChar.get(134)),Integer.parseInt(tempChar.get(135)),Integer.parseInt(tempChar.get(136)),Integer.parseInt(tempChar.get(137)),tempChar.get(138),tempChar.get(139),Integer.parseInt(tempChar.get(140)),Integer.parseInt(tempChar.get(141)),Integer.parseInt(tempChar.get(142)),Integer.parseInt(tempChar.get(143)),Integer.parseInt(tempChar.get(144)),Integer.parseInt(tempChar.get(145)),Integer.parseInt(tempChar.get(146)),Integer.parseInt(tempChar.get(147)),Integer.parseInt(tempChar.get(148)),Integer.parseInt(tempChar.get(149)),Integer.parseInt(tempChar.get(150)));

                    characterList.add(newCharacter);
                }
                
                tempChar = new ArrayList<>();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Uh oh, stinky!");
        }
 */
        return characterList;
    }

    

    @Override
    public String toString() {
        return "Character [_Id" + id + ", _Name" + name + ", _SecondName" + secondName + ", emblemId=" + emblemId
                + ", weaponType=" + weaponType + ", rarity=" + rarity + ", maxLimitBreakCount=" + maxLimitBreakCount
                + ", elementalType=" + elementalType + ", charaType=" + charaType + ", baseId=" + baseId
                + ", variationId=" + variationId + ", minHp3=" + minHp3 + ", minHp4=" + minHp4 + ", minHp5=" + minHp5
                + ", maxHp=" + maxHp + ", addMaxHp1=" + addMaxHp1 + ", plusHp0=" + plusHp0 + ", plusHp1=" + plusHp1
                + ", plusHp2=" + plusHp2 + ", plusHp3=" + plusHp3 + ", plusHp4=" + plusHp4 + ", plusHp5=" + plusHp5
                + ", mcFullBonusHp5=" + mcFullBonusHp5 + ", minAtk3=" + minAtk3 + ", minAtk4=" + minAtk4 + ", minAtk5="
                + minAtk5 + ", maxAtk=" + maxAtk + ", addMaxAtk1=" + addMaxAtk1 + ", plusAtk0=" + plusAtk0
                + ", plusAtk1=" + plusAtk1 + ", plusAtk2=" + plusAtk2 + ", plusAtk3=" + plusAtk3 + ", plusAtk4="
                + plusAtk4 + ", plusAtk5=" + plusAtk5 + ", mcFullBonusAtk5=" + mcFullBonusAtk5 + ", minDef=" + minDef
                + ", defCoef=" + defCoef + ", modeChangeType=" + modeChangeType + ", modeId1=" + modeId1 + ", modeId2="
                + modeId2 + ", modeId3=" + modeId3 + ", modeId4=" + modeId4 + ", keepModeOnRevive=" + keepModeOnRevive
                + ", originCombo=" + originCombo + ", mode1Combo=" + mode1Combo + ", mode2Combo=" + mode2Combo
                + ", searchRange=" + searchRange + ", searchAngle=" + searchAngle + ", attackRangeType="
                + attackRangeType + ", burstAttack=" + burstAttack + ", dashAttack=" + dashAttack + ", avoid=" + avoid
                + ", avoidOnCombo=" + avoidOnCombo + ", backAvoidOnCombo=" + backAvoidOnCombo + ", guts=" + guts
                + ", appear=" + appear + ", revive=" + revive + ", disappear=" + disappear + ", win=" + win
                + ", effNameCriticalHit=" + effNameCriticalHit + ", skill1=" + skill1 + ", skill2=" + skill2
                + ", skillChainValidTime=" + skillChainValidTime + ", skillChainSpbarCount=" + skillChainSpbarCount
                + ", supportSkillNum=" + supportSkillNum + ", abilities11=" + abilities11 + ", abilities12="
                + abilities12 + ", abilities13=" + abilities13 + ", abilities14=" + abilities14 + ", abilities21="
                + abilities21 + ", abilities22=" + abilities22 + ", abilities23=" + abilities23 + ", abilities24="
                + abilities24 + ", abilities31=" + abilities31 + ", abilities32=" + abilities32 + ", abilities33="
                + abilities33 + ", abilities34=" + abilities34 + ", exAbilityData1=" + exAbilityData1
                + ", exAbilityData2=" + exAbilityData2 + ", exAbilityData3=" + exAbilityData3 + ", exAbilityData4="
                + exAbilityData4 + ", exAbilityData5=" + exAbilityData5 + ", exAbility2Data1=" + exAbility2Data1
                + ", exAbility2Data2=" + exAbility2Data2 + ", exAbility2Data3=" + exAbility2Data3 + ", exAbility2Data4="
                + exAbility2Data4 + ", exAbility2Data5=" + exAbility2Data5 + ", chargeType=" + chargeType
                + ", maxChargeLv=" + maxChargeLv + ", onChangeBADuringCharge=" + onChangeBADuringCharge
                + ", holdEditSkillCost=" + holdEditSkillCost + ", editSkillId=" + editSkillId + ", editSkillLevelNum="
                + editSkillLevelNum + ", editSkillCost=" + editSkillCost + ", editSkillRelationId="
                + editSkillRelationId + ", editReleaseEntityType1=" + editReleaseEntityType1 + ", editReleaseEntityId1="
                + editReleaseEntityId1 + ", editReleaseEntityQuantity1=" + editReleaseEntityQuantity1
                + ", isUnuseDmodeEditSkill=" + isUnuseDmodeEditSkill + ", manaCircleName=" + manaCircleName
                + ", charaLimitBreak=" + charaLimitBreak + ", pieceElementGroupId=" + pieceElementGroupId
                + ", pieceMaterialElementId=" + pieceMaterialElementId + ", awakeNeedEntityType4="
                + awakeNeedEntityType4 + ", awakeNeedEntityId4=" + awakeNeedEntityId4 + ", awakeNeedEntityQuantity4="
                + awakeNeedEntityQuantity4 + ", awakeNeedEntityType5=" + awakeNeedEntityType5 + ", awakeNeedEntityId5="
                + awakeNeedEntityId5 + ", awakeNeedEntityQuantity5=" + awakeNeedEntityQuantity5 + ", cvInfo=" + cvInfo
                + ", cvInfoEn=" + cvInfoEn + ", profileText=" + profileText + ", releaseStartDate=" + releaseStartDate
                + ", isViewSummonScene=" + isViewSummonScene + ", motionType=" + motionType + ", personMotionType="
                + personMotionType + ", isDetailimage=" + isDetailimage + ", voiceType=" + voiceType
                + ", seasonVoiceId=" + seasonVoiceId + ", specialOndamageVoice=" + specialOndamageVoice + ", baseScale="
                + baseScale + ", uniqueWeaponId=" + uniqueWeaponId + ", uniqueWeaponSkinId=" + uniqueWeaponSkinId
                + ", attachWeaponHandType=" + attachWeaponHandType + ", winFaceEyeMotion=" + winFaceEyeMotion
                + ", winFaceMouthMotion=" + winFaceMouthMotion + ", uniqueDragonId=" + uniqueDragonId
                + ", isConvertDragonSkillLevel=" + isConvertDragonSkillLevel + ", isEnhanceChara=" + isEnhanceChara
                + ", isPlayable=" + isPlayable + ", defaultAbility1Level=" + defaultAbility1Level
                + ", defaultAbility2Level=" + defaultAbility2Level + ", defaultAbility3Level=" + defaultAbility3Level
                + ", defaultBurstAttackLevel=" + defaultBurstAttackLevel + ", defaultIsUnlockEditSkill="
                + defaultIsUnlockEditSkill + ", uniqueGrowMaterialId1=" + uniqueGrowMaterialId1
                + ", uniqueGrowMaterialId2=" + uniqueGrowMaterialId2 + ", maxFriendshipPoint=" + maxFriendshipPoint
                + ", growMaterialOnlyStartDate=" + growMaterialOnlyStartDate + ", growMaterialOnlyEndDate="
                + growMaterialOnlyEndDate + ", growMaterialId=" + growMaterialId + ", dmodeLevelGroupId="
                + dmodeLevelGroupId + ", mcFullReleaseEntityType1=" + mcFullReleaseEntityType1
                + ", mcFullReleaseEntityId1=" + mcFullReleaseEntityId1 + ", mcFullReleaseEntityQuantity1="
                + mcFullReleaseEntityQuantity1 + ", mcFullReleaseEntityType2=" + mcFullReleaseEntityType2
                + ", mcFullReleaseEntityId2=" + mcFullReleaseEntityId2 + ", mcFullReleaseEntityQuantity2="
                + mcFullReleaseEntityQuantity2 + ", baseAuraMaxLimitLevel=" + baseAuraMaxLimitLevel
                + ", footprintsType=" + footprintsType + ", uniqueIndex=" + uniqueIndex + "]";
    }



    //Getters & Setters
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
            switch(this.id){
                case 19900001:{
                    tempName = "Tutorial Zethia";
                    break;
                }
                case 19900002:{
                    tempName = "Story Leif 1";
                    break;
                }
                case 19900003:{
                    tempName = "Yellow Notte";
                    break;
                }
                case 19900004:{
                    tempName = "Puppy";
                    break;
                }
                case 19900005:{
                    tempName = "Story Leif 2";
                    break;
                }
                case 19900006:{
                    tempName = "Blue Notte";
                    break;
                }
                case 99900009:{
                    tempName = "Gunner Cleo";
                    break;
                }
                case 99130001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
                case 99230001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
                case 99330001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
                case 99430001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
                case 99530001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
                case 99630001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
                case 99730001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
                case 99830001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
                case 99930001:{
                    tempName = "Unplayable ID: " + id;
                    break;
                }
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

    public String getWeaponType() {
        return Types.getWeapon(this.weaponType);
    }

    public void setWeaponType(int weaponType) {
        this.weaponType = weaponType;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getMaxLimitBreakCount() {
        return maxLimitBreakCount;
    }

    public void setMaxLimitBreakCount(int maxLimitBreakCount) {
        this.maxLimitBreakCount = maxLimitBreakCount;
    }

    public String getElementalType() {
        return Types.getElement(this.elementalType);
    }

    public void setElementalType(int elementalType) {
        this.elementalType = elementalType;
    }

    public String getCharaType() {
        return Types.getRole(this.charaType);
    }

    public void setCharaType(int charaType) {
        this.charaType = charaType;
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

    public int getMinHp3() {
        return minHp3;
    }

    public void setMinHp3(int minHp3) {
        this.minHp3 = minHp3;
    }

    public int getMinHp4() {
        return minHp4;
    }

    public void setMinHp4(int minHp4) {
        this.minHp4 = minHp4;
    }

    public int getMinHp5() {
        return minHp5;
    }

    public void setMinHp5(int minHp5) {
        this.minHp5 = minHp5;
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

    public int getPlusHp0() {
        return plusHp0;
    }

    public void setPlusHp0(int plusHp0) {
        this.plusHp0 = plusHp0;
    }

    public int getPlusHp1() {
        return plusHp1;
    }

    public void setPlusHp1(int plusHp1) {
        this.plusHp1 = plusHp1;
    }

    public int getPlusHp2() {
        return plusHp2;
    }

    public void setPlusHp2(int plusHp2) {
        this.plusHp2 = plusHp2;
    }

    public int getPlusHp3() {
        return plusHp3;
    }

    public void setPlusHp3(int plusHp3) {
        this.plusHp3 = plusHp3;
    }

    public int getPlusHp4() {
        return plusHp4;
    }

    public void setPlusHp4(int plusHp4) {
        this.plusHp4 = plusHp4;
    }

    public int getPlusHp5() {
        return plusHp5;
    }

    public void setPlusHp5(int plusHp5) {
        this.plusHp5 = plusHp5;
    }

    public int getMcFullBonusHp5() {
        return mcFullBonusHp5;
    }

    public void setMcFullBonusHp5(int mcFullBonusHp5) {
        this.mcFullBonusHp5 = mcFullBonusHp5;
    }

    public int getMinAtk3() {
        return minAtk3;
    }

    public void setMinAtk3(int minAtk3) {
        this.minAtk3 = minAtk3;
    }

    public int getMinAtk4() {
        return minAtk4;
    }

    public void setMinAtk4(int minAtk4) {
        this.minAtk4 = minAtk4;
    }

    public int getMinAtk5() {
        return minAtk5;
    }

    public void setMinAtk5(int minAtk5) {
        this.minAtk5 = minAtk5;
    }

    public int getMaxAtk() {
        return maxAtk;
    }

    public void setMaxAtk(int maxAtk) {
        this.maxAtk = maxAtk;
    }

    public int getAddMaxAtk1() {
        return addMaxAtk1;
    }

    public void setAddMaxAtk1(int addMaxAtk1) {
        this.addMaxAtk1 = addMaxAtk1;
    }

    public int getPlusAtk0() {
        return plusAtk0;
    }

    public void setPlusAtk0(int plusAtk0) {
        this.plusAtk0 = plusAtk0;
    }

    public int getPlusAtk1() {
        return plusAtk1;
    }

    public void setPlusAtk1(int plusAtk1) {
        this.plusAtk1 = plusAtk1;
    }

    public int getPlusAtk2() {
        return plusAtk2;
    }

    public void setPlusAtk2(int plusAtk2) {
        this.plusAtk2 = plusAtk2;
    }

    public int getPlusAtk3() {
        return plusAtk3;
    }

    public void setPlusAtk3(int plusAtk3) {
        this.plusAtk3 = plusAtk3;
    }

    public int getPlusAtk4() {
        return plusAtk4;
    }

    public void setPlusAtk4(int plusAtk4) {
        this.plusAtk4 = plusAtk4;
    }

    public int getPlusAtk5() {
        return plusAtk5;
    }

    public void setPlusAtk5(int plusAtk5) {
        this.plusAtk5 = plusAtk5;
    }

    public int getMcFullBonusAtk5() {
        return mcFullBonusAtk5;
    }

    public void setMcFullBonusAtk5(int mcFullBonusAtk5) {
        this.mcFullBonusAtk5 = mcFullBonusAtk5;
    }

    public int getMinDef() {
        return minDef;
    }

    public void setMinDef(int minDef) {
        this.minDef = minDef;
    }

    public double getDefCoef() {
        return defCoef;
    }

    public void setDefCoef(double defCoef) {
        this.defCoef = defCoef;
    }

    public int getModeChangeType() {
        return modeChangeType;
    }

    public void setModeChangeType(int modeChangeType) {
        this.modeChangeType = modeChangeType;
    }

    public int getModeId1() {
        return modeId1;
    }

    public void setModeId1(int modeId1) {
        this.modeId1 = modeId1;
    }

    public int getModeId2() {
        return modeId2;
    }

    public void setModeId2(int modeId2) {
        this.modeId2 = modeId2;
    }

    public int getModeId3() {
        return modeId3;
    }

    public void setModeId3(int modeId3) {
        this.modeId3 = modeId3;
    }

    public int getModeId4() {
        return modeId4;
    }

    public void setModeId4(int modeId4) {
        this.modeId4 = modeId4;
    }

    public int getKeepModeOnRevive() {
        return keepModeOnRevive;
    }

    public void setKeepModeOnRevive(int keepModeOnRevive) {
        this.keepModeOnRevive = keepModeOnRevive;
    }

    public int getOriginCombo() {
        return originCombo;
    }

    public void setOriginCombo(int originCombo) {
        this.originCombo = originCombo;
    }

    public int getMode1Combo() {
        return mode1Combo;
    }

    public void setMode1Combo(int mode1Combo) {
        this.mode1Combo = mode1Combo;
    }

    public int getMode2Combo() {
        return mode2Combo;
    }

    public void setMode2Combo(int mode2Combo) {
        this.mode2Combo = mode2Combo;
    }

    public double getSearchRange() {
        return searchRange;
    }

    public void setSearchRange(double searchRange) {
        this.searchRange = searchRange;
    }

    public double getSearchAngle() {
        return searchAngle;
    }

    public void setSearchAngle(double searchAngle) {
        this.searchAngle = searchAngle;
    }

    public int getAttackRangeType() {
        return attackRangeType;
    }

    public void setAttackRangeType(int attackRangeType) {
        this.attackRangeType = attackRangeType;
    }

    public int getBurstAttack() {
        return burstAttack;
    }

    public void setBurstAttack(int burstAttack) {
        this.burstAttack = burstAttack;
    }

    public int getDashAttack() {
        return dashAttack;
    }

    public void setDashAttack(int dashAttack) {
        this.dashAttack = dashAttack;
    }

    public int getAvoid() {
        return avoid;
    }

    public void setAvoid(int avoid) {
        this.avoid = avoid;
    }

    public int getAvoidOnCombo() {
        return avoidOnCombo;
    }

    public void setAvoidOnCombo(int avoidOnCombo) {
        this.avoidOnCombo = avoidOnCombo;
    }

    public int getBackAvoidOnCombo() {
        return backAvoidOnCombo;
    }

    public void setBackAvoidOnCombo(int backAvoidOnCombo) {
        this.backAvoidOnCombo = backAvoidOnCombo;
    }

    public int getGuts() {
        return guts;
    }

    public void setGuts(int guts) {
        this.guts = guts;
    }

    public int getAppear() {
        return appear;
    }

    public void setAppear(int appear) {
        this.appear = appear;
    }

    public int getRevive() {
        return revive;
    }

    public void setRevive(int revive) {
        this.revive = revive;
    }

    public int getDisappear() {
        return disappear;
    }

    public void setDisappear(int disappear) {
        this.disappear = disappear;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public String getEffNameCriticalHit() {
        return effNameCriticalHit;
    }

    public void setEffNameCriticalHit(String effNameCriticalHit) {
        this.effNameCriticalHit = effNameCriticalHit;
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

    public double getSkillChainValidTime() {
        return skillChainValidTime;
    }

    public void setSkillChainValidTime(double skillChainValidTime) {
        this.skillChainValidTime = skillChainValidTime;
    }

    public int getSkillChainSpbarCount() {
        return skillChainSpbarCount;
    }

    public void setSkillChainSpbarCount(int skillChainSpbarCount) {
        this.skillChainSpbarCount = skillChainSpbarCount;
    }

    public int getSupportSkillNum() {
        return supportSkillNum;
    }

    public void setSupportSkillNum(int supportSkillNum) {
        this.supportSkillNum = supportSkillNum;
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

    public int getAbilities31() {
        return abilities31;
    }

    public void setAbilities31(int abilities31) {
        this.abilities31 = abilities31;
    }

    public int getAbilities32() {
        return abilities32;
    }

    public void setAbilities32(int abilities32) {
        this.abilities32 = abilities32;
    }

    public int getAbilities33() {
        return abilities33;
    }

    public void setAbilities33(int abilities33) {
        this.abilities33 = abilities33;
    }

    public int getAbilities34() {
        return abilities34;
    }

    public void setAbilities34(int abilities34) {
        this.abilities34 = abilities34;
    }

    public int getExAbilityData1() {
        return exAbilityData1;
    }

    public void setExAbilityData1(int exAbilityData1) {
        this.exAbilityData1 = exAbilityData1;
    }

    public int getExAbilityData2() {
        return exAbilityData2;
    }

    public void setExAbilityData2(int exAbilityData2) {
        this.exAbilityData2 = exAbilityData2;
    }

    public int getExAbilityData3() {
        return exAbilityData3;
    }

    public void setExAbilityData3(int exAbilityData3) {
        this.exAbilityData3 = exAbilityData3;
    }

    public int getExAbilityData4() {
        return exAbilityData4;
    }

    public void setExAbilityData4(int exAbilityData4) {
        this.exAbilityData4 = exAbilityData4;
    }

    public int getExAbilityData5() {
        return exAbilityData5;
    }

    public void setExAbilityData5(int exAbilityData5) {
        this.exAbilityData5 = exAbilityData5;
    }

    public int getExAbility2Data1() {
        return exAbility2Data1;
    }

    public void setExAbility2Data1(int exAbility2Data1) {
        this.exAbility2Data1 = exAbility2Data1;
    }

    public int getExAbility2Data2() {
        return exAbility2Data2;
    }

    public void setExAbility2Data2(int exAbility2Data2) {
        this.exAbility2Data2 = exAbility2Data2;
    }

    public int getExAbility2Data3() {
        return exAbility2Data3;
    }

    public void setExAbility2Data3(int exAbility2Data3) {
        this.exAbility2Data3 = exAbility2Data3;
    }

    public int getExAbility2Data4() {
        return exAbility2Data4;
    }

    public void setExAbility2Data4(int exAbility2Data4) {
        this.exAbility2Data4 = exAbility2Data4;
    }

    public int getExAbility2Data5() {
        return exAbility2Data5;
    }

    public void setExAbility2Data5(int exAbility2Data5) {
        this.exAbility2Data5 = exAbility2Data5;
    }

    public int getChargeType() {
        return chargeType;
    }

    public void setChargeType(int chargeType) {
        this.chargeType = chargeType;
    }

    public int getMaxChargeLv() {
        return maxChargeLv;
    }

    public void setMaxChargeLv(int maxChargeLv) {
        this.maxChargeLv = maxChargeLv;
    }

    public int getOnChangeBADuringCharge() {
        return onChangeBADuringCharge;
    }

    public void setOnChangeBADuringCharge(int onChangeBADuringCharge) {
        this.onChangeBADuringCharge = onChangeBADuringCharge;
    }

    public int getHoldEditSkillCost() {
        return holdEditSkillCost;
    }

    public void setHoldEditSkillCost(int holdEditSkillCost) {
        this.holdEditSkillCost = holdEditSkillCost;
    }

    public int getEditSkillId() {
        return editSkillId;
    }

    public void setEditSkillId(int editSkillId) {
        this.editSkillId = editSkillId;
    }

    public int getEditSkillLevelNum() {
        return editSkillLevelNum;
    }

    public void setEditSkillLevelNum(int editSkillLevelNum) {
        this.editSkillLevelNum = editSkillLevelNum;
    }

    public int getEditSkillCost() {
        return editSkillCost;
    }

    public void setEditSkillCost(int editSkillCost) {
        this.editSkillCost = editSkillCost;
    }

    public int getEditSkillRelationId() {
        return editSkillRelationId;
    }

    public void setEditSkillRelationId(int editSkillRelationId) {
        this.editSkillRelationId = editSkillRelationId;
    }
    public int getEditReleaseEntityType1() {
        return editReleaseEntityType1;
    }
    public void setEditReleaseEntityType1(int editReleaseEntityType1) {
        this.editReleaseEntityType1 = editReleaseEntityType1;
    }
    public int getEditReleaseEntityId1() {
        return editReleaseEntityId1;
    }
    public void setEditReleaseEntityId1(int editReleaseEntityId1) {
        this.editReleaseEntityId1 = editReleaseEntityId1;
    }
    public int getEditReleaseEntityQuantity1() {
        return editReleaseEntityQuantity1;
    }
    public void setEditReleaseEntityQuantity1(int editReleaseEntityQuantity1) {
        this.editReleaseEntityQuantity1 = editReleaseEntityQuantity1;
    }
    public int getIsUnuseDmodeEditSkill() {
        return isUnuseDmodeEditSkill;
    }
    public void setIsUnuseDmodeEditSkill(int isUnuseDmodeEditSkill) {
        this.isUnuseDmodeEditSkill = isUnuseDmodeEditSkill;
    }
    public String getManaCircleName() {
        return manaCircleName;
    }
    public void setManaCircleName(String manaCircleName) {
        this.manaCircleName = manaCircleName;
    }
    public int getCharaLimitBreak() {
        return charaLimitBreak;
    }
    public void setCharaLimitBreak(int charaLimitBreak) {
        this.charaLimitBreak = charaLimitBreak;
    }
    public int getPieceElementGroupId() {
        return pieceElementGroupId;
    }
    public void setPieceElementGroupId(int pieceElementGroupId) {
        this.pieceElementGroupId = pieceElementGroupId;
    }
    public int getPieceMaterialElementId() {
        return pieceMaterialElementId;
    }
    public void setPieceMaterialElementId(int pieceMaterialElementId) {
        this.pieceMaterialElementId = pieceMaterialElementId;
    }
    public int getAwakeNeedEntityType4() {
        return awakeNeedEntityType4;
    }
    public void setAwakeNeedEntityType4(int awakeNeedEntityType4) {
        this.awakeNeedEntityType4 = awakeNeedEntityType4;
    }
    public int getAwakeNeedEntityId4() {
        return awakeNeedEntityId4;
    }
    public void setAwakeNeedEntityId4(int awakeNeedEntityId4) {
        this.awakeNeedEntityId4 = awakeNeedEntityId4;
    }
    public int getAwakeNeedEntityQuantity4() {
        return awakeNeedEntityQuantity4;
    }
    public void setAwakeNeedEntityQuantity4(int awakeNeedEntityQuantity4) {
        this.awakeNeedEntityQuantity4 = awakeNeedEntityQuantity4;
    }
    public int getAwakeNeedEntityType5() {
        return awakeNeedEntityType5;
    }
    public void setAwakeNeedEntityType5(int awakeNeedEntityType5) {
        this.awakeNeedEntityType5 = awakeNeedEntityType5;
    }
    public int getAwakeNeedEntityId5() {
        return awakeNeedEntityId5;
    }
    public void setAwakeNeedEntityId5(int awakeNeedEntityId5) {
        this.awakeNeedEntityId5 = awakeNeedEntityId5;
    }
    public int getAwakeNeedEntityQuantity5() {
        return awakeNeedEntityQuantity5;
    }
    public void setAwakeNeedEntityQuantity5(int awakeNeedEntityQuantity5) {
        this.awakeNeedEntityQuantity5 = awakeNeedEntityQuantity5;
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
    public String getProfileText() {
        return profileText;
    }
    public void setProfileText(String profileText) {
        this.profileText = profileText;
    }
    public String getReleaseStartDate() {
        return releaseStartDate;
    }
    public void setReleaseStartDate(String releaseStartDate) {
        this.releaseStartDate = releaseStartDate;
    }
    public int getIsViewSummonScene() {
        return isViewSummonScene;
    }
    public void setIsViewSummonScene(int isViewSummonScene) {
        this.isViewSummonScene = isViewSummonScene;
    }
    public int getMotionType() {
        return motionType;
    }
    public void setMotionType(int motionType) {
        this.motionType = motionType;
    }
    public int getPersonMotionType() {
        return personMotionType;
    }
    public void setPersonMotionType(int personMotionType) {
        this.personMotionType = personMotionType;
    }
    public int getIsDetailimage() {
        return isDetailimage;
    }
    public void setIsDetailimage(int isDetailimage) {
        this.isDetailimage = isDetailimage;
    }
    public int getVoiceType() {
        return voiceType;
    }
    public void setVoiceType(int voiceType) {
        this.voiceType = voiceType;
    }
    public int getSeasonVoiceId() {
        return seasonVoiceId;
    }
    public void setSeasonVoiceId(int seasonVoiceId) {
        this.seasonVoiceId = seasonVoiceId;
    }
    public int getSpecialOndamageVoice() {
        return specialOndamageVoice;
    }
    public void setSpecialOndamageVoice(int specialOndamageVoice) {
        this.specialOndamageVoice = specialOndamageVoice;
    }
    public double getBaseScale() {
        return baseScale;
    }
    public void setBaseScale(double baseScale) {
        this.baseScale = baseScale;
    }
    public int getUniqueWeaponId() {
        return uniqueWeaponId;
    }
    public void setUniqueWeaponId(int uniqueWeaponId) {
        this.uniqueWeaponId = uniqueWeaponId;
    }
    public int getUniqueWeaponSkinId() {
        return uniqueWeaponSkinId;
    }
    public void setUniqueWeaponSkinId(int uniqueWeaponSkinId) {
        this.uniqueWeaponSkinId = uniqueWeaponSkinId;
    }
    public int getAttachWeaponHandType() {
        return attachWeaponHandType;
    }
    public void setAttachWeaponHandType(int attachWeaponHandType) {
        this.attachWeaponHandType = attachWeaponHandType;
    }
    public int getWinFaceEyeMotion() {
        return winFaceEyeMotion;
    }
    public void setWinFaceEyeMotion(int winFaceEyeMotion) {
        this.winFaceEyeMotion = winFaceEyeMotion;
    }
    public int getWinFaceMouthMotion() {
        return winFaceMouthMotion;
    }
    public void setWinFaceMouthMotion(int winFaceMouthMotion) {
        this.winFaceMouthMotion = winFaceMouthMotion;
    }
    public int getUniqueDragonId() {
        return uniqueDragonId;
    }
    public void setUniqueDragonId(int uniqueDragonId) {
        this.uniqueDragonId = uniqueDragonId;
    }
    public int getIsConvertDragonSkillLevel() {
        return isConvertDragonSkillLevel;
    }
    public void setIsConvertDragonSkillLevel(int isConvertDragonSkillLevel) {
        this.isConvertDragonSkillLevel = isConvertDragonSkillLevel;
    }
    public int getIsEnhanceChara() {
        return isEnhanceChara;
    }
    public void setIsEnhanceChara(int isEnhanceChara) {
        this.isEnhanceChara = isEnhanceChara;
    }
    public int getIsPlayable() {
        return isPlayable;
    }
    public void setIsPlayable(int isPlayable) {
        this.isPlayable = isPlayable;
    }
    public int getDefaultAbility1Level() {
        return defaultAbility1Level;
    }
    public void setDefaultAbility1Level(int defaultAbility1Level) {
        this.defaultAbility1Level = defaultAbility1Level;
    }
    public int getDefaultAbility2Level() {
        return defaultAbility2Level;
    }
    public void setDefaultAbility2Level(int defaultAbility2Level) {
        this.defaultAbility2Level = defaultAbility2Level;
    }
    public int getDefaultAbility3Level() {
        return defaultAbility3Level;
    }
    public void setDefaultAbility3Level(int defaultAbility3Level) {
        this.defaultAbility3Level = defaultAbility3Level;
    }
    public int getDefaultBurstAttackLevel() {
        return defaultBurstAttackLevel;
    }
    public void setDefaultBurstAttackLevel(int defaultBurstAttackLevel) {
        this.defaultBurstAttackLevel = defaultBurstAttackLevel;
    }
    public int getDefaultIsUnlockEditSkill() {
        return defaultIsUnlockEditSkill;
    }
    public void setDefaultIsUnlockEditSkill(int defaultIsUnlockEditSkill) {
        this.defaultIsUnlockEditSkill = defaultIsUnlockEditSkill;
    }
    public int getUniqueGrowMaterialId1() {
        return uniqueGrowMaterialId1;
    }
    public void setUniqueGrowMaterialId1(int uniqueGrowMaterialId1) {
        this.uniqueGrowMaterialId1 = uniqueGrowMaterialId1;
    }
    public int getUniqueGrowMaterialId2() {
        return uniqueGrowMaterialId2;
    }
    public void setUniqueGrowMaterialId2(int uniqueGrowMaterialId2) {
        this.uniqueGrowMaterialId2 = uniqueGrowMaterialId2;
    }
    public int getMaxFriendshipPoint() {
        return maxFriendshipPoint;
    }
    public void setMaxFriendshipPoint(int maxFriendshipPoint) {
        this.maxFriendshipPoint = maxFriendshipPoint;
    }
    public String getGrowMaterialOnlyStartDate() {
        return growMaterialOnlyStartDate;
    }
    public void setGrowMaterialOnlyStartDate(String growMaterialOnlyStartDate) {
        this.growMaterialOnlyStartDate = growMaterialOnlyStartDate;
    }
    public String getGrowMaterialOnlyEndDate() {
        return growMaterialOnlyEndDate;
    }
    public void setGrowMaterialOnlyEndDate(String growMaterialOnlyEndDate) {
        this.growMaterialOnlyEndDate = growMaterialOnlyEndDate;
    }
    public int getGrowMaterialId() {
        return growMaterialId;
    }
    public void setGrowMaterialId(int growMaterialId) {
        this.growMaterialId = growMaterialId;
    }
    public int getDmodeLevelGroupId() {
        return dmodeLevelGroupId;
    }
    public void setDmodeLevelGroupId(int dmodeLevelGroupId) {
        this.dmodeLevelGroupId = dmodeLevelGroupId;
    }
    public int getMcFullReleaseEntityType1() {
        return mcFullReleaseEntityType1;
    }
    public void setMcFullReleaseEntityType1(int mcFullReleaseEntityType1) {
        this.mcFullReleaseEntityType1 = mcFullReleaseEntityType1;
    }
    public int getMcFullReleaseEntityId1() {
        return mcFullReleaseEntityId1;
    }
    public void setMcFullReleaseEntityId1(int mcFullReleaseEntityId1) {
        this.mcFullReleaseEntityId1 = mcFullReleaseEntityId1;
    }
    public int getMcFullReleaseEntityQuantity1() {
        return mcFullReleaseEntityQuantity1;
    }
    public void setMcFullReleaseEntityQuantity1(int mcFullReleaseEntityQuantity1) {
        this.mcFullReleaseEntityQuantity1 = mcFullReleaseEntityQuantity1;
    }
    public int getMcFullReleaseEntityType2() {
        return mcFullReleaseEntityType2;
    }
    public void setMcFullReleaseEntityType2(int mcFullReleaseEntityType2) {
        this.mcFullReleaseEntityType2 = mcFullReleaseEntityType2;
    }
    public int getMcFullReleaseEntityId2() {
        return mcFullReleaseEntityId2;
    }
    public void setMcFullReleaseEntityId2(int mcFullReleaseEntityId2) {
        this.mcFullReleaseEntityId2 = mcFullReleaseEntityId2;
    }
    public int getMcFullReleaseEntityQuantity2() {
        return mcFullReleaseEntityQuantity2;
    }
    public void setMcFullReleaseEntityQuantity2(int mcFullReleaseEntityQuantity2) {
        this.mcFullReleaseEntityQuantity2 = mcFullReleaseEntityQuantity2;
    }
    public int getBaseAuraMaxLimitLevel() {
        return baseAuraMaxLimitLevel;
    }
    public void setBaseAuraMaxLimitLevel(int baseAuraMaxLimitLevel) {
        this.baseAuraMaxLimitLevel = baseAuraMaxLimitLevel;
    }
    public int getFootprintsType() {
        return footprintsType;
    }
    public void setFootprintsType(int footprintsType) {
        this.footprintsType = footprintsType;
    }
    public int getUniqueIndex() {
        return uniqueIndex;
    }
    public void setUniqueIndex(int uniqueIndex) {
        this.uniqueIndex = uniqueIndex;
    }

    
}

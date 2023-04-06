package com.dleditor.classes;

public class Types {
    enum Weapon{
        SWORD,
        BLADE,
        DAGGER,
        AXE,
        LANCE,
        BOW,
        WAND,
        STAFF,
        GUN
    }

    enum Element{
        FIRE,
        WATER,
        WIND,
        LIGHT,
        SHADOW,
        NONE
    }

    enum Class{
        ATTACK,
        DEFENSE,
        SUPPORT,
        HEALER
    }

    public static String getWeapon(int type){
        String weapon = "";
        switch(type){
            case 1:{
                weapon = "Sword";
                break;
            }
            case 2:{
                weapon = "Blade";
                break;
            }
            case 3:{
                weapon = "Dagger";
                break;
            }
            case 4:{
                weapon = "Axe";
                break;
            }
            case 5:{
                weapon = "Lance";
                break;
            }
            case 6:{
                weapon = "Bow";
                break;
            }
            case 7:{
                weapon = "Wand";
                break;
            }
            case 8:{
                weapon = "Staff";
                break;
            }
            case 9:{
                weapon = "Manacaster";
                break;
            }
            default:{
                weapon = "Unknown Weapon";
                break;
            }
        }
        return weapon;
    }

    public static String getElement(int type){
        String element = "";
        switch(type){
            case 1:{
                element = "Fire";
                break;
            }
            case 2:{
                element = "Water";
                break;
            }
            case 3:{
                element = "Wind";
                break;
            }
            case 4:{
                element = "Light";
                break;
            }
            case 5:{
                element = "Shadow";
                break;
            }
            case 99:{
                element = "No Element";
                break;
            }
            default:{
                element = "Unknown Element";
                break;
            }
        }
        return element;
    }

    public static String getRole(int type){
        String role = "";
        switch(type){
            case 1:{
                role = "Attack";
                break;
            }
            case 2:{
                role = "Defense";
                break;
            }
            case 3:{
                role = "Support";
                break;
            }
            case 4:{
                role = "Healer";
                break;
            }
        }
        return role;
    }

}

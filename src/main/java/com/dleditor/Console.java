package com.dleditor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.JsonObject;

import javafx.beans.Observable;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public abstract class Console {

    /**
    *This Class is a repository of helpful methods I've made for myself
    */

    private static Scanner sc = new Scanner(System.in);

    

    /**
     * Base getString, gives a prompt, and returns user input as a String
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @return Returns a String
     */
    public static String getString(String prompt) {

        System.out.print (prompt); 
        return sc.nextLine();

    }

    /**
     * Comparative getString, if user input doesn't match either of the two provided Strings, will loop until one does
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @param one First term to check against
     * @param two Second term to check against
     * @return Returns a String
     */
    public static String getString(String prompt, String one, String two) {

        while(true){

            String value = getString(prompt);

            if(value.equalsIgnoreCase(one) || value.equalsIgnoreCase(two)){

                return value;

            }else{
               
                System.out.println("Sorry, not an option!");

            }
        }
    }

    /**
     * Version of getString that won't accept whitespace as an input
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @return Returns a String
     */
    public static String getNonEmptyString(String prompt) {

        while(true){

            String value = getString(prompt);

            if(value.isEmpty() == false){

                return value;

            }else{
               
                System.out.println("String cannot be empty!");

            }
        }
    }

    /**
     * Comparative version of getString, if user input doesn't match either of the two provided Strings, or is only whitespace, will loop until an acceptable term is input
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @param one First term to check against
     * @param two Second term to check against
     * @return Returns a String
     */
    public static String getNonEmptyString(String prompt, String one, String two) {

        while(true){

            String value = getString(prompt);

            if(value.equalsIgnoreCase(one) || value.equalsIgnoreCase(two) && value.isEmpty() == false){

                return value;

            }else {
               
                System.out.println("Sorry, not an option!");

            }
            
        }
    }

    /**
     * Base version of getInt, if the user inputs an int, return it, otherwise ask again
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @return Returns an Int
     */
    public static int getInt(String prompt) {

        while(true) {
            
            System.out.print(prompt);

            try { 

                return Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) { 

                System.out.println("Error! Invalid integer value.");

            }
        }
    }

    /**
     * Version of getInt that will not quit until an integer between min and max is entered (Not Inclusive)
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @param min Minimum number
     * @param max Maximum number
     * @return Returns an Int
     */
    public static int getInt(String prompt, int min, int max) {

        while(true) {

            int value = getInt(prompt);

            if(value > min && value < max) {

                return value;

            } else {
                
                System.out.println("Error! Number must be greater than " + min + " and less than " + max + ".");

            }
        }
    }

    /**
     * Version of getInt that will not quit until an integer between min and max is entered (Inclusive)
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @param min Minimum number
     * @param max Maximum number
     * @return Returns an Int
     */
    public static int getIntEqual(String prompt, int min, int max) {

        while(true) {

            int value = getInt(prompt);

            if(value >= min && value <= max) {

                return value;

            } else {
                
                System.out.println("Error! Number must be greater than or equal to " + min + ", and less than or equal to " + max + ".");

            }
        }
    }

    /**
     * Base version of getDouble, will continue until a valid double is entered
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @return Returns a Double
     */
    public static double getDouble (String prompt) {

        while(true) {

            System.out.print(prompt);

            try {

                return Double.parseDouble(sc.nextLine()); 

            } catch (NumberFormatException e) {

                System.out.println("Error! Invalid double value.");

            }
        }
    }

    /**
     * Version of getDouble that will not quit until a double between min and max is entered (Not Inclusive)
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @param min Minimum number
     * @param max Maximum number
     * @return Returns a Double
     */
    public static double getDouble(String prompt, double min, double max) {

        while(true) { 
            double value = getDouble(prompt);

            if (value > min && value < max) {

                return value;

            } else {

                System.out.println("Error! Number must be greater than " + min + " and less than " + max + ".");

            }
        }
    }

    /**
     * Version of getDouble that will not quit until a double between min and max is entered (Inclusive)
     * @param prompt Prints a prompt such as "Continue? (y/n)"
     * @param min Minimum number
     * @param max Maximum number
     * @return Returns a Double
     */
    public static double getDoubleEqual(String prompt, double min, double max) {

        while(true) { 
            double value = getDouble(prompt);

            if (value >= min && value <= max) {

                return value;

            } else {

                System.out.println("Error! Number must be greater than or equal to " + min + ", and less than or equal to " + max + ".");

            }
        }
    }

    /**
     * This method will read a specified file into an array, and if the user wishes and the file is not found, will create the target file
     * @param fileName String, The name/path of the target file
     * @param createNew Boolean, if true, create target file if not already found
     * @return Returns the contents of a file with each line being a term in an ArrayList
     * @throws FileNotFoundException
     */
    public static ArrayList<String> getFileData(String fileName, boolean createNew) throws FileNotFoundException{

        ArrayList<String> fileContents = new ArrayList<String>();

        try{

            BufferedReader in = new BufferedReader(new FileReader(fileName));

            String curLine = in.readLine();
            fileContents.add(curLine);

            while(curLine != null) {
                curLine = in.readLine();
                fileContents.add(curLine);
            }

            
            fileContents.remove(null);
            fileContents.remove("");

            in.close();

            

        }catch (FileNotFoundException e) {
            if(createNew == true){
                //Create a new file if not found
                File newFile = new File(fileName);
                
                try {
                    newFile.createNewFile();
                    System.out.println("File '"+ fileName +"'' wasn't found, and so it was created!");
                } catch (IOException e1) {
    
                    e1.printStackTrace();
                    
                }
            }else{
                throw e;
            }
            
        }catch (IOException e1) {
            e1.printStackTrace();
        }
        return fileContents;
    }

    /**
     * This method will read a specified file into an array, and if the user wishes and the file is not found, will create the target file
     * @param fileName String, The name/path of the target file
     * @param createNew Boolean, if true, create target file if not already found
     * @return Returns the contents of a file with each line being a term in an ArrayList
     * @throws FileNotFoundException
     */
    public static ArrayList<String> splitFile(String fileName, String splitChar) throws FileNotFoundException{

        ArrayList<String> fileContents = new ArrayList<String>();

        try{

            BufferedReader in = new BufferedReader(new FileReader(fileName));

            String file = Files.readString(Paths.get(fileName));

            String[] fileArray = file.split(splitChar);
            
            for(int i = 0; i < fileArray.length; i++){
                fileContents.add(fileArray[i]);
            }

            fileContents.remove(null);
            fileContents.remove("");

            in.close();

            

        }catch (FileNotFoundException e){}catch (IOException e1) {e1.printStackTrace();}
        return fileContents;
    }

    /**
     * This method will read a specified file into an array, and then output an array of every line in the file that contains a specified term
     * @param fileName String, The name/path of the target file
     * @param searchTerm String, The term this'll look for in the line to add to the output
     * @return Returns the contents of a file with each line being a term in an ArrayList
     * @throws FileNotFoundException
     */
    public static ArrayList<String> getSpecificFileData(String fileName, String searchTerm) throws FileNotFoundException{

        ArrayList<String> fileContents = new ArrayList<String>();
        ArrayList<String> output = new ArrayList<String>();

        try{
            fileContents = getFileData(fileName, false);
        }catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        for(int i = 0; i < fileContents.size(); i++){
            if(fileContents.get(i).contains(searchTerm)){
                output.add(fileContents.get(i));
            }
        }

        return output;
    }

    /**
     * This method will read a specified file into an array, and then output an array of every line in the file that contains a specified term
     * @param fileName String, The name/path of the target file
     * @param searchTerm String, The term this'll look for in the line to add to the output
     * @return Returns the contents of a file with each line being a term in an ArrayList
     * @throws FileNotFoundException
     */
    public static ArrayList<Integer> getSpecificFileDataInt(String fileName, String searchTerm) throws FileNotFoundException{

        ArrayList<String> fileContents = new ArrayList<String>();
        ArrayList<Integer> output = new ArrayList<>();

        try{
            fileContents = getFileData(fileName, false);
        }catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        for(int i = 0; i < fileContents.size(); i++){
            if(fileContents.get(i).contains(searchTerm)){
                output.add((Integer.parseInt(fileContents.get(i))));
            }
        }

        return output;
    }

    /**
     * This method will read a specified file into an array, and then output an array of every line in the file that contains a specified term
     * @param fileName String, The name/path of the target file
     * @param searchTerm String, The term this'll look for in the line to add to the output
     * @return Returns the contents of a file with each line being a term in an ArrayList
     * @throws FileNotFoundException
     */
    public static ArrayList<Double> getSpecificFileDataDouble(String fileName, String searchTerm) throws FileNotFoundException{

        ArrayList<String> fileContents = new ArrayList<String>();
        ArrayList<Double> output = new ArrayList<>();

        try{
            fileContents = getFileData(fileName, false);
        }catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        for(int i = 0; i < fileContents.size(); i++){
            if(fileContents.get(i).contains(searchTerm)){
                output.add((Double.parseDouble(fileContents.get(i))));
            }
        }

        return output;
    }

    /**
     * This method is to specifically grab a line of a given file based on finding another line.
     * Ex: Search for Line #2, but return Line #3
     */
    public static String grabText(String fileName, String searchTerm, int step) throws FileNotFoundException{
        String text = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String curLine = "";
            for(int i = 0; i < 1000000; i++){
                curLine = in.readLine();
                if(curLine.contains("_Id") && curLine.contains(searchTerm)){
                    break;
                }
            }
            for(int k = 0; k < step; k++){
                curLine = in.readLine();
            }
            text = curLine;
            in.close();
        }catch (FileNotFoundException e) {
        }catch (IOException e1) {
        }
        return text;
    }

    /**
     * Appends the given input string to a specified file
     * @param fileName String, Name/path of the target file
     * @param input String, Text to append to target file
     * @throws IOException
     */
    public static void writeToFile(String fileName, String input) throws IOException {
        
        try{
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName,true)));
            out.println(input);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
    }

    /**
     * Overwrites the contents of a specified file with the given input
     * @param fileName String, The name/path of the target file
     * @param input String, The text to replace the contents of the file with
     * @throws IOException
     */
    public static void overwriteToFile(String fileName, String input) throws IOException {

        try{
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            out.println(input);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
    }

    /**
     * Checks if a given file exists
     * @param fileName String, Name/Path of the target file
     * @return Returns True/False if file exists or not
     */
    public static boolean doesFileExist(String fileName){
        File file = new File(fileName);
        return file.exists() && !file.isDirectory();
    }



    //textField validation shenanigans go down here

    public static class Validation{
    
        public Validation() { 
             
        }
        
        
        public boolean isPresent(String value) {
            if (value.isEmpty()) {
                return false;
            }else{
                return true;
            }
        }

        public boolean isDouble(String value) {
            try {
                Double.parseDouble(value);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
        
        public boolean isInteger(String value) {
            try {
                Integer.parseInt(value);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
    } 
    
    /**
     * This method validates the information in a TextField
     * @param textField The TextField Object
     * @return Returns true or false
     */
    public static Boolean validateField(TextField textField){
        Validation v = new Validation();
        if(v.isPresent(textField.getText())){
            return true;
        }else{
            return false;
        }
    }

    public static Boolean validateFieldInt(TextField textField){
        Validation v = new Validation();
        if(validateField(textField)){
            if(v.isInteger(textField.getText())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static Boolean validateFieldDouble(TextField textField){
        Validation v = new Validation();
        if(validateField(textField)){
            if(v.isDouble(textField.getText())){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }


    public static void switchToggle(ToggleButton[] buttonList){
        for(ToggleButton toggle : buttonList){
            if(toggle.isSelected()){
                toggle.setDisable(true);
            }else{
                toggle.setDisable(false);
            }
        }
    }

    public static String switchToggleEquals(ToggleButton[] buttonList){
        String output = "";
        for(ToggleButton toggle : buttonList){
            if(toggle.isSelected()){
                toggle.setDisable(true);
                output = toggle.getText();
            }else{
                toggle.setDisable(false);
            }
        }
        return output;
    }

    public static void switchVisible(Object[] objectList, int index){
        for(int i = 0; i < objectList.length; i++){
            if(i == index){
                ((Node) objectList[i]).setVisible(true);
            }else{
                ((Node) objectList[i]).setVisible(false);
            }
        }
    }

    public static void toggleActive(Node trigger, Node[] objectList){
        try{
            if(((CheckBox) trigger).isSelected()){
                for(Node object : objectList){
                    object.setDisable(false);
                }
            }else{
                for(Node object : objectList){
                    object.setDisable(true);
                }
            }
        }catch(Exception e){
            try{
                if(((ToggleButton) trigger).isSelected()){
                for(Node object : objectList){
                    object.setDisable(false);
                }
                }else{
                    for(Node object : objectList){
                        object.setDisable(true);
                    }
                }
            }catch(Exception e1){}
        }
    }

    public static void compareChanges(Node element, Object base, Object changed){
        try{
            ((TextField) element).setPromptText(""+base);
            if(base.equals(changed)){
                ((TextField) element).setText(null);
            }else{
                ((TextField) element).setText(""+changed);
            }
        }catch(Exception e){

        }
        
    }
}
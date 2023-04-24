package com.dleditor;

import java.io.IOException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class SettingsController extends PrimaryController{

    @FXML private ChoiceBox themeBox;
    private static String tempTheme;
    @FXML private ToggleGroup emptyGroup;
    @FXML private ToggleButton emptyYes;
    @FXML private ToggleButton emptyNo;
    private static Boolean tempEmpty;
    private static JsonObject staticSettings;

    @FXML
    private void initialize(){
        //Get settings
        try {
            staticSettings = Console.getAsJsonObject("src\\main\\resources\\com\\dleditor\\settings.json");
            themeList = FXCollections.observableArrayList(((String[])Console.getFolderContents("src\\main\\resources\\com\\dleditor\\themes")));
            themeBox.setItems(themeList);
            themeBox.setValue(theme);
            if(getEmpty){
                emptyYes.setSelected(true);
                emptyYes.setDisable(true);
            }else{
                emptyNo.setSelected(true);
                emptyNo.setDisable(true);
            }
            tempTheme = theme;
            tempEmpty = getEmpty;
            themeBox.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
                public void changed(ObservableValue ov, Number value, Number new_value)
                {
                    tempTheme = themeList.get(new_value.intValue());
                }
            });
            emptyGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
                @Override
                public void changed(ObservableValue ov, Toggle oldToggle, Toggle newToggle) {
                    if(newToggle == emptyYes){
                        tempEmpty = true;
                    }else{
                        tempEmpty = false;
                    }
                }
                
            });
        }catch(Exception e){e.printStackTrace();}
    }

    public static void saveSettings(){
        theme = tempTheme;
        getEmpty = tempEmpty;
        staticSettings.addProperty("theme",theme);
        staticSettings.addProperty("loadEmptyByDefault", getEmpty);
        System.out.println(staticSettings);
        try {
            Console.writeAsJson(staticSettings, "src\\main\\resources\\com\\dleditor\\settings.json");
        } catch (JsonIOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @FXML
    private void selectButton(){
        Console.switchToggle(new ToggleButton[]{emptyYes,emptyNo});
    }

    @FXML
    private void openFolder(){
        Console.openFolder("src\\main\\resources\\com\\dleditor\\themes\\");
    }

}

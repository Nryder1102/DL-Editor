package com.dledit;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class PrimaryController extends App{

    @FXML public VBox listBox;
    @FXML public Label advNameLabel;
    @FXML public ToggleButton charButton;
    @FXML public ToggleButton dragButton;
    @FXML public ToggleButton wyrmButton;
    @FXML public ToggleButton[] mainList;
    @FXML public ToggleButton advBasicButton;
    @FXML public ToggleButton advAdvancedButton;
    @FXML public ToggleButton advStatsButton;
    @FXML public ToggleButton advSkillsButton;
    @FXML public ToggleButton[] advButtonList;
    @FXML public GridPane advBasicDetailGrid;
    @FXML public GridPane advSkillsDetailGrid1;
    @FXML public GridPane[] advDetailGrids;
    @FXML public CheckBox advEditSkill1;
    @FXML public TextField advSkillField1;
    @FXML public CheckBox advEditSkill2;
    @FXML public TextField advSkillField2;
    @FXML public CheckBox advEditAbility1;
    @FXML public CheckBox advEditAbility2;
    @FXML public CheckBox advEditAbility3;
    @FXML public TextField advAbilityField11;
    @FXML public TextField advAbilityField12;
    @FXML public TextField advAbilityField13;
    @FXML public TextField advAbilityField14;
    @FXML public TextField advAbilityField21;
    @FXML public TextField advAbilityField22;
    @FXML public TextField advAbilityField23;
    @FXML public TextField advAbilityField24;
    @FXML public TextField advAbilityField31;
    @FXML public TextField advAbilityField32;
    @FXML public TextField advAbilityField33;
    @FXML public TextField advAbilityField34;
    @FXML public CheckBox advEditCoAbility1;
    @FXML public CheckBox advEditCoAbility2;
    @FXML public TextField advCoAbilityField11;
    @FXML public TextField advCoAbilityField12;
    @FXML public TextField advCoAbilityField13;
    @FXML public TextField advCoAbilityField14;
    @FXML public TextField advCoAbilityField15;
    @FXML public TextField advCoAbilityField21;
    @FXML public TextField advCoAbilityField22;
    @FXML public TextField advCoAbilityField23;
    @FXML public TextField advCoAbilityField24;
    @FXML public TextField advCoAbilityField25;
    @FXML public ChoiceBox advElementBox;
    @FXML public ChoiceBox advRarityBox;
    @FXML public ChoiceBox advWeaponBox;
    @FXML public ChoiceBox advRoleBox;

    ObservableList<String> elementList = FXCollections.observableArrayList("Fire","Water","Wind","Light","Shadow","None");
    ObservableList<Integer> rarityList = FXCollections.observableArrayList(3,4,5);
    ObservableList<String> weaponList  = FXCollections.observableArrayList("Sword","Blade","Dagger","Axe","Lance","Bow","Wand","Staff","Gun");
    ObservableList<String> roleList = FXCollections.observableArrayList("Attack","Defense","Support","Healer");
    //Basic Controls
    //Ughhhhhhhh 
    //I think I have to do it all in one file because of how fxml works.... Ewwwwwww

    @FXML
    private void initialize(){
        mainList = new ToggleButton[]{charButton,dragButton,wyrmButton};
        advButtonList = new ToggleButton[]{advBasicButton,advAdvancedButton,advSkillsButton,advStatsButton};
        advDetailGrids = new GridPane[]{advBasicDetailGrid,advSkillsDetailGrid1};
        advElementBox.setItems(elementList);
        advRarityBox.setItems(rarityList);
        advWeaponBox.setItems(weaponList);
        advRoleBox.setItems(roleList);

        advEditSkill1.setOnAction(event -> Console.toggleActive(advEditSkill1, new TextField[]{advSkillField1}));
        advEditSkill2.setOnAction(event -> Console.toggleActive(advEditSkill2, new TextField[]{advSkillField2}));
        advEditAbility1.setOnAction(event -> Console.toggleActive(advEditAbility1, new TextField[]{advAbilityField11,advAbilityField12,advAbilityField13,advAbilityField14}));
        advEditAbility2.setOnAction(event -> Console.toggleActive(advEditAbility2, new TextField[]{advAbilityField21,advAbilityField22,advAbilityField23,advAbilityField24}));
        advEditAbility3.setOnAction(event -> Console.toggleActive(advEditAbility3, new TextField[]{advAbilityField31,advAbilityField32,advAbilityField33,advAbilityField34}));
        advEditCoAbility1.setOnAction(event -> Console.toggleActive(advEditCoAbility1, new TextField[]{advCoAbilityField11,advCoAbilityField12,advCoAbilityField13,advCoAbilityField14,advCoAbilityField15}));
        advEditCoAbility2.setOnAction(event -> Console.toggleActive(advEditCoAbility2, new TextField[]{advCoAbilityField21,advCoAbilityField22,advCoAbilityField23,advCoAbilityField24,advCoAbilityField25}));
    }

    @FXML
    private void switchListCharacter() throws IOException {
        Console.switchToggle(mainList);
        for(int i = 0; i < characterList.size(); i++){
            listBox.getChildren().add(new Button(characterList.get(i).getFullName()));
        }
    }

    @FXML
    private void switchListDragon() throws IOException {
        Console.switchToggle(mainList);
        for(int i = 0; i < dragonList.size(); i++){
            listBox.getChildren().add(new Button(dragonList.get(i).getFullName()));
        }
    }

    @FXML
    private void switchListTalisman() throws IOException {
        Console.switchToggle(mainList);
        for(int i = 0; i < talismanList.size(); i++){
            listBox.getChildren().add(new Button(talismanList.get(i).getName()));
        }
    }




    //Adventurer Related Section
    @FXML
    private void switchAdvDetails(){
        String currentPane = Console.switchToggleEquals(advButtonList);

        switch(currentPane){
            case "Basic Details":{
                Console.switchVisible(advDetailGrids, 0);
                break;
            }
            case "Skills & Abilities":{
                Console.switchVisible(advDetailGrids, 1);
                break;
            }
        }
    }
}

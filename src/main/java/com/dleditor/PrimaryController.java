package com.dleditor;
import java.io.IOException;

import com.dleditor.classes.Character;
import com.dleditor.classes.Dragon;
import com.dleditor.classes.Talisman;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class PrimaryController extends App{

    @FXML private VBox listBox;
    @FXML private ToggleButton charButton;
    @FXML private ToggleButton dragButton;
    @FXML private ToggleButton wyrmButton;
    @FXML private ToggleButton[] mainList;
    @FXML private ToggleButton advBasicButton;
    @FXML private ToggleButton advAdvancedButton;
    @FXML private ToggleButton advStatsButton;
    @FXML private ToggleButton advSkillsButton;
    @FXML private ToggleButton[] advButtonList;
    @FXML private GridPane advBasicDetailGrid;
    @FXML private GridPane advSkillsDetailGrid1;
    @FXML private GridPane advSkillsDetailGrid2;
    @FXML private GridPane[] advDetailGrids;
    @FXML private CheckBox advEditSkill1;
    @FXML private TextField advSkillField1;
    @FXML private CheckBox advEditSkill2;
    @FXML private TextField advSkillField2;
    @FXML private CheckBox advEditAbility1;
    @FXML private CheckBox advEditAbility2;
    @FXML private CheckBox advEditAbility3;
    @FXML private CheckBox[] advCheckBoxList;
    @FXML private TextField advAbilityField11;
    @FXML private TextField advAbilityField12;
    @FXML private TextField advAbilityField13;
    @FXML private TextField advAbilityField14;
    @FXML private TextField[] advAbility1;
    @FXML private TextField advAbilityField21;
    @FXML private TextField advAbilityField22;
    @FXML private TextField advAbilityField23;
    @FXML private TextField advAbilityField24;
    @FXML private TextField[] advAbility2;
    @FXML private TextField advAbilityField31;
    @FXML private TextField advAbilityField32;
    @FXML private TextField advAbilityField33;
    @FXML private TextField advAbilityField34;
    @FXML private TextField[] advAbility3;
    @FXML private CheckBox advEditCoAbility1;
    @FXML private CheckBox advEditCoAbility2;
    @FXML private TextField advCoAbilityField11;
    @FXML private TextField advCoAbilityField12;
    @FXML private TextField advCoAbilityField13;
    @FXML private TextField advCoAbilityField14;
    @FXML private TextField advCoAbilityField15;
    @FXML private TextField[] advCoAbility1;
    @FXML private TextField advCoAbilityField21;
    @FXML private TextField advCoAbilityField22;
    @FXML private TextField advCoAbilityField23;
    @FXML private TextField advCoAbilityField24;
    @FXML private TextField advCoAbilityField25;
    @FXML private TextField[] advCoAbility2;
    @FXML private ChoiceBox advElementBox;
    @FXML private ChoiceBox advRarityBox;
    @FXML private ChoiceBox advWeaponBox;
    @FXML private ChoiceBox advRoleBox;
    @FXML private Button advNextSkillGrid1;
    @FXML private Button advNextSkillGrid2;
    @FXML private CheckBox advEditChargeGroup;
    @FXML private CheckBox advEditEditSkillGroup;
    @FXML private CheckBox advEditLevelGroup;
    @FXML private TextField advBAChargeField;
    @FXML private TextField advChainTimeField;
    @FXML private TextField advChargeTypeField;
    @FXML private TextField advDefaultUnlockedField;
    @FXML private CheckBox advEditChainTime;
    @FXML private CheckBox advEditSupportSkillNum;
    @FXML private TextField advEntityIDField;
    @FXML private TextField advEntityQuantityField;
    @FXML private TextField advEntityTypeField;
    @FXML private TextField advEpithetBox;
    @FXML private TextField advHoldCostField;
    @FXML private TextField advMaxChargeField;
    @FXML private TextField advNameBox;
    @FXML private TextField advSecondBox;
    @FXML private TextField advSkillCostField;
    @FXML private TextField advSkillIDField;
    @FXML private TextField advSkillLevelField;
    @FXML private TextField advSkillRelationField;
    @FXML private TextField advSupportSkillField;
    @FXML private TextField advUnuseDmodeSkillField;
    @FXML private TextField[] advChargeList;
    @FXML private TextField[] advEditSkillList;
    @FXML private TextField[] advLevelList;
    @FXML private TextField advConvertDragonField;
    @FXML private TextField advDefaultAbility1Field;
    @FXML private TextField advDefaultAbility2Field;
    @FXML private TextField advDefaultAbility3Field;
    @FXML private TextField advDefaultBAField;


    ObservableList<String> elementList = FXCollections.observableArrayList("Fire","Water","Wind","Light","Shadow","None");
    ObservableList<Integer> rarityList = FXCollections.observableArrayList(3,4,5);
    ObservableList<String> weaponList  = FXCollections.observableArrayList("Sword","Blade","Dagger","Axe","Lance","Bow","Wand","Staff","Gun");
    ObservableList<String> roleList = FXCollections.observableArrayList("Attack","Defense","Support","Healer");
    
    //Basic Controls
    //Ughhhhhhhh 
    //I think I have to do it all in one file because of how fxml works.... Ewwwwwww

    @FXML
    private void initialize(){

        //Collection of arrays
        mainList = new ToggleButton[]{charButton,dragButton,wyrmButton};
        advButtonList = new ToggleButton[]{advBasicButton,advAdvancedButton,advSkillsButton,advStatsButton};
        advDetailGrids = new GridPane[]{advBasicDetailGrid,advSkillsDetailGrid1,advSkillsDetailGrid2};
        advCheckBoxList = new CheckBox[]{advEditSkill1,advEditSkill2,advEditAbility1,advEditAbility2,advEditAbility3,advEditCoAbility1,advEditCoAbility2,advEditChainTime,advEditSupportSkillNum,advEditChargeGroup,advEditEditSkillGroup,advEditLevelGroup};
        advAbility1 = new TextField[]{advAbilityField11,advAbilityField12,advAbilityField13,advAbilityField14};
        advAbility2 = new TextField[]{advAbilityField21,advAbilityField22,advAbilityField23,advAbilityField24};
        advAbility3 = new TextField[]{advAbilityField31,advAbilityField32,advAbilityField33,advAbilityField34};
        advCoAbility1 = new TextField[]{advCoAbilityField11,advCoAbilityField12,advCoAbilityField13,advCoAbilityField14,advCoAbilityField15};
        advCoAbility2 = new TextField[]{advCoAbilityField21,advCoAbilityField22,advCoAbilityField23,advCoAbilityField24,advCoAbilityField25};
        advChargeList = new TextField[]{advChargeTypeField,advMaxChargeField,advBAChargeField,advDefaultBAField};
        advEditSkillList = new TextField[]{advEntityIDField,advEntityQuantityField,advEntityTypeField,advHoldCostField,advSkillCostField,advSkillLevelField,advSkillRelationField,advDefaultUnlockedField,advSkillIDField,advUnuseDmodeSkillField};
        advLevelList = new TextField[]{advDefaultAbility1Field,advDefaultAbility2Field,advDefaultAbility3Field,advConvertDragonField};
        
        //Basic detail page dropdown lists
        advElementBox.setItems(elementList);
        advRarityBox.setItems(rarityList);
        advWeaponBox.setItems(weaponList);
        advRoleBox.setItems(roleList);

        //Skills detail page checkboxes & fields
        advEditSkill1.setOnAction(event -> Console.toggleActive(advCheckBoxList[0], new TextField[]{advSkillField1}));
        advEditSkill2.setOnAction(event -> Console.toggleActive(advCheckBoxList[1], new TextField[]{advSkillField2}));
        advEditAbility1.setOnAction(event -> Console.toggleActive(advCheckBoxList[2], advAbility1));
        advEditAbility2.setOnAction(event -> Console.toggleActive(advCheckBoxList[3], advAbility2));
        advEditAbility3.setOnAction(event -> Console.toggleActive(advCheckBoxList[4], advAbility3));
        advEditCoAbility1.setOnAction(event -> Console.toggleActive(advCheckBoxList[5], advCoAbility1));
        advEditCoAbility2.setOnAction(event -> Console.toggleActive(advCheckBoxList[6], advCoAbility2));
        advEditChainTime.setOnAction(event -> Console.toggleActive(advCheckBoxList[7], new TextField[]{advChainTimeField}));
        advEditSupportSkillNum.setOnAction(event -> Console.toggleActive(advCheckBoxList[8], new TextField[]{advSupportSkillField}));
        advEditChargeGroup.setOnAction(event -> Console.toggleActive(advCheckBoxList[9], advChargeList));
        advEditEditSkillGroup.setOnAction(event -> Console.toggleActive(advCheckBoxList[10], advEditSkillList));
        advEditLevelGroup.setOnAction(event -> Console.toggleActive(advCheckBoxList[11], advLevelList));
        advNextSkillGrid1.setOnAction(event -> Console.switchVisible(advDetailGrids, 2));
        advNextSkillGrid2.setOnAction(event -> Console.switchVisible(advDetailGrids, 1));
    }

    //These three methods are non-functional atm, until I get a good way of handling data
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

    //Switch detail panes
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

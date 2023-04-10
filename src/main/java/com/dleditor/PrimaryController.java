package com.dleditor;
import javafx.event.EventHandler;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javafx.beans.value.ChangeListener;

import com.dleditor.classes.Character;
import com.dleditor.classes.Dragon;
import com.dleditor.classes.Talisman;
import com.google.gson.JsonObject;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
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
    @FXML private ProgressBar loadChara;
    @FXML private ProgressBar loadDrag;
    @FXML private ProgressBar loadWyrm;

    ObservableList<String> elementList = FXCollections.observableArrayList("Fire","Water","Wind","Light","Shadow","None");
    ObservableList<Integer> rarityList = FXCollections.observableArrayList(3,4,5);
    ObservableList<String> weaponList  = FXCollections.observableArrayList("Sword","Blade","Dagger","Axe","Lance","Bow","Wand","Staff","Gun");
    ObservableList<String> roleList = FXCollections.observableArrayList("Attack","Defense","Support","Healer");

    private ArrayList<Button> charaButtons = new ArrayList<>();
    private ArrayList<Button> dragonButtons = new ArrayList<>();
    private ArrayList<Button> wyrmButtons = new ArrayList<>();

    ArrayList<JsonObject> characterList;
    ArrayList<JsonObject> dragonList;
    ArrayList<JsonObject> talismanList;

    @FXML private Label charaLabel;
    @FXML private Label dragLabel;
    @FXML private Label wyrmLabel;

    private Task<ArrayList<Button>> makeCharaList;
    private Task<Void> makeDragonList;
    private Task<Void> makeWyrmList;

    private static final String RED_BAR    = "red-bar";
    private static final String YELLOW_BAR = "yellow-bar";
    private static final String ORANGE_BAR = "orange-bar";
    private static final String GREEN_BAR  = "green-bar";
    private static final String[] barColorStyleClasses = { RED_BAR, ORANGE_BAR, YELLOW_BAR, GREEN_BAR };

    private int currentChar;
    
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
        try {
            characterList = Character.createCharacterList();
            dragonList = Dragon.createDragonList();
            talismanList = Talisman.createTalismanList();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        //Basic detail page dropdown lists
        advElementBox.setItems(elementList);
        advRarityBox.setItems(rarityList);
        advWeaponBox.setItems(weaponList);
        advRoleBox.setItems(roleList);

        //Block of setting actions and etc
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

        //Add listeners to the progress bars
        setBarListener(loadChara);
        setBarListener(loadDrag);
        setBarListener(loadWyrm);
        setBarStyleClass(loadChara, GREEN_BAR);
        setBarStyleClass(loadDrag, GREEN_BAR);
        setBarStyleClass(loadWyrm, GREEN_BAR);
        

        //Start making the lists
        makeLists();

        //Add css to the progress bars
        loadChara.getStylesheets().add(getClass().getResource("base.css").toExternalForm());
        loadDrag.getStylesheets().add(getClass().getResource("base.css").toExternalForm());
        loadWyrm.getStylesheets().add(getClass().getResource("base.css").toExternalForm());
        
    }

    //Switch the currently displayed list
    @FXML
    private void switchListCharacter() throws IOException {
        Console.switchToggle(mainList);
        listBox.getChildren().clear();
        listBox.getChildren().addAll(charaButtons);
    }

    @FXML
    private void switchListDragon() throws IOException {
        Console.switchToggle(mainList);
        listBox.getChildren().clear();
        listBox.getChildren().addAll(dragonButtons);
    }

    @FXML
    private void switchListTalisman() throws IOException {
        Console.switchToggle(mainList);
        listBox.getChildren().clear();
        listBox.getChildren().addAll(wyrmButtons);
        
    }




    //Adventurer Related Section

    //Switch detail panes
    @FXML
    private void switchAdvDetailPane(){
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

    //Put the current adventurer's details into the boxes
    @FXML
    private void switchAdvDetails(Button source){

        for(int i = 0; i < characterList.size(); i++){
            if(characterList.get(i).get("_Id").getAsInt() == Integer.parseInt(source.getId())){
                currentChar = i;
                advNameBox.setPromptText(Character.getName(characterList.get(i)));
                advSecondBox.setPromptText(Character.getSecondName(characterList.get(i)));
                if(Character.getSecondName(characterList.get(i)) == "Name not Found"){
                    advSecondBox.setDisable(true);
                }else{
                    advSecondBox.setDisable(false);
                }
            }
        }
        
    }


    private void makeLists(){
        loadChara.setProgress(-1);
        loadDrag.setProgress(-1);
        loadWyrm.setProgress(-1);

        //Make the character list of buttons
        makeCharaList = new Task<ArrayList<Button>>() {
            @Override protected ArrayList<Button> call() throws Exception {
                for(int i = 0; i < characterList.size(); i++){
                    if(isCancelled()){
                        break;
                    }
                    //If id != 0, add to list
                    if(characterList.get(i).get("_Id").getAsInt() != 0){
                        charaButtons.add(new Button(Character.getFullName(characterList.get(i))));
                        charaButtons.get(i).setId(characterList.get(i).get("_Id").getAsString());
                        charaButtons.get(i).setOnAction(e -> switchAdvDetails(((Button)e.getSource())));
                    }
                    updateProgress(i+1, characterList.size());
                    updateMessage(i+1 + "/" + characterList.size());
                }
                return charaButtons;
            }
            
        };
        makeCharaList.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                
            }
        });

        //Make the dragon list of buttons
        makeDragonList = new Task<Void>() {
            @Override protected Void call() throws Exception {
                for(int i = 0; i < dragonList.size(); i++){
                    if(isCancelled()){
                        break;
                    }
                    //If id != 0, add to list
                    if(dragonList.get(i).get("_Id").getAsInt() != 0){
                        dragonButtons.add(new Button(Dragon.getFullName(dragonList.get(i))));
                        dragonButtons.get(i).setId(dragonList.get(i).get("_Id").getAsString());
                    } 
                    updateProgress(i+1, dragonList.size());
                    updateMessage(i+1 + "/" + dragonList.size());
                }
                return null;
            }
        };
        makeDragonList.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                
            }
        });

        //Make the wyrmprint list of buttons
        makeWyrmList = new Task<Void>() {
            @Override protected Void call() throws Exception {
                for(int i = 0; i < talismanList.size(); i++){
                    if(isCancelled()){
                        break;
                    }
                    //If id != 0, add to list
                    if(talismanList.get(i).get("_Id").getAsInt() != 0){
                        wyrmButtons.add(new Button(Talisman.getName(talismanList.get(i))));
                        wyrmButtons.get(i).setId(talismanList.get(i).get("_Id").getAsString());
                    }
                    updateProgress(i+1, talismanList.size());
                    updateMessage(i+1 + "/" + talismanList.size());
                }
                return null;
            }
        };
        makeWyrmList.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                
            }
        });

        //Bind update progress to the gui
        loadChara.progressProperty().bind(makeCharaList.progressProperty());
        charaLabel.textProperty().bind(makeCharaList.messageProperty());
        loadDrag.progressProperty().bind(makeDragonList.progressProperty());
        dragLabel.textProperty().bind(makeDragonList.messageProperty());
        loadWyrm.progressProperty().bind(makeWyrmList.progressProperty());
        wyrmLabel.textProperty().bind(makeWyrmList.messageProperty());

        //Start the threads in the background
        new Thread(makeCharaList).start();
        new Thread(makeDragonList).start();
        new Thread(makeWyrmList).start();
    }

    //Set listeners on the bars, changing the colors based on progress
    private void setBarListener(ProgressBar bar){
        bar.progressProperty().addListener(new ChangeListener<Number>() {
            @Override public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
              double progress = newValue == null ? 0 : newValue.doubleValue();
              if (progress <= 0){
                setBarStyleClass(bar, RED_BAR);
              } else if (progress <= 0.3) {
                setBarStyleClass(bar, RED_BAR);
              } else if (progress <= 0.5) {
                setBarStyleClass(bar, ORANGE_BAR);
              } else if (progress <= 0.7) {
                setBarStyleClass(bar, YELLOW_BAR);
              } else {
                setBarStyleClass(bar, GREEN_BAR);
              }
            }
        });        
    }

    //Set the class of the bars to change the colors
    private void setBarStyleClass(ProgressBar bar, String barStyleClass) {
        bar.getStyleClass().removeAll(barColorStyleClasses);
        bar.getStyleClass().add(barStyleClass);
    } 

}

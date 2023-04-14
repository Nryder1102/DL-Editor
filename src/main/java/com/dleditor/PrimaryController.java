package com.dleditor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.dleditor.classes.Character;
import com.dleditor.classes.Dragon;
import com.dleditor.classes.Talisman;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.WindowEvent;

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
    @FXML private TextField advEpithetField;
    @FXML private TextField advHoldCostField;
    @FXML private TextField advMaxChargeField;
    @FXML private TextField advNameField;
    @FXML private TextField advSecondField;
    @FXML private TextField advFullIdField;
    @FXML private TextField advBaseIdField;
    @FXML private TextField advVariationField;
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
    ArrayList<JsonObject> changedCharacters;
    ArrayList<JsonObject> dragonList;
    ArrayList<JsonObject> changedDragons;
    ArrayList<JsonObject> talismanList;
    ArrayList<JsonObject> changedTalismans;

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

    private static boolean getEmpty = false;

    private String[] requiredFiles = {"src\\main\\resources\\com\\dleditor\\files\\CharaData.json","src\\main\\resources\\com\\dleditor\\files\\DragonData.json","src\\main\\resources\\com\\dleditor\\files\\TalismanData.json","src\\main\\resources\\com\\dleditor\\files\\TextLabel.json"};

    private ButtonType recheckFiles = new ButtonType("Check for Files", ButtonBar.ButtonData.OK_DONE);
    private ButtonType openLocation = new ButtonType("Open File Location", ButtonBar.ButtonData.CANCEL_CLOSE);

    private boolean task1Done = false;
    private boolean task2Done = false;
    private boolean task3Done = false;

    @FXML private MenuItem rebuildButton;
    
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
        
        //Add css to the progress bars
        loadChara.getStylesheets().add(getClass().getResource("base.css").toExternalForm());
        loadDrag.getStylesheets().add(getClass().getResource("base.css").toExternalForm());
        loadWyrm.getStylesheets().add(getClass().getResource("base.css").toExternalForm());

        fileCheck();
        
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
                /*This is a stopgap*/Console.compareChanges(advNameField, Character.getName(characterList.get(i)), Character.getName(changedCharacters.get(i)));
                /*This is a stopgap*/Console.compareChanges(advSecondField, Character.getSecondName(characterList.get(i)), Character.getSecondName(changedCharacters.get(i)));
                if(Character.getSecondName(characterList.get(i)) == "Name not Found"){advSecondField.setDisable(true);}else{advSecondField.setDisable(false);}
                Console.compareChanges(advBaseIdField, Character.getBaseId(characterList.get(i)), Character.getBaseId(changedCharacters.get(i)));
                Console.compareChanges(advFullIdField, Character.getId(characterList.get(i)), Character.getId(changedCharacters.get(i)));
                Console.compareChanges(advVariationField, Character.getVariationId(characterList.get(i)), Character.getVariationId(changedCharacters.get(i)));
                /*This is a stopgap*/Console.compareChanges(advEpithetField, Character.getEpithet(characterList.get(i)), Character.getEpithet(changedCharacters.get(i)));
                if(Character.getRarity(characterList.get(i)) == 3){
                    rarityList = FXCollections.observableArrayList(3,4,5);
                    advRarityBox.setItems(rarityList);
                    advRarityBox.setValue(3);
                }else if(Character.getRarity(characterList.get(i)) == 4){
                    rarityList = FXCollections.observableArrayList(4,5);
                    advRarityBox.setItems(rarityList);
                    advRarityBox.setValue(4);
                }else if(Character.getRarity(characterList.get(i)) == 5){
                    rarityList = FXCollections.observableArrayList(5);
                    advRarityBox.setItems(rarityList);
                    advRarityBox.setValue(5);
                }
                advElementBox.setValue(Character.getElementalType(characterList.get(i)));
                advRoleBox.setValue(Character.getCharaType(characterList.get(i)));
                advWeaponBox.setValue(Character.getWeaponType(characterList.get(i)));
            }
        }
        
    }


    private void makeLists(){
        //Make the character list of buttons
        ArrayList<Object[]> v = new ArrayList<>();
        List<String> keys = characterList.get(0).entrySet()
            .stream()
            .map(i -> i.getKey())
            .collect(Collectors.toCollection(ArrayList::new));

        for(JsonObject element : characterList){
            ArrayList<Object> temp = new ArrayList<>();
            for(String key : keys){
                
                temp.add(element.get(key));
               
            }
            temp.set(1,"z");
            temp.set(2,"x");
            temp.set(3,"y");
            v.add(temp.toArray());
        }
        System.out.println(v.get(2)[1]);
        makeCharaList = new Task<ArrayList<Button>>() {
            @Override protected ArrayList<Button> call() throws Exception {
                task1Done = false;
                int listSize = 1;
                //Get the size of list without empty objects if getEmpty is false
                if(getEmpty == false){
                    for(JsonObject object : characterList){
                        if(object.get("_Id").getAsInt() != 0){
                            listSize++;
                        }
                    }
                }else{
                    listSize = characterList.size();
                }

                for(int i = 0; i < listSize; i++){
                    if(isCancelled()){
                        break;
                    }
                   
                    charaButtons.add(new Button(Character.getFullName(characterList.get(i))));
                    charaButtons.get(i).setId(characterList.get(i).get("_Id").getAsString());
                    charaButtons.get(i).setOnAction(e -> switchAdvDetails(((Button)e.getSource())));
                    
                    updateProgress(i+1, listSize);
                    updateMessage(i+1 + "/" + listSize);
                }
                return charaButtons;
            }
            
        };
        makeCharaList.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                task1Done = true;
            }
        });

        //Make the dragon list of buttons
        makeDragonList = new Task<Void>() {
            @Override protected Void call() throws Exception {
                task2Done = false;
                int listSize = 1;

                //Get the size of list without empty objects if getEmpty is false
                if(getEmpty == false){
                    for(JsonObject object : dragonList){
                        if(object.get("_Id").getAsInt() != 0){
                            listSize++;
                        }
                    }
                }else{
                    listSize = dragonList.size();
                }

                for(int i = 0; i < listSize; i++){
                    if(isCancelled()){
                        break;
                    }
    
                    dragonButtons.add(new Button(Dragon.getFullName(dragonList.get(i))));
                    dragonButtons.get(i).setId(dragonList.get(i).get("_Id").getAsString());
                   
                    updateProgress(i+1, listSize);
                    updateMessage(i+1 + "/" + listSize);
                }
                return null;
            }
        };
        makeDragonList.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                task2Done = true;
            }
        });

        //Make the wyrmprint list of buttons
        makeWyrmList = new Task<Void>() {
            @Override protected Void call() throws Exception {
                task3Done = false;
                int listSize = 1;

                //Get the size of list without empty objects if getEmpty is false
                if(getEmpty == false){
                    for(JsonObject object : talismanList){
                        if(object.get("_Id").getAsInt() != 0){
                            listSize++;
                        }
                    }
                }else{
                    listSize = talismanList.size();
                }

                //Make the list of Wyrmprint buttons
                for(int i = 0; i < listSize; i++){
                    if(isCancelled()){
                        break;
                    }
                    
                    wyrmButtons.add(new Button(Talisman.getName(talismanList.get(i))));
                    wyrmButtons.get(i).setId(talismanList.get(i).get("_Id").getAsString());
                    
                    updateProgress(i+1, listSize);
                    updateMessage(i+1 + "/" + listSize);
                }
                return null;
            }
        };
        makeWyrmList.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent t) {
                task3Done = true;
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


    @FXML
    private void openFolder(){
        try {
			Runtime.getRuntime().exec("explorer.exe /select," + "src\\main\\resources\\com\\dleditor\\files\\");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private void fileCheck(){
        try {
            characterList = Character.createCharacterList();
            changedCharacters = characterList;
            dragonList = Dragon.createDragonList();
            changedDragons = dragonList;
            talismanList = Talisman.createTalismanList();
            changedTalismans = talismanList;
            if(Console.doesFileExist(requiredFiles[3]) != true){
                throw new IOException();
            }
            makeLists();
        } catch (IOException e) {
            String missingFiles = "";
            for(String file : requiredFiles){
                if(Console.doesFileExist(file) != true){
                    missingFiles+=file+"\n";
                }
            }
            if(missingFiles != ""){
                Alert missingAlert = new Alert(AlertType.NONE, "Missing Required Files!\n"+missingFiles, recheckFiles,openLocation,ButtonType.CANCEL);
                Optional<ButtonType> choice = missingAlert.showAndWait(); 
                if(choice.isPresent() && choice.get() == recheckFiles){
                    fileCheck();
                }else if(choice.isPresent() && choice.get() == openLocation){
                    openFolder();
                    fileCheck();
                }else if(choice.isPresent() && choice.get() == ButtonType.CANCEL){
                    Platform.exit();
                    System.exit(0);
                }
            }
        }
    }

    @FXML
    private void saveChanges(){

    }

    @FXML
    private void saveChangesAs(){

    }

    @FXML 
    private void revertChanges(){

    }

    @FXML
    private void rebuildLists(){
        Alert alert = createAlertWithCheckBox(AlertType.NONE, "Rebuild Lists", null, "Would you like to rebuild the button lists?", "Include Empty IDs?", event -> getEmpty = event, ButtonType.YES, ButtonType.NO);
        if (alert.showAndWait().filter(t -> t == ButtonType.YES).isPresent()) {
            charaButtons.clear();
            dragonButtons.clear();
            wyrmButtons.clear();
            makeLists();
        }
    }

    @FXML 
    private void openPreferences(){

    }

    @FXML
    private void closeWindow(){
        Alert confirmAlert = new Alert(AlertType.NONE, "Are you sure you wish to quit?\nUnsaved changes will be lost", ButtonType.YES,ButtonType.NO);
        Optional<ButtonType> choice = confirmAlert.showAndWait(); 
        if(choice.isPresent() && choice.get() == ButtonType.YES){ 
            Platform.exit();
            System.exit(0);
        }
    }

    @FXML
    private void checkTasks(){
        if(task1Done && task2Done && task3Done){
            rebuildButton.setDisable(false);
            getEmpty = false;
        }else{
            rebuildButton.setDisable(true);
        }
    }

    public static Alert createAlertWithCheckBox(AlertType type, String title, String headerText, String message, String checkboxPrompt, Consumer<Boolean> checkboxAction, ButtonType... buttonTypes) {
                Alert alert = new Alert(type);
                // Need to force the alert to layout in order to grab the graphic,
                // as we are replacing the dialog pane with a custom pane
                alert.getDialogPane().applyCss();
                Node graphic = alert.getDialogPane().getGraphic();
                // Create a new dialog pane that has a checkbox instead of the hide/show details button
                // Use the supplied callback for the action of the checkbox
                alert.setDialogPane(new DialogPane() {
                @Override
                protected Node createDetailsButton() {
                    CheckBox checkbox = new CheckBox();
                    checkbox.setText(checkboxPrompt);
                    checkbox.setOnAction(e -> checkboxAction.accept(checkbox.isSelected()));
                    return checkbox;
                }
                });
                alert.getDialogPane().getButtonTypes().addAll(buttonTypes);
                alert.getDialogPane().setContentText(message);
                // Fool the dialog into thinking there is some expandable content
                // a Group won't take up any space if it has no children
                alert.getDialogPane().setExpandableContent(new Group());
                alert.getDialogPane().setExpanded(true);
                // Reset the dialog graphic using the default style
                alert.getDialogPane().setGraphic(graphic);
                alert.setTitle(title);
                alert.setHeaderText(headerText);
                return alert;
            }

}


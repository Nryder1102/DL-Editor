package com.dlsearch;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class PrimaryController extends App{

    @FXML
    public VBox listBox;

    @FXML
    private void switchListCharacter() throws IOException {
        for(int i = 0; i < characterList.size(); i++){
            listBox.getChildren().add(new Button(characterList.get(i).getFullName()));
        }
    }

    @FXML
    private void switchListDragon() throws IOException {
        for(int i = 0; i < dragonList.size(); i++){
            listBox.getChildren().add(new Button(dragonList.get(i).getFullName()));
        }
    }

    @FXML
    private void switchListTalisman() throws IOException {
        for(int i = 0; i < talismanList.size(); i++){
            listBox.getChildren().add(new Button(talismanList.get(i).getName()));
        }
    }
}

package com.dleditor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.dleditor.classes.Character;
import com.dleditor.classes.Dragon;
import com.dleditor.classes.Talisman;




/**
 * JavaFX App
 */
public class App extends Application {

    public static ArrayList<Character> characterList = new ArrayList<>();
    public static ArrayList<Dragon> dragonList = new ArrayList<>();
    public static ArrayList<Talisman> talismanList = new ArrayList<>();

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void getNames(){
        try {
            characterList = Character.createCharacterList();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        dragonList = Dragon.createDragonList();
        talismanList = Talisman.createTalismanList();
    }

    public static void main(String[] args) {
        getNames();
        launch();
    }

}
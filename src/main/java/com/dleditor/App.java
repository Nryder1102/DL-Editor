package com.dleditor;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import com.dleditor.classes.Character;
import com.dleditor.classes.Dragon;
import com.dleditor.classes.Talisman;
import com.google.gson.JsonObject;




/**
 * JavaFX App
 */
public class App extends Application {

    public static ArrayList<JsonObject> characterList = new ArrayList<>();
    public static ArrayList<JsonObject> dragonList = new ArrayList<>();
    public static ArrayList<JsonObject> talismanList = new ArrayList<>();

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"));
        stage.setScene(scene);
        stage.setTitle("DL Editor");
        stage.getIcons().add(new Image(App.class.getResourceAsStream("images.jpg")));
        stage.show();
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                Alert confirmAlert = new Alert(AlertType.NONE, "Are you sure you wish to quit?\nUnsaved changes will be lost", ButtonType.YES,ButtonType.NO);
                Optional<ButtonType> choice = confirmAlert.showAndWait(); 
                if(choice.isPresent() && choice.get() == ButtonType.YES){ 
                    Platform.exit();
                    System.exit(0);
                }else{
                    event.consume();
                }
                
            }
        });
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }


}
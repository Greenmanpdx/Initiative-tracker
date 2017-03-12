package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
* My initiative tracker program for roleplaying games.
*
* Done so far: Character and NPC inputs are taken and put into a list.
*
* To DO: error handling for Character/NPC inputs.
*          Handle combat.
*
* */

public class Main extends Application {

    private Stage primaryStage;

    private AnchorPane rootLayout;



    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Initiative Tracker Home");

        try {
            // Load the root layout from the fxml file
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample.fxml"));

            rootLayout =  loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }

        showCharacterOverview();
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {return primaryStage;}




    public boolean addNPCpopup(NPC npc){
        try{
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("AddNPCFX.fxml"));
            AnchorPane page =  loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Enter Character");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            AddNPC controller = loader.getController();
            controller.setDialogStage(dialogStage);


            dialogStage.showAndWait();


        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;

    }

    public boolean addCharacterPupup(Character player){
        try{
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("AddPlayerWindowfx.fxml"));
            AnchorPane page =  loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Enter Character");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            AddPlayerWindow controller = loader.getController();
            controller.setDialogStage(dialogStage);



            dialogStage.showAndWait();


        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    /**
     * Shows the person overview scene.
     */
    public void showCharacterOverview() {
        try {
            // Load the fxml file and set into the center of the main layout
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample.fxml"));
            AnchorPane overviewPage = loader.load();
            //rootLayout.setCenter(overviewPage);

            Controller controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            // Exception gets thrown if the fxml file could not be loaded
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
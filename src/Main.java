/**
 * Created by GreenManPDX on 8/15/2016.
 */
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    Lists initList = new Lists();
    Button addPlayer, addNPC, startCombat, editButton;
    GridPane grid;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Initiative Tracker");
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 800, 450);
        primaryStage.setScene(scene);
        primaryStage.show();

        //delay button
        addPlayer = new Button("Add Player");
        addPlayer.setOnAction(e -> ButtonClicked(e));
        //next button
        addNPC = new Button("Add NPC");
        addNPC.setOnAction(e -> ButtonClicked(e));
        //Set Current  button
        startCombat = new Button("Start Combat");
        startCombat.setOnAction(e -> ButtonClicked(e));
        //Edit button
        editButton = new Button("Edit");
        editButton.setOnAction(e ->ButtonClicked(e));
    }

    public void ButtonClicked(ActionEvent e)
    {
        if (e.getSource()== addPlayer)

    }



}

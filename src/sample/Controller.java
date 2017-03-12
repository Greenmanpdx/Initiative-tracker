/**
* Controller for man window, sample.fxml*/
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    private TableView<Character> characterTable;

    @FXML
    private TableColumn<Character, String> nameColumn;
    @FXML
    private TableColumn<Character, String> initiativeColumn;
    @FXML
    private Button AddPlayerbtn;
    @FXML
    private Button AddNPCbtn;
    @FXML
    private Button StartCombatbtn;
    @FXML
    private Main main;

    @FXML
    private void handleButtonAction(ActionEvent event){



        if(event.getSource() == AddNPCbtn){

            NPC temp = new NPC();
            boolean saved = addNPCpopup(temp);


        }

        if(event.getSource() == AddPlayerbtn){
            Character temp = new Character();
            boolean saved = addCharacterPupup(temp);


        }

        if(event.getSource() == StartCombatbtn){

        }

    }

    private void refreshCharcaterTable(){
        int selectedIndex = characterTable.getSelectionModel().getSelectedIndex();
        characterTable.setItems(null);
        characterTable.layout();
        characterTable.getSelectionModel().select(selectedIndex);
    }

    public Controller(){

    }

    @FXML
    public void initialize(){


    }

    public void setMain(Main main)
    {
        this.main = main;


    }

    private void showChracterDetails(Character character){

    }

    public boolean addNPCpopup(NPC npc){
        try{
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("AddNPCfx.fxml"));
            AnchorPane page =  loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Enter NPC");
            dialogStage.initModality(Modality.WINDOW_MODAL);

            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            AddNPC controller = loader.getController();
            controller.setDialogStage(dialogStage);


            dialogStage.showAndWait();
           npc = controller.setNPC();
            characterTable.getItems().add(npc);


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

            Scene scene = new Scene(page);
            dialogStage.setScene(scene);

            AddPlayerWindow controller = loader.getController();
            controller.setDialogStage(dialogStage);


            dialogStage.showAndWait();
            player = controller.setCharacter();
            characterTable.getItems().add(player);

        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}

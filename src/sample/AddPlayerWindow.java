/**
 * Created by GreenManPDX on 8/15/2016.
 * Controller for the AddPlayerWindow
 */
package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class AddPlayerWindow {
    @FXML
    private AnchorPane grid;
    @FXML
    private Button save;
    @FXML
    private Label Name, AC, HP, InBonus, title;
    @FXML
    private TextField name, ac, hp, initiativeBonus, initiative;

    @FXML
    private Stage dialogStage;

    private Character player;



    public void setDialogStage(Stage dialogStage){
        this.dialogStage = dialogStage;
    }

    protected Character setCharacter(){
        return player;
    }
    @FXML
    private void handleButtonAction(ActionEvent event) {


        if (event.getSource() == save) {
            int acIn  =Integer.parseInt(ac.getText());
            int hpIn = Integer.parseInt(hp.getText());
            String nameIn = name.getText();
            int intBonusIn = Integer.parseInt(initiativeBonus.getText());
            int initIn = Integer.parseInt(initiative.getText());

            player = new Character(nameIn, initIn, intBonusIn, hpIn, acIn);


            dialogStage.close();
        }
    }
}

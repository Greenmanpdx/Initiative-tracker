package sample;

/**
* Controller for the AddNPC window
* */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class AddNPC{

    @FXML
    private Button save, addAttack;

    @FXML
    private TextField ac, hp, init, initBonus, fort, will, ref, weapon, attackBonus, damage, name;
    @FXML
    private RadioButton melee, touch, ranged, rangedTouch;
    @FXML
    private ToggleGroup range;

    @FXML
    private NPC monster;

    @FXML
    private Stage dialogStage;

   @FXML
    private TableView<Attack> attackTableView = new TableView<>();

    @FXML
    private TableColumn<Attack, String> weaponColumn;
    @FXML
    private TableColumn<Attack, String> attackColumn;
    @FXML
    private TableColumn<Attack, String> rangeColumn;
    @FXML
    private TableColumn<Attack, String> damageColumn;

    NPC npc;

    Dice d = new Dice(1, 3, 1);

   /* @FXML
    private final ObservableList<Attack> atk = FXCollections.observableArrayList();

    public ObservableList<Attack> getAtk(){
        return atk;
    }*/


    //public AddNPC(){};

    @FXML
    public void initialize(){


        getAttack();



    }
    public void setDialogStage(Stage dialogStage){
        this.dialogStage = dialogStage;
    }

    public NPC setNPC(){
         return npc;

    }

    private void showAttackDetails(Attack attack){

    }

    public ObservableList<Attack> getAttack(){
        ObservableList<Attack> attacks = FXCollections.observableArrayList();

        attacks.add(new Attack("Unarmed", 0, "melee", "1d3"));
        return attacks;
    }

    @FXML
    private void handleButtonAction(ActionEvent event){

        if(event.getSource() == save) {

            String nameIn = name.getText();
            int acIn = Integer.parseInt(ac.getText());
            int hpIn = Integer.parseInt(hp.getText());
            int initIn = Integer.parseInt(init.getText());
            int bonusIn = Integer.parseInt(initBonus.getText());
            int fortIn = Integer.parseInt(fort.getText());
            int willIn = Integer.parseInt(will.getText());
            int refIn = Integer.parseInt(ref.getText());

            ArrayList<Attack> attackTable = new ArrayList<Attack>(attackTableView.getItems());
            npc = new NPC(hpIn, acIn, attackTable, fortIn, willIn, refIn, initIn, bonusIn, nameIn);

            dialogStage.close();
        }

        if(event.getSource() == addAttack){

            String weaponIn = weapon.getText();
            int bonusIn = Integer.parseInt(attackBonus.getText());
            String rangeIn = range.getSelectedToggle().getUserData().toString();
            String damageIn = damage.getText();

            Attack attack = new Attack(weaponIn, bonusIn, rangeIn, damageIn);



            attackTableView.getItems().add(attack);

            attackBonus.clear();
            weapon.clear();
            damage.clear();





        }

    }



}



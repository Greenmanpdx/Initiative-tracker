/**
 * Created by GreenMan on 3/22/2016.
 *
 * No longer used
 */package sample;
public class Dice {


    private int dieType;
    private int numbDice;
    private int bonus;
    private String whichDice = setWhichDice(this.numbDice, this.dieType, this.bonus);

    Dice(int numb, int die, int bonus) {
        this.numbDice = numb;
        this.dieType = die;
        this.bonus =  bonus;

    }

    Dice(){
        numbDice = 0;
        dieType = 0;
        bonus = 0;
    }
    public String getDice(){return whichDice;}

    public String setWhichDice(int numb, int die, int bonus){

       return( Integer.toString(numbDice) + 'd' + Integer.toString(dieType) + " + " + Integer.toString(bonus));

     }

    public void setDice(int numb, int die, int bonus){
        this.numbDice = numb;
        this.dieType = die;
        this.bonus =  bonus;

    }
}

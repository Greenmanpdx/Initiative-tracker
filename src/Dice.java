/**
 * Created by GreenMan on 3/22/2016.
 */
public class Dice {

    Dice(int numb, int die) {
        this.numbDice = numb;
        this.dieType = die;

    }
    private int dieType;
    private int numbDice;
    private String whichDice = setWhichDice(this.numbDice, this.dieType);


    public String getDice(){return whichDice;}

    public String setWhichDice(int numb, int die){

       return( Integer.toString(numbDice) + 'd' + Integer.toString(dieType));

     }

    public void setDice(int numb, int die){
        this.numbDice = numb;
        this.dieType = die;

    }
}

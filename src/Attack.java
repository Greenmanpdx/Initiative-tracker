/**
 * Created by GreenMan on 3/22/2016.
 */
public class Attack {

    private String type;
    private Dice dice;

    public String getType(){return this.type;}

    public void setType(String type){this.type = type;}
    public void setDice(int num, int dice, int bonus){this.dice.setDice(num, dice, bonus);}



    Attack(String name, Dice d){

        type = name;
        dice = d;

    };
}

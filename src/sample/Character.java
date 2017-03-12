/**
 * Created by GreenMan on 3/22/2016.
 *
 * The Character class
 */package sample;

import javafx.beans.property.SimpleStringProperty;

public class Character  implements Comparable<Character>{


    private SimpleStringProperty name = new SimpleStringProperty("");
    protected int initiative;
    protected int initiativeBonus;
    protected int HP;
    protected int AC;

    public int getInitiative(){return initiative;}
    public  int getInitiativeBonus(){return initiativeBonus;}
    public String getName(){return name.get();}
    public int getHP(){return HP;}
    public int getAC(){return AC;}


    public void setName(String charName){ this.name.set(charName);}
    public void setInitiative(int init){this.initiative = init;}
    public void setInitiativeBonus(int bonus){this.initiativeBonus = bonus;}
    public void setHP (int HitPoints){this.HP = HitPoints;}
    public void setAC(int Armor){this.AC = Armor;}

    Character(String nameIn, int init, int intBonus, int hp, int ac){
        setName(nameIn);
        setInitiative(init);
        setInitiativeBonus(intBonus);
        setHP(hp);
        setAC(ac);
    }

    Character(){
        this("", 0, 0, 0, 0);
    }
    public int compareTo(Character compChar) {

        int compareInit = (compChar).getInitiative();
        int compareBonus = (compChar).getInitiativeBonus();

        if (compareInit == this.initiative){
            return this.initiativeBonus - compareBonus;
        }else
            return compareInit - this.initiative;
    }


}

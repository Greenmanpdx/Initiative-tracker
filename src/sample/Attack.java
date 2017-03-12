/**
 * Created by GreenMan on 3/22/2016.
 *
 * The Attack class
 */
package sample;

import javafx.beans.property.SimpleStringProperty;

public class Attack {

    private final SimpleStringProperty weapon = new SimpleStringProperty("");
    private final SimpleStringProperty range= new SimpleStringProperty("");
    private final SimpleStringProperty damage= new SimpleStringProperty("");
    private int attackBonus;

    public String getRange(){return range.get();}
    public String getWeapon(){return weapon.get();}
    public String getDamage(){return damage.get();}
    public int getAttackBonus(){return attackBonus;}

    public void setRange(String newRange){range.set(newRange);}
    public void setWeapon(String newName){weapon.set(newName);}
    public void setAttackBonus(int atkBonus){this.attackBonus = atkBonus;}
    public void setDamage(String dmg){damage.set(dmg);}




    Attack(String nameIn, int AB, String rangeIn, String damageIn){

      setWeapon(nameIn);
      setDamage(damageIn);
      setRange(rangeIn);
      setAttackBonus(AB);

    };

    Attack(){
       this("", 0, "", "");
    }
}

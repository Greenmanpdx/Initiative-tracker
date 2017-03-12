package sample;
import java.util.ArrayList;


/**
 * Created by GreenMan on 3/22/2016.
 *
 * NPC Class. It hods more information than the Character class
 */
public class NPC extends Character {

    private int HP;

    private ArrayList<Attack> attacks;
    private int fort, will, reflex;



    public int getFort(){return fort;}
    public int getWill(){return will;}
    public int getReflex(){return reflex;}
    public int getHP(){return HP;}


    public void setHP(int hp){this.HP = hp;}

    public void setFort(int fort){this.fort = fort;}
    public void setWill(int will){this.will = will;}
    public void setReflex(int reflex){this.reflex = reflex;}

    public void addAttack(Attack attack){


        attacks.add(attack);

    }

    public NPC(){
        HP = 0;
        AC = 0;
        attacks = null;
        fort = 0;
        will = 0;
        reflex = 0;
    }

    public NPC(int hp, int ac, ArrayList<Attack> atks, int fort, int will, int reflex, int init, int initBonus, String name)
    {
        setHP(hp);
        setAC(ac);
        setReflex(reflex);
        setFort(fort);
        setWill(will);
        setInitiative(init);
        this.attacks = atks;


        setInitiativeBonus(initBonus);

        setName(name);

    }




}

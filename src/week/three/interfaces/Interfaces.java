package week.three.interfaces;
import java.io.*;

public class Interfaces {

    enum Actions {
        ATTACK,
        DEFEND,
        WALK,
        PICKUP,
        OPEN,
        EQUIP,
        USE
    }

    public static void main(String[] args){
        // creating an instance of a warrior
        Warrior warriorD = new Warrior();
        warriorD.hitPoints(20);
        warriorD.manaPoints(5);
        warriorD.atkPoints(7);
        warriorD.defPoints(5);
        warriorD.printStats();

        Actions action = Actions.ATTACK;
        System.out.println("\nWarrior Class just " + action + " a monster.");

    }
}

package week.three.interfaces;
import java.io.*;

public class Interfaces {

    public static void main(String[] arrgs){
        // creating an instance of a warrior
        Warrior warriorD = new Warrior();
        warriorD.hitPoints(20);
        warriorD.manaPoints(5);
        warriorD.atkPoints(7);
        warriorD.defPoints(5);

        warriorD.printStats();
    }
}

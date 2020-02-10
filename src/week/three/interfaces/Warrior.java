package week.three.interfaces;

public class Warrior implements Ability {

    int hp;
    int mp;
    int atk;
    int def;

    // to change the hit points
    @Override
    public void hitPoints(int points){
        hp = points;
    }
    @Override
    public void manaPoints(int points){
        mp = points;
    }
    @Override
    public void atkPoints(int points){
        atk = points;
    }
    @Override
    public void defPoints(int points){
        def = points;
    }

    public void printStats(){
        System.out.println("Warrior Status:\n" +
                "Health: " + hp + "\n" +
                "Magic: " + mp + "\n" +
                "Attack: " + atk + "\n" +
                "Defense: " + def + "\n");
    }
}

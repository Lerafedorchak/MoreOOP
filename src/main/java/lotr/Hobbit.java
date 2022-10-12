package main.java.lab4.lotr;


import main.java.lab4.kick.CryKick;
import main.java.lab4.lotr.Character;

//class Hobbit
//  - attributes: int power=0, int hp=3
//          - methods: void kick(Character c) { toCry() }
public class Hobbit extends Character implements CryKick {
    public Hobbit() {
        super(0, 3);
    }
    public void toCry() {
        System.out.println("\nInstead of fight Hobbit starts crying :(");
    }

    public void kick(Character c){
        toCry();
    }

    @Override
    public String toString() {
        return "Hobbit{hp=" + getHp() +", power=" + getPower() + "}";
    }
}

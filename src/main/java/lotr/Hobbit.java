package lotr;

import kick.CryKick;

//class Hobbit
//  - attributes: int power=0, int hp=3
//          - methods: void kick(Character c) { toCry() }
public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
        kick = new CryKick();
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

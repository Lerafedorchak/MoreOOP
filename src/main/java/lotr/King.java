package main.java.lab4.lotr;


//class King
//   - attributes: int power=from 5 to 15, int hp=from 5 to 15
//           - methods: void kick(Character c) {
//           decrease number of hp of the enemy by random
//           number which will be in the range of his power
//           }

import main.java.lab4.kick.NobleKick;
import main.java.lab4.lotr.Character;


public class King extends Character implements NobleKick {
    public King(){
        super(randomGener.nextInt(5, 16),
                randomGener.nextInt(5, 16));
    }

    public void kick(Character c){
        System.out.println("\nKing is going to hit his enemy. \nBefore hit health points of enemy are: " + c.getHp()  +
                "\nAnd his health points are: " + c.getHp());
        c.setHp(c.getHp() - randomGener.nextInt(0, c.getHp() + 1));
        System.out.println("*fight*\nAfter fight health points of enemy are: " + c.getHp());
    }
}

package main.java.lab4.lotr;

import  java.util.Random;

import main.java.lab4.kick.NobleKick;
import main.java.lab4.lotr.Character;

public class Knight extends Character implements NobleKick {
    public Knight(){
        super(randomGener.nextInt(2, 13),
                randomGener.nextInt(2, 13));
    }
    public void kick(Character c){
        System.out.println("\nKnight is going to hit his enemy. \nBefore hit health points of enemy are: " + c.getHp() +
                "\nAnd his health points are: " + c.getHp());
        c.setHp(c.getHp() - randomGener.nextInt(0, c.getHp() + 1));
        System.out.println("*fight*\nAfter fight health points of enemy are: " + c.getHp());
    }
}

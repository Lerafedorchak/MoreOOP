package main.java.lab4.lotr;

import main.java.lab4.kick.ElfKick;

public class Elf extends Character implements ElfKick {
    public Elf(){
        super(10,10);
    }
    public void kick(Character c){
        if (c.getHp() < getHp() && c.getPower() < getPower()) {
            // character weaker than elf
            System.out.println("\nElf is going to hit his enemy. \nBefore hit power of enemy are: " + c.getPower());
            System.out.println("\nElf kills his enemy");
            c.setHp(0);
        } else {
            // character stronger than elf
            System.out.println("\nElf is going to hit his enemy. \nBefore hit power of enemy are: " + c.getPower() +
                    "\nAnd his health points are: " + c.getHp());
            c.setPower(c.getPower() - 1);
            System.out.println("Elf decreases enemy's power on 1 point, so now his enemy has power: " + c.getPower());
        }
    }

}

package kick;

import lotr.Character;

public class ElfKick implements BasicKick {
    @Override
    public void kick(Character character1, Character character2) {
        if (character2.getHp() < character1.getHp() && character2.getPower() < character1.getPower()) {
            // character weaker than elf
            System.out.println("\nElf is going to hit his enemy. \nBefore hit power of enemy are: " + character2.getPower());
            System.out.println("\nElf kills his enemy");
            character2.setHp(0);
        } else {
            // character stronger than elf
            System.out.println("\nElf is going to hit his enemy. \nBefore hit power of enemy are: " + character2.getPower() +
                    "\nAnd his health points are: " + character2.getHp());
            character2.setPower(character2.getPower() - 1);
            System.out.println("Elf decreases enemy's power on 1 point, so now his enemy has power: " + character2.getPower());
        }
    }
}

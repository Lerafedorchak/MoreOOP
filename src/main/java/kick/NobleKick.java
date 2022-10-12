package main.java.lab4.kick;

import main.java.lab4.lotr.Character;

public interface NobleKick extends BasicKick {
    @Override
    default void kick(Character character1, Character character2) {
        character2.setHp(character2.getHp() - Character.randomGener.nextInt(0, character2.getHp() + 1));
    }
}

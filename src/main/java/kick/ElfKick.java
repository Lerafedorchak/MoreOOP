package main.java.lab4.kick;

import main.java.lab4.lotr.Character;

public interface ElfKick extends BasicKick {
    @Override
    default void kick(Character character1, Character character2) {

    }
}

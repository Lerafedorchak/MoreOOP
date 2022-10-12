package main.java.lab4.lotr;
import main.java.lab4.kick.NobleKick;

import java.util.Random;

public class Noble extends Character implements NobleKick {
    private static final Random randomGener = new Random();

    public Noble(int min, int max){
        super((randomGener.nextInt(max - min + 1) + min), (randomGener.nextInt( max - min + 1) + min));
    }
    @Override
    public void kick(Character character){
        kick(this, character);
    }
}

package lotr;

import kick.NobleKick;

public class Noble extends Character {
    public Noble(int min, int max){
        super((randomGenerator.nextInt(max - min + 1) + min), (randomGenerator.nextInt( max - min + 1) + min));
        kick = new NobleKick();
    }
    @Override
    public void kick(Character character){
        kick.kick(this, character);
    }
}

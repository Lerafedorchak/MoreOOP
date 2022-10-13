package lotr;

import kick.ElfKick;

public class Elf extends Character {
    public Elf(){
        super(10,10);
        kick = new ElfKick();
    }
    public void kick(Character c){
        kick.kick(this, c);
    }

}

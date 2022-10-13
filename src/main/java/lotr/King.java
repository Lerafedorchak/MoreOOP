package lotr;

import kick.NobleKick;

public class King extends Character {
    public King(){
        super(randomGenerator.nextInt(11),
                randomGenerator.nextInt(11));
        setPower(getPower() + 5);
        setHp(getHp() + 5);
    }

    public void kick(Character c){
        System.out.println("\nKing is going to hit his enemy. \nBefore hit health points of enemy are: " + c.getHp()  +
                "\nAnd his health points are: " + c.getHp());
        c.setHp(c.getHp() - randomGenerator.nextInt(c.getHp() + 1));
        System.out.println("*fight*\nAfter fight health points of enemy are: " + c.getHp());
    }
}

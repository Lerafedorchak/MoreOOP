package kick;

import lotr.Character;

public class NobleKick implements BasicKick {
    public void kick(Character character1, Character character2) {
        character2.setHp(character2.getHp() - Character.randomGenerator.nextInt(character2.getHp() + 1));  // 0
    }
}

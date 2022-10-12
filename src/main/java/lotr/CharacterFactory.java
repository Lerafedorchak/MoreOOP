package main.java.lab4.lotr;

//class CharacterFactory
//   - methods: Character createCharacter() {
//           returns random instance of any existing character
//           }

import java.util.Random;

public class CharacterFactory {
    static Random random = new Random();
    public Character createCharacter(){
        int characterId = random.nextInt(0, 4);
        return switch (characterId) {
            case 1 -> new Elf();
            case 2 -> new Knight();
            case 3 -> new King();
            default -> new Hobbit();
        };
    }
}

package main.java.lab4.lotr;

//class GameManager
//   - methods: void fight(Character c1, Character c2) {
//           to provide fight between to characters and explain via command
//           line what happens during fight, till both of
//           the characters are alive
//           }
import main.java.lab4.lotr.Character;
import main.java.lab4.lotr.CharacterFactory;

import java.util.Random;

public class GameManager {
    static Random random = new Random();
    static CharacterFactory factory = new CharacterFactory();
    public static void main(String[] args) {
        while (true) {
            fight(factory.createCharacter(), factory.createCharacter());
        }
    }
    public static void fight(Character c1, Character c2){

        int firstTurn = random.nextInt(0, 2);
        Character [] listInTurn;
        listInTurn = new Character [2];
        if (firstTurn == 0){
            listInTurn[0] = c1;
            listInTurn[1] = c2;
        } else {
            listInTurn[1] = c1;
            listInTurn[0] = c2;
        }
        while (listInTurn[0].isAlive() && listInTurn[1].isAlive()){
            System.out.println(listInTurn[0].getClass().getSimpleName() + " is going to kill " +
                    (listInTurn[1]).getClass().getSimpleName());
            listInTurn[0].kick(listInTurn[1]);
            System.out.println(listInTurn[1].getClass().getSimpleName() + "is going to kill " +
                    (listInTurn[0]).getClass().getSimpleName());
            listInTurn[1].kick(listInTurn[0]);
        }
    }

}

package main.java.lab4.lotr;

import java.util.Random;

public abstract class Character{
    public static Random randomGener = new Random();
    private int power;
    private int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public boolean isAlive(){
        return this.getHp() > 0;

    }
    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return className + "{hp=" + hp + ", power=" + power + "}";
    }
    public abstract void kick(Character character);
}








//public class Character {
//    static Random random = new Random();
//    private int power;
//    private int hp;
//    public Character(int power, int hp) {
//        this.power = power;
//        this.hp = hp;
//    }
//    public void kick(Character character) {
//
//    }
//
//    public boolean isAlive() {
//        return hp > 0;
//    }
//
//    public int getHp() {
//        return hp;
//    }
//
//    public int getPower() {
//        return power;
//    }
//
//    public void setHp(int hp) {
//        this.hp = hp < 0 ? 0 : hp;
//    }
//
//    public void setPower(int power) {
//        this.power = power;
//    }
//
//    @Override
//    public String toString() {
//        String className = this.getClass().getSimpleName();
//        return className + "{hp=" + hp + ", power=" + power + "}";
//    }
//}




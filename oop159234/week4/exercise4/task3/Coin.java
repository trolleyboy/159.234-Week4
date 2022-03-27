package oop159234.week4.exercise4.task3;

public class Coin {
    public static String getFace() {
        double randomNumber = Math.random();
        if (randomNumber <= 0.5) {
            return "Tails";
        } else {
            return "Heads";
        }
    }
}

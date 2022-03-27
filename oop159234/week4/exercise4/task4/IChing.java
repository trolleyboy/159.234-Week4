package oop159234.week4.exercise4.task4;

import oop159234.week4.exercise4.task3.Coin;

public class IChing {
    
    public static void main(String[] args) {
        
        String[] coin = new String[3];
        int heads = 0;
        int tails = 0;

        for ( int i = 0; i < coin.length; i++ ) {
            coin[i] = Coin.getFace();
            if (coin[i] == "Heads") {
                ++heads;
            } else {
                ++tails;
            }
        }

        System.out.println("Heads: " + heads + "\tTails:" + tails );

        System.out.print("----");
        switch(heads) {
            case 3: System.out.print(" O ");
                break;
            case 2: System.out.print("---");
                break;
            default: 
                break;
        }

        switch(tails) {
            case 3: System.out.print(" X ");
                break;
            case 2: System.out.print("   ");
                break;
            default: 
                break;
        }

        System.out.println("----");
    }

}

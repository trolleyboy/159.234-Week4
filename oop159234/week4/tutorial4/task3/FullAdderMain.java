package oop159234.week4.tutorial4.task3;

public class FullAdderMain {
    
    public static void main(String[] args) {

        int[] input1 = {1,1,1,1};
        int[] input2 = {1,0,0,1};
        
        FullAdder fullAdder = new FullAdder(input1, input2);
        fullAdder.displayOutput();

    }

}


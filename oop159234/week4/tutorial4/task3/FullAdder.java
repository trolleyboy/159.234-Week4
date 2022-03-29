package oop159234.week4.tutorial4.task3;

public class FullAdder {

    private int[] input1 = new int[4];
    private int[] input2 = new int[4];
    private int[] result1 = new int[4];
    private int[] carry1 = new int[4];
    private int[] carry2 = new int[4];
    private int[] finalResult = new int[4];
    private HalfAdder[] halfAdders1 = new HalfAdder[4];
    private HalfAdder[] halfAdders2 = new HalfAdder[4];
    private OrGate orGate = new OrGate();

    public FullAdder(int[] input1, int[] input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public void fullAdder() {

        for (int i = finalResult.length - 1; i >= 0; i--) {
            halfAdders1[i] = new HalfAdder(input1[i], input2[i]);
            result1[i] = halfAdders1[i].getResult();
            carry1[i] = halfAdders1[i].getCarry();
        }

        finalResult[0] = result1[0];

        halfAdders2[0] = new HalfAdder(carry1[0], result1[1]);
        finalResult[1] = halfAdders2[0].getResult();

        halfAdders2[1] = new HalfAdder(orGate.orGate(carry1[1], carry2[0]), result1[2]);
        finalResult[2] = halfAdders2[1].getResult();

        halfAdders2[2] = new HalfAdder(orGate.orGate(carry1[2], carry2[1]), result1[3]);
        finalResult[3] = halfAdders2[2].getResult();

    }

    public void displayOutput() {
        fullAdder();
        System.out.print("4-bit added output: ");
        for ( int i = finalResult.length - 1; i >= 0; i-- ) {
            System.out.print(finalResult[i]);
        }
    }

}

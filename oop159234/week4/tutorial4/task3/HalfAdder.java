package oop159234.week4.tutorial4.task3;

public class HalfAdder {
    
    private int carry = 0; 
    private int result = 0;
    private int input1 = 0;
    private int input2 = 0;
    private AndGate andGate1 = new AndGate();
    private AndGate andGate2 = new AndGate();
    private OrGate orGate1 = new OrGate();
    private NotGate notGate1 = new NotGate();

    public HalfAdder(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public void halfAdder() {
        
        carry = andGate1.andGate(input1, input2);
        int orResult = orGate1.orGate(input1, input2);
        int notResult = notGate1.notGate(carry);
        result = andGate2.andGate(notResult, orResult);
    }

    public int getCarry() {
        halfAdder();
        return carry;
    }

    public int getResult() {
        halfAdder();
        return result;
    }

}

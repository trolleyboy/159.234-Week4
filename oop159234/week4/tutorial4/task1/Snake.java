package oop159234.week4.tutorial4.task1;

public class Snake {
    //attributes
    private BoardSquare tail;

    //constructors
    public Snake(BoardSquare head, BoardSquare tail) {
        setTail(tail);
        head.addSnake(this);
    }

    //methods
    public void setTail(BoardSquare tail) {
        this.tail = tail;
    }
    public BoardSquare getTail() {
        return tail;
    }

    public void movePlayerPiece(PlayerPiece counter) {
        System.out.println("Down the snake to " + getTail().getPosition());
        counter.setCurrentPosition(getTail());
    }
}

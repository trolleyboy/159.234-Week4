package oop159234.week4.tutorial4.task1;

public class Ladder {
    //attributes
    private BoardSquare top;

    //constructors
    public Ladder(BoardSquare bottom, BoardSquare top) {
        setTop(top);
        bottom.addLadder(this);
    }

    //methods
    public BoardSquare getTop() {
        return top;
    }
    public void setTop(BoardSquare top) {
        this.top = top;
    }


    public void movePlayerPiece(PlayerPiece counter) {
        System.out.println("Up the ladder to " + getTop().getPosition());
        counter.setCurrentPosition(getTop());
    }
}

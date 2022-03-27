package oop159234.week4.tutorial4.task1;

public class BoardSquare {
    
    //attributes
    private int position;
    private Snake aSnake = null;
    private Ladder aLadder = null;

    //constructors
    BoardSquare(int position) {
        setPosition(position);
    }
    //methods
    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void movePlayerPiece(PlayerPiece counter) {
        counter.setCurrentPosition(this);
        if (hasSnake()) {
            aSnake.movePlayerPiece(counter);
        }
        if (hasLadder()) {
            aLadder.movePlayerPiece(counter);
        }
    }

    public void addLadder(Ladder ladder) {
        aLadder = ladder;
    }
    
    public void addSnake(Snake snake) {
        aSnake = snake;
    }

    private boolean hasSnake() {
        if (aSnake == null) {
            return false;
        } else {
            return true;
        }
    }

    private boolean hasLadder() {
        if (aLadder == null) {
            return false;
        } else {
            return true;
        }
    }

}

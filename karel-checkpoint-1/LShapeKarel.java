import stanford.karel.*;

// Isayah specified: three squares north, right, three squares east,
// then a loop to collect the pile. ChatGPT translated that plan into Java.
public class LShapeKarel extends Karel {
    public void run() {
        turnLeft();
        moveThreeSquares();
        turnRight();
        moveThreeSquares();
        collectBeepers();
    }

    private void moveThreeSquares() {
        move();
        move();
        move();
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void collectBeepers() {
        while (beepersPresent()) {
            pickBeeper();
        }
    }
}

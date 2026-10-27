import stanford.karel.*;

// Isayah edited worlds/LShape.w and supplied the route and pickup-loop idea.
// ChatGPT adapted this solution to the uploaded start position and walls.
// Start facing north beside a wall on the right, with a beeper pile
// east of the first opening. This is not an arbitrary-maze solver.
public class LShapeKarel extends Karel {
    public void run() {
        reachOpening();
        turnRight();
        reachBeepers();
        collectBeepers();
    }

    private void reachOpening() {
        while (rightIsBlocked()) {
            move();
        }
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void reachBeepers() {
        while (noBeepersPresent()) {
            move();
        }
    }

    private void collectBeepers() {
        while (beepersPresent()) {
            pickBeeper();
        }
    }
}

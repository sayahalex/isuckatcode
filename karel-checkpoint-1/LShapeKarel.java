import stanford.karel.*;

// ChatGPT implementation of Isayah's requested L-shaped route around a wall.
// Assumes Karel starts facing east beside the wall, with a beeper to the east
// after the northward detour. It is not a general maze solver.
public class LShapeKarel extends Karel {
    public void run() {
        climbBesideWall();
        turnRight();
        reachBeeper();
        pickBeeper();
    }

    private void climbBesideWall() {
        turnLeft();
        while (rightIsBlocked()) {
            move();
        }
    }

    private void reachBeeper() {
        while (noBeepersPresent()) {
            move();
        }
    }

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

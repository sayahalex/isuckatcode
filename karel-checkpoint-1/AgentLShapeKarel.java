import stanford.karel.*;

// AI extension: adapt to the wall height and pile location, collect the pile,
// then return home. Uses only Karel and the conditions taught in class.
public class AgentLShapeKarel extends Karel {
    public void run() {
        climbBesideWall();
        turnRight();
        reachBeepers();
        collectBeepers();
        returnHome();
    }

    private void climbBesideWall() {
        turnLeft();
        while (rightIsBlocked()) {
            move();
        }
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

    private void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    private void returnHome() {
        turnLeft();
        turnLeft();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
    }
}

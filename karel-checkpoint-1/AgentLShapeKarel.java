// ChatGPT extension, added after the basic program and guided custom example.
// Collects a whole pile, then returns to the starting corner facing east.
public class AgentLShapeKarel extends LShapeKarel {
    public void run() {
        super.run();
        collectRemainingBeepers();
        returnHome();
    }

    private void collectRemainingBeepers() {
        while (beepersPresent()) {
            pickBeeper();
        }
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

# Checkpoint 1 Notes

- What I supplied: the two commands move(); and pickBeeper(); during a guided walkthrough; I selected an L-shaped path around a wall for the custom world.
- Help with those commands: ChatGPT corrected punctuation after move(): and corrected pickupBeeper(); to pickBeeper(); before I typed the two-command sequence.
- What ChatGPT wrote: the Java class wrappers, LShapeKarel, the exact custom map, run scripts, and documentation.
- Existing world: KarelStartWorld.w is the file I uploaded. Its original authorship has not been established here.
- Custom-world status: ChatGPT generated LShape.w from my requested design; I have not yet confirmed editing it through Edit World.
- Earlier agent error: the previous package targeted the course default beeper world instead of my uploaded world. This version uses my uploaded world, with its beeper at (2,1), for MyKarel.
- Laptop test results: not yet supplied. I need to run each program and record what actually happens.
- AI Use Statement: I asked ChatGPT to help assemble Checkpoint 1 using my commands and route choice. ChatGPT wrote the custom implementation and supporting files. I will review and test the result before submission.
- Agent extension: ChatGPT wrote AgentLShapeKarel in a separate commit. It reuses the L-shaped route, collects all remaining beepers, and returns to the starting corner facing east.
- Additional test world: ChatGPT created LShapeTall.w to check a different wall height and beeper-pile size.
- Checks by ChatGPT: all sources compiled against the supplied course library with Java 17. Headless runs passed for MyKarel, LShapeKarel, AgentLShapeKarel on LShapeStack.w, and AgentLShapeKarel on LShapeTall.w. Both extension runs ended at (1,1), facing east, with zero beepers remaining.
- Verification limit: graphical runs and student edits through Edit World have not been observed here.

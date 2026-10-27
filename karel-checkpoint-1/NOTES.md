# Checkpoint 1 Notes

- What I wrote and planned: I supplied move(); and pickBeeper(); during a guided walkthrough. For the custom route, I asked for movement up the screen, a right turn, movement toward a pile, and a loop to collect six beepers.
- Syntax help: ChatGPT corrected punctuation after move(): and corrected pickupBeeper(); to pickBeeper(); before I typed the two-command sequence.
- World I edited: I used Edit World and uploaded LShape.w. My saved world is 6 by 4, starts Karel at (1,1) facing north, has six beepers at (4,3), and includes my edited wall layout. It began from ChatGPT's example map.
- What ChatGPT wrote: Java scaffolding, the custom route implementation, the agent extension, initial example worlds, run scripts, and documentation. I supplied the edited LShape.w used in the final custom program.
- What went wrong on my laptop: I reported that LShapeKarel did not run my edited map correctly. I did not provide an exact error message.
- Cause and fix: the previous code expected Karel at (1,1) facing east and used a fixed three-by-three route. My uploaded map starts at (1,2) facing north. ChatGPT removed the initial left turn and fixed move count, used rightIsBlocked() to reach the opening, then turned right and used noBeepersPresent() to reach the pile.
- Agent extension: AgentLShapeKarel was added in a separate commit. It adapts to a wall beside an east-facing start, collects a whole pile, and returns home. It uses its own LShapeStack.w and LShapeTall.w maps, not my north-facing custom map.
- Current automated results: ChatGPT compiled all three Java programs against the course library with Java 17. MyKarel on KarelStartWorld.w finished at (2,1) east. The corrected LShapeKarel on my uploaded LShape.w finished at (4,3) east and collected all six beepers. AgentLShapeKarel passed on LShapeStack.w and LShapeTall.w, returning to (1,1) east. All four runs left zero beepers.
- Verification limit: those results use the course library's headless mode. A successful laptop run of the corrected custom program has not yet been reported.
- Existing starter map: KarelStartWorld.w is the file I originally supplied; its original authorship has not been established here.
- AI Use Statement: I used ChatGPT to translate my commands and route choices into Java, assemble the repository, and fix a mismatch between the program and my edited world. I edited and uploaded the final custom world. ChatGPT wrote the custom implementation, extension, and supporting documentation, and ran the automated checks.

- Latest world revision: I uploaded LShape(1).w with Karel moved from (1,2) to (1,1), still facing north. ChatGPT saved this as worlds/LShape.w and verified the existing corrected program collects all six beepers and finishes at (4,3) facing east. No further Java changes were needed. A successful laptop run of this latest revision has not yet been reported.

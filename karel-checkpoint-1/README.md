# Karel Checkpoint 1

Karel work for COSC 10001 at TCU. The basic program moves to a beeper and picks it up. The custom example follows an L-shaped route around a wall.

## Programs

| Program | World | Expected result |
| --- | --- | --- |
| MyKarel | worlds/KarelStartWorld.w | Pick up the beeper at (2,1); finish facing east |
| LShapeKarel | worlds/LShape.w | Start at (1,1) facing north, follow the wall to its opening, turn east, collect six beepers at (4,3) |
| AgentLShapeKarel | worlds/LShapeStack.w | Collect all six beepers; return to (1,1) facing east |

LShapeKarel follows Isayah's edited north-facing map. It moves north while the wall blocks its right, turns east at the opening, then reaches and collects the beeper pile. The path must be clear and the pile must be east of that opening. The extension adapts to the wall height and pile position, then returns home. It also handles worlds/LShapeTall.w, which has a taller wall and two beepers. The wall must rise from the bottom boundary beside Karel, and the beeper must be on the clear row just above it. Arbitrary mazes are outside this program's scope.

## Run

Use a JDK version 17 or later. Open this folder in IntelliJ and add lib/karel.jar as a library. Run a class, load its matching world, and press Start.

On macOS, open Terminal in this folder:
```bash
bash run.sh MyKarel
bash run.sh LShapeKarel
bash run.sh AgentLShapeKarel
```

On Windows, open PowerShell in this folder:
```powershell
.\run.ps1 MyKarel
.\run.ps1 LShapeKarel
.\run.ps1 AgentLShapeKarel
```

Reset the world before repeating a run.

## Authorship and assignment requirements

Isayah supplied the basic commands and route choices during a guided walkthrough, then personally edited and uploaded worlds/LShape.w. ChatGPT supplied the Java scaffolding, initial example maps, custom solution and later fix, extension, scripts, and documentation. See NOTES.md for the precise division of work.

The final custom map is Isayah's uploaded Edit World revision of an AI-generated example. He reported that the earlier program did not solve this revision; ChatGPT corrected the start-direction and route assumptions. A successful graphical run of the corrected version remains to be confirmed.

Course specification: https://washingtonwei.github.io/cosc-10001/syllabus/#build-checkpoints-2-10

## Verification

After integrating Isayah's edited map and fixing the route, all Java files compiled with Java 17 against the included course library. Headless runs passed for all three programs, including the extension on the taller test world. These checks do not replace reviewing the graphical results on the student's laptop.

## Repository link

https://github.com/sayahalex/isuckatcode/tree/main/karel-checkpoint-1

The repository root contains a separate Ship-It website; this folder contains Checkpoint 1. Clone the repository, then open this folder to run Karel.

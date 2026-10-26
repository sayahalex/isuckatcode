# Karel Checkpoint 1

Karel work for COSC 10001 at TCU. The basic program moves to a beeper and picks it up. The custom example follows an L-shaped route around a wall.

## Programs

| Program | World | Expected result |
| --- | --- | --- |
| MyKarel | worlds/KarelStartWorld.w | Pick up the beeper at (2,1); finish facing east |
| LShapeKarel | worlds/LShape.w | Go north around the wall, turn east, collect the beeper at (4,3) |

## Run

Use a JDK version 17 or later. Open this folder in IntelliJ and add lib/karel.jar as a library. Run a class, load its matching world, and press Start.

On macOS, open Terminal in this folder:
```bash
bash run.sh MyKarel
bash run.sh LShapeKarel
```

On Windows, open PowerShell in this folder:
```powershell
.\run.ps1 MyKarel
.\run.ps1 LShapeKarel
```

Reset the world before repeating a run.

## Authorship and assignment requirements

Isayah supplied the basic commands during a guided walkthrough and chose an L-shaped route around a wall. ChatGPT supplied the Java scaffolding, custom map coordinates, custom solution, scripts, and documentation. See NOTES.md for the precise division of work.

The L-shaped map was generated as text from Isayah's design choice. Isayah has not yet confirmed creating or editing it with Edit World, as the rubric requests. Local graphical runs also remain to be confirmed.

Course specification: https://washingtonwei.github.io/cosc-10001/syllabus/#build-checkpoints-2-10

param([ValidateSet("MyKarel", "LShapeKarel", "AgentLShapeKarel")][string]$Program = "MyKarel")
$ErrorActionPreference = "Stop"
Set-Location $PSScriptRoot
$World = switch ($Program) {
  "MyKarel" { "worlds/KarelStartWorld.w" }
  "LShapeKarel" { "worlds/LShape.w" }
  "AgentLShapeKarel" { "worlds/LShapeStack.w" }
}
javac -cp lib/karel.jar *.java
if ($LASTEXITCODE -ne 0) { exit $LASTEXITCODE }
java "-Dkarel.world=$World" -cp ".;lib/karel.jar" $Program
exit $LASTEXITCODE

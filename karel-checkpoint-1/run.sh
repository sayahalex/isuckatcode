#!/bin/bash
set -euo pipefail
cd -- "$(dirname -- "$0")"
program="${1:-MyKarel}"
case "$program" in
  MyKarel) world="worlds/KarelStartWorld.w" ;;
  LShapeKarel) world="worlds/LShape.w" ;;
  AgentLShapeKarel) world="worlds/LShapeStack.w" ;;
  *) echo "Choose MyKarel, LShapeKarel, or AgentLShapeKarel." >&2; exit 1 ;;
esac
javac -cp lib/karel.jar *.java
java -Dkarel.world="$world" -cp ".:lib/karel.jar" "$program"

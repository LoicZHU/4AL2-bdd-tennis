package org.example.game;

public enum ScoreState {
  LOVE("0"),
  FIFTEEN("15"),
  THIRTY("30"),
  FORTY("40"),
  DEUCE("deuce"),
  ADVANTAGE("advantage"),
  WIN("win");

  private final String score;

  ScoreState(String score) {
    this.score = score;
  }

  public String getScore() {
    return score;
  }
}

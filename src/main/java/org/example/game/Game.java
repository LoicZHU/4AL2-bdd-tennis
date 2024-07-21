package org.example.game;

public class Game {

  private ScoreState player1Score;
  private ScoreState player2Score;

  public Game(ScoreState score1, ScoreState score2) {
    this.player1Score = score1;
    this.player2Score = score2;
  }

  public String getPlayer1Score() {
    return player1Score.getScore();
  }

  public String getPlayer2Score() {
    return player2Score.getScore();
  }

  public Boolean isPlayer1Winner() {
    return player1Score instanceof WinState;
  }

  public Boolean isPlayer2Winner() {
    return player2Score instanceof WinState;
  }

  public void player1Scores() {
    player1Score.player1Scores(this);
  }

  public void player2Scores() {
    player2Score.player2Scores(this);
  }

  public void setPlayer1Score(ScoreState score) {
    this.player1Score = score;
  }

  public void setPlayer2Score(ScoreState score) {
    this.player2Score = score;
  }

  public boolean isPlayer1Advantage() {
    return player1Score.getScore().equals("advantage");
  }

  public boolean isPlayer2Advantage() {
    return player2Score.getScore().equals("advantage");
  }
}

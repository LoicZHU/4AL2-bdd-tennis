package org.example.game;

public class Game {

  private String player1Score;
  private String player2Score;

  public Game(String score1, String score2) {
    this.player1Score = score1;
    this.player2Score = score2;
  }

  public String getPlayer1Score() {
    return player1Score;
  }

  public String getPlayer2Score() {
    return player2Score;
  }

  public Boolean isPlayer1Winner() {
    return ScoreState.WIN.getScore().equals(player1Score);
  }

  public Boolean isPlayer2Winner() {
    return ScoreState.WIN.getScore().equals(player2Score);
  }

  public void player1Scores() {
    if (ScoreState.ADVANTAGE.getScore().equals(player1Score)) {
      player1Score = ScoreState.WIN.getScore();
    } else if (ScoreState.ADVANTAGE.getScore().equals(player2Score)) {
      player2Score = ScoreState.DEUCE.getScore();
      player1Score = ScoreState.DEUCE.getScore();
    } else if (
      ScoreState.DEUCE.getScore().equals(player1Score) &&
      ScoreState.DEUCE.getScore().equals(player2Score)
    ) {
      player1Score = ScoreState.ADVANTAGE.getScore();
      player2Score = ScoreState.FORTY.getScore();
    } else if (
      ScoreState.THIRTY.getScore().equals(player1Score) &&
      ScoreState.FORTY.getScore().equals(player2Score)
    ) {
      player1Score = ScoreState.DEUCE.getScore();
      player2Score = ScoreState.DEUCE.getScore();
    } else if (ScoreState.FORTY.getScore().equals(player1Score)) {
      player1Score = ScoreState.WIN.getScore();
    } else if (ScoreState.THIRTY.getScore().equals(player1Score)) {
      player1Score = ScoreState.FORTY.getScore();
    } else if (ScoreState.FIFTEEN.getScore().equals(player1Score)) {
      player1Score = ScoreState.THIRTY.getScore();
    } else if (ScoreState.LOVE.getScore().equals(player1Score)) {
      player1Score = ScoreState.FIFTEEN.getScore();
    }
  }

  public void player2Scores() {
    if (ScoreState.ADVANTAGE.getScore().equals(player2Score)) {
      player2Score = ScoreState.WIN.getScore();
    } else if (ScoreState.ADVANTAGE.getScore().equals(player1Score)) {
      player1Score = ScoreState.DEUCE.getScore();
      player2Score = ScoreState.DEUCE.getScore();
    } else if (
      ScoreState.DEUCE.getScore().equals(player2Score) &&
      ScoreState.DEUCE.getScore().equals(player1Score)
    ) {
      player2Score = ScoreState.ADVANTAGE.getScore();
      player1Score = ScoreState.FORTY.getScore();
    } else if (
      ScoreState.THIRTY.getScore().equals(player2Score) &&
      ScoreState.FORTY.getScore().equals(player1Score)
    ) {
      player2Score = ScoreState.DEUCE.getScore();
      player1Score = ScoreState.DEUCE.getScore();
    } else if (ScoreState.FORTY.getScore().equals(player2Score)) {
      player2Score = ScoreState.WIN.getScore();
    } else if (ScoreState.THIRTY.getScore().equals(player2Score)) {
      player2Score = ScoreState.FORTY.getScore();
    } else if (ScoreState.FIFTEEN.getScore().equals(player2Score)) {
      player2Score = ScoreState.THIRTY.getScore();
    } else if (ScoreState.LOVE.getScore().equals(player2Score)) {
      player2Score = ScoreState.FIFTEEN.getScore();
    }
  }
}

package org.example.game;

public class Game {

  private String player1Score;
  private String player2Score;

  public Game(String score1, String score2) {
    this.player1Score = score1;
    this.player2Score = score2;
  }

  public String getPlayer1Score() {
    return this.player1Score;
  }

  public String getPlayer2Score() {
    return this.player2Score;
  }

  public Boolean isPlayer1Winner() {
    return ScoreState.WIN.getScore().equals(this.player1Score);
  }

  public Boolean isPlayer2Winner() {
    return ScoreState.WIN.getScore().equals(this.player2Score);
  }

  private Boolean isScoreLove(String score) {
    return ScoreState.LOVE.getScore().equals(score);
  }

  private Boolean isScoreFifteen(String score) {
    return ScoreState.FIFTEEN.getScore().equals(score);
  }

  private Boolean isScoreThirty(String score) {
    return ScoreState.THIRTY.getScore().equals(score);
  }

  private Boolean isScoreForty(String score) {
    return ScoreState.FORTY.getScore().equals(score);
  }

  private Boolean areBothScoresDeuce(String score1, String score2) {
    return (
      ScoreState.DEUCE.getScore().equals(score1) &&
      ScoreState.DEUCE.getScore().equals(score2)
    );
  }

  private Boolean isScoreAdvantage(String score) {
    return ScoreState.ADVANTAGE.getScore().equals(score);
  }

  public void player1Scores() {
    if (this.isScoreAdvantage(this.player1Score)) {
      this.player1Score = ScoreState.WIN.getScore();
    } else if (this.isScoreAdvantage(this.player2Score)) {
      this.player2Score = ScoreState.DEUCE.getScore();
      this.player1Score = ScoreState.DEUCE.getScore();
    } else if (this.areBothScoresDeuce(this.player1Score, this.player2Score)) {
      this.player1Score = ScoreState.ADVANTAGE.getScore();
      this.player2Score = ScoreState.FORTY.getScore();
    } else if (
      this.isScoreThirty(this.player1Score) && this.isScoreForty(this.player2Score)
    ) {
      this.player1Score = ScoreState.DEUCE.getScore();
      this.player2Score = ScoreState.DEUCE.getScore();
    } else if (this.isScoreForty(this.player1Score)) {
      this.player1Score = ScoreState.WIN.getScore();
    } else if (this.isScoreThirty(this.player1Score)) {
      this.player1Score = ScoreState.FORTY.getScore();
    } else if (this.isScoreFifteen(this.player1Score)) {
      this.player1Score = ScoreState.THIRTY.getScore();
    } else if (this.isScoreLove(this.player1Score)) {
      this.player1Score = ScoreState.FIFTEEN.getScore();
    }
  }

  public void player2Scores() {
    if (this.isScoreAdvantage(this.player2Score)) {
      this.player2Score = ScoreState.WIN.getScore();
    } else if (this.isScoreAdvantage(this.player1Score)) {
      this.player1Score = ScoreState.DEUCE.getScore();
      this.player2Score = ScoreState.DEUCE.getScore();
    } else if (this.areBothScoresDeuce(this.player1Score, this.player2Score)) {
      this.player2Score = ScoreState.ADVANTAGE.getScore();
      this.player1Score = ScoreState.FORTY.getScore();
    } else if (
      this.isScoreThirty(this.player2Score) && this.isScoreForty(this.player1Score)
    ) {
      this.player2Score = ScoreState.DEUCE.getScore();
      this.player1Score = ScoreState.DEUCE.getScore();
    } else if (this.isScoreForty(this.player2Score)) {
      this.player2Score = ScoreState.WIN.getScore();
    } else if (this.isScoreThirty(this.player2Score)) {
      this.player2Score = ScoreState.FORTY.getScore();
    } else if (this.isScoreFifteen(this.player2Score)) {
      this.player2Score = ScoreState.THIRTY.getScore();
    } else if (this.isScoreLove(this.player2Score)) {
      this.player2Score = ScoreState.FIFTEEN.getScore();
    }
  }
}

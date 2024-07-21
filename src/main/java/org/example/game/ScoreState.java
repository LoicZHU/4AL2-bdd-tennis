package org.example.game;


public interface ScoreState {
    String getScore();
    void player1Scores(Game game);
    void player2Scores(Game game);
}

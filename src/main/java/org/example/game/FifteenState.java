package org.example.game;

public class FifteenState implements ScoreState {
    @Override
    public String getScore() {
        return "15";
    }

    @Override
    public void player1Scores(Game game) {
        game.setPlayer1Score(new ThirtyState());
    }

    @Override
    public void player2Scores(Game game) {
        game.setPlayer2Score(new ThirtyState());
    }
}
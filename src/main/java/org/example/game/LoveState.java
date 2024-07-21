package org.example.game;

public class LoveState implements ScoreState {
    @Override
    public String getScore() {
        return "love";
    }

    @Override
    public void player1Scores(Game game) {
        game.setPlayer1Score(new FifteenState());
    }

    @Override
    public void player2Scores(Game game) {
        game.setPlayer2Score(new FifteenState());
    }
}

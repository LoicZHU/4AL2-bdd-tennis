package org.example.game;

public class DeuceState implements ScoreState {
    @Override
    public String getScore() {
        return "deuce";
    }

    @Override
    public void player1Scores(Game game) {
        game.setPlayer1Score(new AdvantageState());
        game.setPlayer2Score(new FortyState());
    }

    @Override
    public void player2Scores(Game game) {
        game.setPlayer2Score(new AdvantageState());
        game.setPlayer1Score(new FortyState());
    }
}

package org.example.game;

public class FortyState implements ScoreState {
    @Override
    public String getScore() {
        return "40";
    }

    @Override
    public void player1Scores(Game game) {
        if (game.getPlayer2Score().equals("40")) {
            game.setPlayer1Score(new AdvantageState());
        } else if (game.getPlayer2Score().equals("advantage")) {
            game.setPlayer1Score(new DeuceState());
            game.setPlayer2Score(new DeuceState());
        } else {
            game.setPlayer1Score(new WinState());
        }
    }

    @Override
    public void player2Scores(Game game) {
        if (game.getPlayer1Score().equals("40")) {
            game.setPlayer2Score(new AdvantageState());
        } else if (game.getPlayer1Score().equals("advantage")) {
            game.setPlayer1Score(new DeuceState());
            game.setPlayer2Score(new DeuceState());
        } else {
            game.setPlayer2Score(new WinState());
        }
    }
}

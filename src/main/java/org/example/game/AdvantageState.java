package org.example.game;

public class AdvantageState implements ScoreState {
    @Override
    public String getScore() {
        return "advantage";
    }

    @Override
    public void player1Scores(Game game) {
        if (game.getPlayer2Score().equals("advantage") && game.getPlayer1Score().equals("40")) {
            game.setPlayer1Score(new DeuceState());
            game.setPlayer2Score(new DeuceState());
        } else {
            game.setPlayer1Score(new WinState());
        }
    }

    @Override
    public void player2Scores(Game game) {
        if (game.getPlayer1Score().equals("40")  && game.getPlayer2Score().equals("40")) {
            game.setPlayer1Score(new DeuceState());
            game.setPlayer2Score(new DeuceState());
        } else {
            game.setPlayer2Score(new WinState());
        }
    }
}

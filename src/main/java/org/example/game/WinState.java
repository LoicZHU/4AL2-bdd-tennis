package org.example.game;

public class WinState implements ScoreState {
    @Override
    public String getScore() {
        return "win";
    }

    @Override
    public void player1Scores(Game game) {
        // No-op, the game is already won
    }

    @Override
    public void player2Scores(Game game) {
        // No-op, the game is already won
    }
}
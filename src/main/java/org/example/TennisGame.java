package org.example;

public class TennisGame {

    private Player player1;
    private Player player2;
    private GameStates gameState;

    public TennisGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameState = GameStates.NORMAL;
    }

    public void updateGameState() {
        // Implement logic to update game state based on players' scores
    }

    public String getWinner() {
        // TODO
        return "";
    }

    public void pointWonBy(Player player) {
        // TODO
    }
}
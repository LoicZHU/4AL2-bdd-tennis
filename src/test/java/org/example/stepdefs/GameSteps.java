package org.example.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.game.Game;

public class GameSteps {

  private Game game;

  @Given("the initial score is {string} {string}")
  public void theInitialScoreIs(String score1, String score2) {
    game = new Game(score1, score2);
  }

  @When("Player1 wins a point")
  public void playerOneWinsAPoint() {
    game.playerOneScores();
  }

  @When("Player2 wins a point")
  public void playerTwoWinsAPoint() {
    game.playerTwoScores();
  }

  @Then("Player1 should win the game")
  public void playerOneShouldWinTheGame() {
    assertTrue(game.isPlayerOneWinner());
  }

  @Then("the score should be {string} {string}")
  public void theScoreShouldBe(String expectedScore1, String expectedScore2) {
    assertEquals(expectedScore1, game.getPlayer1Score());
    assertEquals(expectedScore2, game.getPlayer2Score());
  }
}

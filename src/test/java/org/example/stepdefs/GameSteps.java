package org.example.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.game.Game;

public class GameSteps {

  private Game game;

  @Given("the current score is {string} {string}")
  public void theInitialScoreIs(String score1, String score2) {
    game = new Game(score1, score2);
  }

  @When("Player1 wins a point")
  public void player1WinsAPoint() {
    game.player1Scores();
  }

  @When("Player2 wins a point")
  public void playerTwoWinsAPoint() {
    game.player2Scores();
  }

  @Then("Player1 should win the game")
  public void player1ShouldWinTheGame() {
    assertTrue(game.isPlayer1Winner());
  }

  @Then("Player2 should win the game")
  public void player2ShouldWinTheGame() {
    assertTrue(game.isPlayer2Winner());
  }

  @Then("the score should be {string} {string}")
  public void theScoreShouldBe(String expectedScore1, String expectedScore2) {
    assertEquals(expectedScore1, game.getPlayer1Score());
    assertEquals(expectedScore2, game.getPlayer2Score());
  }
}

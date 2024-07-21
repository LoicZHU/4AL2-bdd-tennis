package org.example.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.game.*;

public class GameSteps {

  private Game game;

  @Given("the initial score is {string} {string}")
  public void theInitialScoreIs(String score1, String score2) {
    game = new Game(getStateFromString(score1), getStateFromString(score2));
  }

  @When("Player1 wins a point")
  public void player1WinsAPoint() {
    game.player1Scores();
  }

  @When("Player2 wins a point")
  public void player2WinsAPoint() {
    game.player2Scores();
  }

  @Then("the score should be {string} {string}")
  public void theScoreShouldBe(String expectedScore1, String expectedScore2) {
    assertEquals(expectedScore1, game.getPlayer1Score());
    assertEquals(expectedScore2, game.getPlayer2Score());
  }

  @Then("Player1 should win the game")
  public void player1ShouldWinTheGame() {
    assertTrue(game.isPlayer1Winner());
  }

  @Then("Player2 should win the game")
  public void player2ShouldWinTheGame() {
    assertTrue(game.isPlayer2Winner());
  }

  private ScoreState getStateFromString(String score) {
    switch (score) {
      case "love":
        return new LoveState();
      case "15":
        return new FifteenState();
      case "30":
        return new ThirtyState();
      case "40":
        return new FortyState();
      case "deuce":
        return new DeuceState();
      case "advantage":
        return new AdvantageState();
      case "win":
        return new WinState();
      default:
        throw new IllegalArgumentException("Invalid score: " + score);
    }
  }
}

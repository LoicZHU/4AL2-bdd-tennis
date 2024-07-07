Feature: Tennis Game Scoring

  Scenario: Player 1 scores first point
    Given the game is started
    When player 1 scores 1 point
    Then the score for player 1 is "15"


  Scenario: Player 1 scores two points
    Given the game is started
    When player 1 scores 2 points
    Then the score for player 1 is "30"


  Scenario: Player 1 scores three points
    Given the game is started
    When player 1 scores 3 points
    Then the score for player 1 is "40"


  Scenario: Player 1 wins the game
    Given the game is started
    When player 1 scores 4 points
    Then player 1 wins the game


  Scenario: Players reach deuce
    Given the game is started
    When both players score 3 points
    Then the score is deuce

  Scenario: Player 1 gets advantage
    Given the game is in deuce
    When player 1 scores a point
    Then player 1 has advantage


  Scenario: Player 1 wins from advantage
    Given player 1 has advantage
    When player 1 scores a point
    Then player 1 wins the game


  Scenario: Player 1 loses advantage
    Given player 1 has advantage
    When player 2 scores a point
    Then the score is deuce


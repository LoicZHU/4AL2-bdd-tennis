Feature: Game scoring

  Scenario: Player1 wins the first point
    Given the initial score is "love" "love"
    When Player1 wins a point
    Then the score should be "15" "love"

  Scenario: Player1 wins the second point
    Given the initial score is "15" "love"
    When Player1 wins a point
    Then the score should be "30" "love"

  Scenario: Player1 wins the third point
    Given the initial score is "30" "love"
    When Player1 wins a point
    Then the score should be "40" "love"

  Scenario: Player1 wins the fourth point and wins the game
    Given the initial score is "40" "love"
    When Player1 wins a point
    Then Player1 should win the game

  Scenario: Player1 wins the game directly by reaching 40 and winning the next point
    Given the initial score is "40" "10"
    When Player1 wins a point
    Then Player1 should win the game

  Scenario: Player1 wins the game directly by reaching 40 and winning the next point
    Given the initial score is "40" "20"
    When Player1 wins a point
    Then Player1 should win the game

  Scenario: Player1 wins the game directly by reaching 40 and winning the next point
    Given the initial score is "40" "30"
    When Player1 wins a point
    Then Player1 should win the game

  Scenario: Both players reach 40 and go to deuce
    Given the initial score is "30" "40"
    When Player1 wins a point
    Then the score should be "deuce" "deuce"

  Scenario: Player1 without advantage wins a point and the score goes back to deuce
    Given the initial score is "40" "advantage"
    When Player1 wins a point
    Then the score should be "deuce" "deuce"

  Scenario: Player1 wins a point at deuce and gets advantage
    Given the initial score is "40" "40"
    When Player1 wins a point
    Then the score should be "advantage" "40"

  Scenario: Player1 with advantage wins the next point and wins the game
    Given the initial score is "advantage" "40"
    When Player1 wins a point
    Then Player1 should win the game

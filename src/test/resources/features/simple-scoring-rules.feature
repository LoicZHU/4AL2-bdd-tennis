Feature: Simple scoring rules

  Rule: When the score should change without encountering special rules

    Scenario: Player1 score reach the same score 15 as Player2
      Given the initial score is "love" "15"
      When Player1 wins a point
      Then the score should be "15" "15"
    Scenario: Player2 score reach the same score 15 as Player1
      Given the initial score is "15" "love"
      When Player2 wins a point
      Then the score should be "15" "15"

    Scenario: Player1 score reach the same score 30 as Player2
      Given the initial score is "15" "30"
      When Player1 wins a point
      Then the score should be "30" "30"
    Scenario: Player2 score reach the same score 30 as Player1
      Given the initial score is "30" "15"
      When Player2 wins a point
      Then the score should be "30" "30"

    Scenario: Player1 wins the first point
      Given the initial score is "love" "love"
      When Player1 wins a point
      Then the score should be "15" "love"
    Scenario: Player2 wins the first point
      Given the initial score is "love" "love"
      When Player2 wins a point
      Then the score should be "love" "15"

    Scenario: Player1 wins the second point
      Given the initial score is "15" "love"
      When Player1 wins a point
      Then the score should be "30" "love"
    Scenario: Player2 wins the second point
      Given the initial score is "love" "15"
      When Player2 wins a point
      Then the score should be "love" "30"

    Scenario: Player1 wins the third point
      Given the initial score is "30" "love"
      When Player1 wins a point
      Then the score should be "40" "love"
    Scenario: Player2 wins the third point
      Given the initial score is "love" "30"
      When Player2 wins a point
      Then the score should be "love" "40"

    Scenario: Player1 wins the fourth point and wins the game
      Given the initial score is "40" "love"
      When Player1 wins a point
      Then Player1 should win the game
    Scenario: Player2 wins the fourth point and wins the game
      Given the initial score is "love" "40"
      When Player2 wins a point
      Then Player2 should win the game

    Scenario: Player1 wins the game directly by reaching 40 and winning the next point
      Given the initial score is "40" "10"
      When Player1 wins a point
      Then Player1 should win the game
    Scenario: Player2 wins the game directly by reaching 40 and winning the next point
      Given the initial score is "10" "40"
      When Player2 wins a point
      Then Player2 should win the game

    Scenario: Player1 wins the game directly by reaching 40 and winning the next point
      Given the initial score is "40" "20"
      When Player1 wins a point
      Then Player1 should win the game
    Scenario: Player2 wins the game directly by reaching 40 and winning the next point
      Given the initial score is "20" "40"
      When Player2 wins a point
      Then Player2 should win the game

    Scenario: Player1 wins the game directly by reaching 40 and winning the next point
      Given the initial score is "40" "30"
      When Player1 wins a point
      Then Player1 should win the game
    Scenario: Player2 wins the game directly by reaching 40 and winning the next point
      Given the initial score is "30" "40"
      When Player2 wins a point
      Then Player2 should win the game

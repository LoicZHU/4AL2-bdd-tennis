Feature: Simple scoring rules

  Rule: When the score should change without encountering special rules

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

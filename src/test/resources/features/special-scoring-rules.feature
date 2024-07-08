Feature: Special rules scoring

  Rule: The score should be "deuce" and "deuce" when both players reach 40

    Scenario: Both players reach 40 and go to deuce
    Given the initial score is "30" "40"
    When Player1 wins a point
    Then the score should be "deuce" "deuce"

    Scenario: Player1 without advantage wins a point and the score goes back to deuce
    Given the initial score is "40" "advantage"
    When Player1 wins a point
    Then the score should be "deuce" "deuce"

  Rule: The score should be "advantage" and "40" when one player has advantage

    Scenario: Player1 wins a point at deuce and gets advantage
      Given the initial score is "deuce" "deuce"
      When Player1 wins a point
      Then the score should be "advantage" "40"

  Rule: One player should win the game when having advantage and winning the next point

    Scenario: Player1 with advantage wins the next point and wins the game
      Given the initial score is "advantage" "40"
      When Player1 wins a point
      Then Player1 should win the game

package org.example;

import java.util.List;

public final class Score {

    private static final List<String> scores = List.of("love", "15", "30", "40");
    private int currentIndex;

    public Score() {
        this.currentIndex = 0;
    }

    public String getCurrentScore() {
        return scores.get(currentIndex);
    }

    public void updateScore() {
        // TODO
    }

    public boolean isForty() {
        return currentIndex == 3;
    }
}
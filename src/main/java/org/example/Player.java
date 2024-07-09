package org.example;

public class Player {
    private String name;
    private Score points;

    public Player(String name) {
        this.name = name;
        this.points = new Score();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getPoints() {
        return points;
    }

    public void scorePoint() {
        // TODO
    }
}
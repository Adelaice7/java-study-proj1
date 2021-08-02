package com.adelaice.model;

public class Player {

    public String fullName;
    public String weapon;
    public int health;

    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player is knocked out.");
            // Reduce number of lives remaining for player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}

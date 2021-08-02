package com.adelaice.model;

public class EnhancedPlayer {

    private String name;
    private String weapon;
    private int health = 100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;

        if (health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player is knocked out.");
            // Reduce number of lives remaining for player
        }
    }

    public int getHealth() {
        return health;
    }
}

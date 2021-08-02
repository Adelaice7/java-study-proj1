package com.adelaice.model;

public class Room {
    private int windows;
    private int doors;
    private String colorOfWalls;
    private boolean bed;

    public Room(int windows, int doors, String colorOfWalls, boolean bed) {
        this.windows = windows;
        this.doors = doors;
        this.colorOfWalls = colorOfWalls;
        this.bed = bed;
    }

    public void paintWalls(String color) {
        this.colorOfWalls = color;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public String getColorOfWalls() {
        return colorOfWalls;
    }

    public boolean isBed() {
        return bed;
    }
}

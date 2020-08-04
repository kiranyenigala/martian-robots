package com.lme.martian;

public class Location {

    private int x;

    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX() {
        x = x + 1;
    }

    public void decrementX() {
        x =  x - 1;
    }

    public void incrementY() {
        y = y + 1;
    }

    public void decrementY() {
        y = y - 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x &&
                y == location.y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

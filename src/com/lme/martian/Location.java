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

    public int incrementX() {
        return x++;
    }

    public int decrementX() {
        return x--;
    }

    public int incrementY() {
        return y++;
    }

    public int decrementY() {
        return y--;
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

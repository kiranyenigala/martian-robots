package com.lme.martian;

import java.util.Objects;

public class Scent {

    private final Location location;

    private final Orientation orientation;

    public Scent(Location location, Orientation orientation) {
        this.location = location;
        this.orientation = orientation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scent scent = (Scent) o;
        return Objects.equals(location, scent.location) &&
                orientation == scent.orientation;
    }


    @Override
    public String toString() {
        return location.getX() + " " + location.getY() + " " + orientation.toString();
    }
}

package com.lme.martian;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    private Location upperRightLocation;
    private List<Robot> robots = new ArrayList<>();
    private List<Scent> scents = new ArrayList<>();

    public Planet(Location upperRightLocation) {
        this.upperRightLocation = upperRightLocation;
    }

    public void addRobot(Robot robot) {
        this.robots.add(robot);
    }

    public void addScent(Scent scent) {
        this.scents.add(scent);
    }

    public Location getUpperRightLocation() {
        return upperRightLocation;
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public boolean hasScent(Scent tmpScent) {
        return this.scents.stream().anyMatch(scent -> scent.equals(tmpScent));
    }
}

package com.lme.martian;

public class Robot {

    private final Planet planet;
    private final Location location;
    private Orientation orientation;
    private Scent scent;

    public Robot(Planet planet,
                 Location location,
                 Orientation orientation,
                 String instructions){
        this.planet = planet;
        this.orientation = orientation;
        this.location = location;
        planet.addRobot(this);
        this.moveRobot(instructions);
    }

    private void moveRobot(String instructions) {
        for (char c : instructions.toCharArray()) {
            if (isLost()) {
                break;
            }
            switch (c) {
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'F':
                    moveForward();
                    break;
            }
        }
    }

    private void turnLeft() {
        switch (orientation) {
            case N:
                orientation = Orientation.W;
                break;
            case E:
                orientation = Orientation.N;
                break;
            case S:
                orientation = Orientation.E;
                break;
            case W:
                orientation = Orientation.S;
                break;
        }
    }

    private void turnRight() {
        switch (orientation) {
            case N:
                orientation = Orientation.E;
                break;
            case E:
                orientation = Orientation.S;
                break;
            case S:
                orientation = Orientation.W;
                break;
            case W:
                orientation = Orientation.N;
                break;
        }
    }

    private void moveForward() {
        Scent tempScent = new Scent(new Location(location.getX(), location.getY()), orientation);
        if (planet.hasScent(tempScent)) {
            return;
        } else {
            switch (orientation) {
                case N:
                    location.incrementY();
                    break;
                case E:
                    location.incrementX();
                    break;
                case S:
                    location.decrementY();
                    break;
                case W:
                    location.decrementX();
                    break;
            }
            if (isLost()) {
                scent = tempScent;
                planet.addScent(scent);
            }
        }
    }

    private boolean isLost(){
        return location.getX() > planet.getUpperRightLocation().getX()
                || location.getY() > planet.getUpperRightLocation().getY()
                || location.getX() < 0
                || location.getY() < 0;
    }

    public void printRobotPosition(){
        if(isLost()){
            System.out.println(scent.toString() + " LOST");
        } else{
            System.out.println(location.toString() + " " + orientation.toString());
        }
    }
}

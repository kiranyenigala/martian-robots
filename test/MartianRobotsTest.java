import com.lme.martian.Location;
import com.lme.martian.Orientation;
import com.lme.martian.Planet;
import com.lme.martian.Robot;

public class MartianRobotsTest {

    public static void main(String[] args) {
        Planet planet = new Planet(new Location(5,3));

        new Robot(planet, new Location(1,1), Orientation.E, "RFRFRFRF");
        new Robot(planet, new Location(3,2), Orientation.N, "FRRFLLFFRRFLL");
        new Robot(planet, new Location(0,3), Orientation.W, "LLFFFLFLFL");

        planet.getRobots().forEach(robot -> robot.printRobotPosition());
    }
}

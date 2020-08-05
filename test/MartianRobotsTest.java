import com.lme.martian.Location;
import com.lme.martian.Orientation;
import com.lme.martian.Planet;
import com.lme.martian.Robot;

public class MartianRobotsTest {

    public static void main(String[] args) {
        Planet planet = new Planet(new Location(5,3));

        Robot robot = new Robot(planet, new Location(1,1), Orientation.E);
        robot.moveRobot("RFRFRFRF");
        robot = new Robot(planet, new Location(3,2), Orientation.N);
        robot.moveRobot("FRRFLLFFRRFLL");
        robot = new Robot(planet, new Location(0,3), Orientation.W);
        robot.moveRobot("LLFFFLFLFL");

        planet.getRobots().forEach(r -> r.printRobotPosition());
    }
}

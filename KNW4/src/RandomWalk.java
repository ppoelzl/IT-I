import java.util.ArrayList;

public class RandomWalk {
    private Position ziel;
    private Roboter roboter;

    public RandomWalk(Position dasZiel, Roboter derRoboter) {
        this.ziel = dasZiel;
        this.roboter = derRoboter;
    }

    public ArrayList<Position> startRandomWalk(double schwellwert) {
        ArrayList<Position> walk = new ArrayList<Position>();
        do {
            Position neu = this.roboter.makeRandomStep();
            walk.add(neu);
        } while (Math.abs(neu.getX() - this.ziel.getX()) > schwellwert || Math.abs(neu.getY() - this.ziel.getY()) > schwellwert);
        return walk;
    }
}

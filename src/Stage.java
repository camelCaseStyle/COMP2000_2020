<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

public class Stage {
    Grid grid; 
    List<Actor> actor; 
    public Stage(){
        this.grid = new Grid();
        this.actor = new ArrayList<Actor>(); 
=======
import java.awt.*;

public class Stage {
    Grid grid;
    Actor puppy;
    Actor lion;
    Actor rabbit;

    public Stage(){
        grid = new Grid();
        puppy = new Puppy(grid.cellAtColRow(0, 0));
        lion = new Lion(grid.cellAtColRow(0, 18));
        rabbit = new Rabbit(grid.cellAtColRow(14,3));
    }

    public void paint(Graphics g, Point mouseLoc){
        grid.paint(g,mouseLoc);
        puppy.paint(g);
        lion.paint(g);
        rabbit.paint(g);
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
    }
}
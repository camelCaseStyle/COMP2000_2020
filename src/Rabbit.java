<<<<<<< HEAD
import java.awt.Graphics;

public class Rabbit implements Actor {
    Cell cell;
    public Rabbit (){
        this.cell = new Cell(2, 0);
    }
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub

=======
import java.awt.*;

public class Rabbit extends Actor {

    public Rabbit(Cell loc) {
        this.loc = loc;
        this.colour = Color.WHITE;
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
    }

}
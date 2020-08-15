<<<<<<< HEAD
import java.awt.Graphics;

public class Lion implements Actor {
    Cell cell; 
    public Lion(){
        this.cell = new Cell(0,1);
    }
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub

=======
import java.awt.*;

public class Lion extends Actor {

    public Lion(Cell loc) {
        this.loc = loc;
        this.colour = Color.RED;
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
    }

}
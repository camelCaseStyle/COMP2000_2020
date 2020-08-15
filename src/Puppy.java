<<<<<<< HEAD
import java.awt.Graphics;
import java.awt.*;

import javax.swing.plaf.ColorUIResource;

public class Puppy implements Actor {

    Cell cell;
    public Puppy(){
        this.cell = new Cell(1,0);
    }

    @Override
    public void paint(Graphics g){
        Color red = new ColorUIResource(255, 0, 0);
        g.setColor(red);
        cell.paint(g, new Point());
=======
import java.awt.*;

public class Puppy extends Actor {

    public Puppy(Cell loc){
        this.loc = loc;
        this.colour = Color.GREEN;
>>>>>>> c3d3273b6f732c62e9e1e3179e02f7d0ec82caf7
    }

}
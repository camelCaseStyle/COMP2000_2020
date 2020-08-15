import java.util.ArrayList;
import java.util.List;

public class Stage {
    Grid grid; 
    List<Actor> actor; 
    public Stage(){
        this.grid = new Grid();
        this.actor = new ArrayList<Actor>(); 
    }
}
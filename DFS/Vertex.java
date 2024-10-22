package DFS;
import java.util.ArrayList;
public class Vertex {
    int index;
    String name;
    boolean isvisited;
    ArrayList<Vertex>neighbours=new ArrayList<Vertex>();

    
    public Vertex(int index,String name)
    {
        this.index=index;
        this.name=name;
    }
}

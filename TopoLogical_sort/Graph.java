package TopoLogical_sort;
import java.util.ArrayList;
/* import java.util.Stack; */

public class Graph {
    ArrayList<Vertex> vertexList = new ArrayList<Vertex>();

    public Graph(ArrayList<Vertex> vertexList) {
        this.vertexList = vertexList;
    }
    void addDirectedEdges(int i,int j)
    {
        Vertex v1=vertexList.get(i);
        Vertex v2=vertexList.get(j);

        v1.neighbors.add(v2);

    }
    void printDirectedList()
    {
        for(Vertex v:vertexList)
        {
            System.out.print(v.name+" :");
            for(int i=0; i<v.neighbors.size();i++)
            {
                System.out.println(v.neighbors.get(i).name+"");
            }
            System.out.println();
        }
    }
}

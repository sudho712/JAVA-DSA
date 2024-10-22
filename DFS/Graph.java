
package DFS;

import java.util.ArrayList;
import java.util.Stack;

public class Graph {
    ArrayList<Vertex> vertexList = new ArrayList<Vertex>();

    public Graph(ArrayList<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

    public void addundirectednodes(int i, int j) {
        Vertex v1 = vertexList.get(i);
        Vertex v2 = vertexList.get(j);

        v1.neighbours.add(v2);
        v2.neighbours.add(v1);
    }

    public void PrintList() {
        for (Vertex v : vertexList) {
            System.out.print(v.name + ":");
            for (int i = 0; i < v.neighbours.size(); i++) {
                if (i == v.neighbours.size() - 1)
                    System.out.print(v.neighbours.get(i).name);
                else
                    System.out.print(v.neighbours.get(i).name + "->");
            }
            System.out.println();

        }
    }


     void printdfsnodes(Vertex node)
    {
        Stack<Vertex> st=new Stack<Vertex>();
        st.push(node);
        while (!st.isEmpty()) {
            Vertex curr=st.pop();
            System.out.print(curr.name+" ");
            curr.isvisited=true;
            for(Vertex v:curr.neighbours)            
            {
                if(!v.isvisited)
                {
                    st.push(v);
                    v.isvisited=true;
                }
            }            
        }
    }
    void dfs()
    {
        for(Vertex v:vertexList)
        {
            if(!v.isvisited)
            {
                printdfsnodes(v);
            }
        }
    }
}

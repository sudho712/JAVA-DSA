package DFS;

import java.util.ArrayList;
import java.util.Stack;

class mainClass{
    public static void main(String[] args) {
        ArrayList<Vertex> vertexList=new ArrayList<Vertex>();
        vertexList.add(new Vertex(0,"A"));
        vertexList.add(new Vertex(1,"B"));
        vertexList.add(new Vertex(2,"C"));
        vertexList.add(new Vertex(3,"D"));
        vertexList.add(new Vertex(4,"E"));

        Graph ob=new Graph(vertexList);
        ob.addundirectednodes(0,1);
        ob.addundirectednodes(0,2);
        ob.addundirectednodes(1,2);
        ob.addundirectednodes(2,3);
        ob.addundirectednodes(3,4);

        ob.PrintList();   
        ob.dfs();      
    }
   
}
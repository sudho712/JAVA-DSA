package TopoLogical_sort;

import java.util.ArrayList;

public class mainClass {
    public static void main(String[] args) {
        // Create the vertex list
        ArrayList<Vertex> vertexList = new ArrayList<>();

        vertexList.add(new Vertex(0, "A"));
        vertexList.add(new Vertex(1, "B"));
        vertexList.add(new Vertex(2, "C"));
        vertexList.add(new Vertex(3, "D"));
        vertexList.add(new Vertex(4, "E"));
        vertexList.add(new Vertex(5, "F"));
        vertexList.add(new Vertex(6, "G"));
        vertexList.add(new Vertex(7, "H")); // Vertices from 0 to 6

        // Create the graph object
        Graph ob = new Graph(vertexList);

        // Add directed edges
        ob.addDirectedEdges(0, 2);
        ob.addDirectedEdges(1, 2);
        ob.addDirectedEdges(1, 3);
        ob.addDirectedEdges(2, 4);
        ob.addDirectedEdges(3, 5);
        ob.addDirectedEdges(4, 5);
        ob.addDirectedEdges(5, 6);
        ob.addDirectedEdges(5, 7); // This line caused the error. Commented out as vertex 7 doesn't exist.

        // Print the adjacency list
        ob.printDirectedList();
    }
}

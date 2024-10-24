package OCT_SDP_gRAPH;


import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<GraphNode> nodelist=new ArrayList<GraphNode>();
		nodelist.add(new GraphNode(0,"A"));
		nodelist.add(new GraphNode(1,"B"));
		nodelist.add(new GraphNode(2,"C"));
		nodelist.add(new GraphNode(3,"D"));
		nodelist.add(new GraphNode(4,"E"));
		nodelist.add(new GraphNode(5,"F"));
		nodelist.add(new GraphNode(6,"G"));
		
		UGraph ob=new UGraph(nodelist);
		
		ob.addUndirectedEdges(0, 1);
		ob.addUndirectedEdges(0, 2);
		ob.addUndirectedEdges(1, 6);
		ob.addUndirectedEdges(1, 3);
		ob.addUndirectedEdges(2, 3);
		ob.addUndirectedEdges(2, 4);
		ob.addUndirectedEdges(3, 5);
		ob.addUndirectedEdges(4, 5);
		ob.addUndirectedEdges(5, 6);
		
		ob.sssPathBFS();
		
		System.out.println("ob.printGraph");
		
	}

}

package OCT_SDP_gRAPH;
import java.util.ArrayList;

public class GraphNode {
	int index;
	String name;
	GraphNode parent;
	boolean isVisited;
	
	ArrayList<GraphNode> neighbours=new ArrayList<GraphNode>();
	public GraphNode(int index,String name)
	{
		this.index=index;
		this.parent=parent;
		this.isVisited=false;
		
	}
}

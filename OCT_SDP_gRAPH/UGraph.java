
import java.util.ArrayList;
import java.util.LinkedList;

public class UGraph {
	ArrayList<GraphNode> nodelist =new ArrayList<GraphNode>();
	public UGraph(ArrayList<GraphNode>nodelist)
	{
		this.nodelist=nodelist;
	}
	void addUndirectedEdges(int i,int j)
	{
		GraphNode v1=nodelist.get(i);
		GraphNode v2=nodelist.get(j);
		
		v1.neighbours.add(v2);
		v2.neighbours.add(v1);
	}
	void printpath(GraphNode node)
	{
		if(node.parent!=null)
		{
			printpath(node.parent);
		}
		System.out.println(node.name+" ");
	}
	void sssPathBFS(GraphNode node)
	{
		LinkedList<GraphNode> q=new LinkedList<GraphNode>();
		q.add(node);
		while(!q.isEmpty())
		{
			GraphNode currnode=q.remove(0);
			currnode.isVisited=true;
			System.out.println("path to node A is "+currnode.name+" ");
			printpath(currnode);
			for(GraphNode neightbours:currnode.neighbours)
			{
				if(!neighbours)a
				{
					q.add(neighbours)
					neighbours.isVisitedd=true;
					neighbours.parent
				}
			}
			
		}
	}
}
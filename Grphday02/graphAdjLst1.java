package Grphday02;
import java.util.ArrayList;
class graphAdjList1{
    ArrayList<GraphNode> nodelist=new ArrayList<graphNode>();
    public graphAdjList1(ArrayList<GraphNode>nodeList)
    {
        this.nodelist=nodeList;
        this.nodeList=nodeList;
    }
    void addndirectedEdge(int i,int j)
    {
        graphNode v1=nodeList.get(i);
        graphNode v2=nodeList.get(i);

        v1.neighbours.add(v2)
        v2.neighbours.add(v1)
    }
    void printAdjList()
    {
        for(int i=0; i<nodelist.size();i++)
        {
            System.out.println(nodelist.get(i).name+":");
            {
                for(int j=0; j<nodeList.get(i).neighbours.size();i++)
                {

                }
            }
        }
    }
}
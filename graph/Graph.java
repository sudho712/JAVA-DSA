package graph;
import java.util.ArrayList;
class Graph{
    ArrayList<graphNode>nodeList=new ArrayList<graphNode>();
    int adjmat[][];
    public Graph(ArrayList<graphNode>nodeList)
    {
        this.nodeList=nodeList;
        adjmat=new int[nodeList.size()[nodeList.size]];

    }
    void addndirectededges(int i,int j)
    {
        adjamt[i][j]=1;
        adjmat[j][i]=1;
    }
    void printadjmat()
    {
        System.out.println("  ");
        for(GraphNode node:nodeList)
        {
            System.out.println(node.name+" ");
        }
        System.out.println(null);
        for(int i=0;)
    }
}
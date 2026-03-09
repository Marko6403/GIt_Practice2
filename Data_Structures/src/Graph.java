import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Graph {

    ArrayList<LinkedList<Integer>>Graph;
    public Graph()
    {
        Graph = new ArrayList<>();
    }

    //Creating Nodes (new LinkedList's)
    public void CreatingNodes()
    {
        Graph.add(new LinkedList<>());
    }

    //Creating Edges beetwen the Nodes
    public void AddEdge(int src,int dest)
    {
        if(src>Graph.size()-1 || dest>Graph.size()-1)
            throw new NoSuchElementException();
        Graph.get(src).add(dest);

    }
    //Printing Graph
    public void PrintGraph()
    {
        for(int i = 0;i<Graph.size();i++)
        {
            System.out.print("Element " +i+ " ->");
            //Gets integers that are in LinkedList at index i -> (0,2,3,1)
            for(Integer neighbor : Graph.get(i))
            {
                System.out.print(neighbor+" ");
            }
            System.out.println();
        }
    }

    // Depth First Search

    void dfs(int start,boolean[]array)
    {
        array[start] = true;
        for(int neighbor : Graph.get(start))
        {
            if(!array[neighbor])
                dfs(neighbor,array);
        }
    }

    //Helper class
    void DFS(int start)
    {
        boolean[]visited = new boolean[Graph.size()];
        dfs(start,visited);
    }


}

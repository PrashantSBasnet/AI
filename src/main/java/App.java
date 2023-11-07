import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main (String[] args){

       BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();


       System.out.println("---Breadth First Search---");

       Vertex a = new Vertex("A");
       Vertex b = new Vertex("B");
       Vertex c = new Vertex("C");
       Vertex d = new Vertex("D");
       Vertex e = new Vertex("E");
       Vertex f = new Vertex("F");
       Vertex g = new Vertex("G");
       Vertex h = new Vertex("H");

       a.addNeighbor(b);
       a.addNeighbor(f);
       a.addNeighbor(g);

       b.addNeighbor(a);
       b.addNeighbor(c);
       b.addNeighbor(d);

       c.addNeighbor(b);

       d.addNeighbor(b);
       d.addNeighbor(e);

       f.addNeighbor(a);

       g.addNeighbor(h);
       g.addNeighbor(a);

       h.addNeighbor(g);

       breadthFirstSearch.traverse(a);


       //---Depth First Search

       System.out.println("---Depth First Search---");

       VertexDFS v1 = new VertexDFS("A");
       VertexDFS v2 = new VertexDFS("B");
       VertexDFS v3 = new VertexDFS("C");
       VertexDFS v4 = new VertexDFS("D");
       VertexDFS v5 = new VertexDFS("E");

       List<VertexDFS> list = new ArrayList<>();
       v1.addNeighbor(v2);
       v1.addNeighbor(v3);
       v3.addNeighbor(v4);
       v4.addNeighbor(v5);

       list.add(v1);
       list.add(v2);
       list.add(v3);
       list.add(v4);
       list.add(v5);

       DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
       depthFirstSearch.dfs(list);
   }
}

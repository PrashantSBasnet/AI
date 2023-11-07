import java.sql.Statement;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private Stack<VertexDFS> stack;

    public DepthFirstSearch(){
        this.stack= new Stack<>();
    }

    public void dfs (List<VertexDFS> vertexList){

        //it may happen that we have independent cluster
        for (VertexDFS v: vertexList){
            if (!v.isVisited()){
                v.setVisited(true);
                dfsHelper(v);
            }
        }
    }

    private void dfsHelper(VertexDFS rootVertex){
        //LIFO structure
        stack.add(rootVertex);
        rootVertex.setVisited(true);

        while (!stack.isEmpty()){
            VertexDFS actualVertex = stack.pop();
            System.out.println(actualVertex);

            //consider all the neighbors
            for (VertexDFS v :actualVertex.getNeighhbors()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    stack.add(v);
                }
            }
        }
    }
}

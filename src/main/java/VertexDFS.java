import java.util.ArrayList;
import java.util.List;

public class VertexDFS {

    private String name;
    private boolean visited;
    private List<VertexDFS> adjacencyList;

    public VertexDFS(String name){
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbor(VertexDFS v){
        adjacencyList.add(v);
    }

    public List<VertexDFS> getNeighhbors(){
        return  adjacencyList;
    }


    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return name;
    }
}

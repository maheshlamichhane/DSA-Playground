import java.util.ArrayList;

public class GraphWithArray {

    ArrayList<GraphNodeWithArray> nodes;
    int[][] adjacencyMatrix;


    public GraphWithArray(ArrayList<GraphNodeWithArray> nodes) {
        this.nodes = nodes;
        adjacencyMatrix = new int[nodes.size()][nodes.size()];
    }

    public void addUndirectedEdge(int v, int w) {
        adjacencyMatrix[v][w] = 1;
        adjacencyMatrix[w][v] = 1;
    }

    public void printGraph(){
        System.out.print("  ");
        for(int i=0; i<nodes.size(); i++){
            System.out.print(nodes.get(i).value + " ");
        }
        System.out.println();
        for(int j=0; j<nodes.size(); j++){
            System.out.print(nodes.get(j).value + " ");
            for(int k : adjacencyMatrix[j]){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}

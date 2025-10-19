import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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

    public ArrayList<GraphNodeWithArray> getNeighbors(GraphNodeWithArray node) {
        ArrayList<GraphNodeWithArray> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for(int i=0; i<adjacencyMatrix.length;i++){
            if(adjacencyMatrix[nodeIndex][i] == 1){
                neighbors.add(nodes.get(i));
            }
        }
        return neighbors;
    }

    public void bfsVisit(GraphNodeWithArray node){
        LinkedList<GraphNodeWithArray> queue = new LinkedList<>();
        node.isVisited = true;
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNodeWithArray curentNode = queue.remove();
            System.out.println(curentNode.value);
            ArrayList<GraphNodeWithArray> neighbors = getNeighbors(curentNode);
            for(GraphNodeWithArray neighbor : neighbors){
                if(!neighbor.isVisited){
                    neighbor.isVisited = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public void bfs(){
        for(GraphNodeWithArray node: nodes){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
    // Time Complexity For Breadth First Traversal O(V+E),Space Complexity O(V+E)


    public void dfsVisit(GraphNodeWithArray node){
        Stack<GraphNodeWithArray> stack = new Stack<>();
        node.isVisited = true;
        stack.push(node);
        while(!stack.isEmpty()){
            GraphNodeWithArray curentNode = stack.pop();
            System.out.print(curentNode.value+" ");
            ArrayList<GraphNodeWithArray> neighbors = getNeighbors(curentNode);
            for(GraphNodeWithArray neighbor : neighbors){
                if(!neighbor.isVisited){
                    neighbor.isVisited = true;
                    stack.push(neighbor);
                }
            }
        }
    }

    public void dfs(){
        for(GraphNodeWithArray node: nodes){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }
    // Time Complexity For Breadth First Traversal O(V+E),Space Complexity O(V+E)


}

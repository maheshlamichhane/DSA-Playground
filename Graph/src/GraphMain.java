import java.util.ArrayList;

public class GraphMain {
    public static void main(String[] args) {

        ArrayList<GraphNode> nodes = new ArrayList<>();
        nodes.add(new GraphNode("A", 0));
        nodes.add(new GraphNode("B", 1));
        nodes.add(new GraphNode("C", 2));
        nodes.add(new GraphNode("D", 3));
        nodes.add(new GraphNode("E", 4));

        Graph graph = new Graph(nodes);
        graph.addUndirectedEdge(0,1);
        graph.addUndirectedEdge(0,3);
        graph.addUndirectedEdge(0,2);
        graph.addUndirectedEdge(1,4);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(3,4);

        graph.printGraph();


    }
}
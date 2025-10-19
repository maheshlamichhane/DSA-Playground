import java.util.ArrayList;

public class GraphWithArrayMain {
    public static void main(String[] args) {

        ArrayList<GraphNodeWithArray> nodes = new ArrayList<>();
        nodes.add(new GraphNodeWithArray("A", 0));
        nodes.add(new GraphNodeWithArray("B", 1));
        nodes.add(new GraphNodeWithArray("C", 2));
        nodes.add(new GraphNodeWithArray("D", 3));
        nodes.add(new GraphNodeWithArray("E", 4));

//        GraphWithArray graphWithArray = new GraphWithArray(nodes);
//        graphWithArray.addUndirectedEdge(0,1);
//        graphWithArray.addUndirectedEdge(0,3);
//        graphWithArray.addUndirectedEdge(0,2);
//        graphWithArray.addUndirectedEdge(1,4);
//        graphWithArray.addUndirectedEdge(2,3);
//        graphWithArray.addUndirectedEdge(3,4);

        GraphWithArray graphWithArray = new GraphWithArray(nodes);
        graphWithArray.addDirectedEdge(0,1);
        graphWithArray.addDirectedEdge(0,3);
        graphWithArray.addDirectedEdge(0,2);
        graphWithArray.addDirectedEdge(1,4);
        graphWithArray.addDirectedEdge(2,3);
        graphWithArray.addDirectedEdge(3,4);

//        graphWithArray.printGraph();
//        graphWithArray.bfs();
//        graphWithArray.dfs();
        graphWithArray.topologicalSort();


    }
}
import java.util.ArrayList;

public class GraphWithArrayMain {
    public static void main(String[] args) {

        ArrayList<GraphNodeWithArray> nodes = new ArrayList<>();
        nodes.add(new GraphNodeWithArray("A", 0));
        nodes.add(new GraphNodeWithArray("B", 1));
        nodes.add(new GraphNodeWithArray("C", 2));
        nodes.add(new GraphNodeWithArray("D", 3));
        nodes.add(new GraphNodeWithArray("E", 4));
        nodes.add(new GraphNodeWithArray("F", 5));
        nodes.add(new GraphNodeWithArray("G", 6));

        GraphWithArray graphWithArray = new GraphWithArray(nodes);
        graphWithArray.addUndirectedEdge(0,1);
        graphWithArray.addUndirectedEdge(0,2);
        graphWithArray.addUndirectedEdge(1,3);
        graphWithArray.addUndirectedEdge(1,6);
        graphWithArray.addUndirectedEdge(2,3);
        graphWithArray.addUndirectedEdge(2,4);
        graphWithArray.addUndirectedEdge(3,5);
        graphWithArray.addUndirectedEdge(4,5);
        graphWithArray.addUndirectedEdge(5,6);


//        graphWithArray.printGraph();
//        graphWithArray.bfs();
//        graphWithArray.dfs();
//        graphWithArray.topologicalSort();
        graphWithArray.BFSForSSSPP(nodes.get(0));




    }
}
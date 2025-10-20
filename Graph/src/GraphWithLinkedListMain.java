import java.util.ArrayList;

public class GraphWithLinkedListMain {

    public static void main(String[] args) {
        ArrayList<GraphNodeWithLinkedList> nodes = new ArrayList<>();
        nodes.add(new GraphNodeWithLinkedList("A", 0));
        nodes.add(new GraphNodeWithLinkedList("B", 1));
        nodes.add(new GraphNodeWithLinkedList("C", 2));
        nodes.add(new GraphNodeWithLinkedList("D", 3));
        nodes.add(new GraphNodeWithLinkedList("E", 4));
        nodes.add(new GraphNodeWithLinkedList("F", 5));
        nodes.add(new GraphNodeWithLinkedList("G", 6));

        GraphWithLinkedList graphWithLinkedList = new GraphWithLinkedList(nodes);
        graphWithLinkedList.addUndirectedEdge(0,1);
        graphWithLinkedList.addUndirectedEdge(0,2);
        graphWithLinkedList.addUndirectedEdge(1,3);
        graphWithLinkedList.addUndirectedEdge(1,6);
        graphWithLinkedList.addUndirectedEdge(2,3);
        graphWithLinkedList.addUndirectedEdge(2,4);
        graphWithLinkedList.addUndirectedEdge(3,5);
        graphWithLinkedList.addUndirectedEdge(4,5);
        graphWithLinkedList.addUndirectedEdge(5,6);

//        GraphWithLinkedList graphWithLinkedList = new GraphWithLinkedList(nodes);
//        graphWithLinkedList.addDirectedEdge(0,1);
//        graphWithLinkedList.addDirectedEdge(0,3);
//        graphWithLinkedList.addDirectedEdge(0,2);
//        graphWithLinkedList.addDirectedEdge(1,4);
//        graphWithLinkedList.addDirectedEdge(2,3);
//        graphWithLinkedList.addDirectedEdge(3,4);

//        graphWithLinkedList.printGraph();
//        graphWithLinkedList.bfs();

//        graphWithLinkedList.dfs();
//        graphWithLinkedList.topologicalSort();

        graphWithLinkedList.BFSForSSSPP(nodes.get(0));




    }
}

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ArrayList<WeightedNode> nodesList = new ArrayList<>();
        nodesList.add(new WeightedNode("A",0));
        nodesList.add(new WeightedNode("B",1));
        nodesList.add(new WeightedNode("C",2));
        nodesList.add(new WeightedNode("D",3));
        nodesList.add(new WeightedNode("E",4));
        nodesList.add(new WeightedNode("F",5));
        nodesList.add(new WeightedNode("G",6));

        WeightedGraph newWeightedGraph = new WeightedGraph(nodesList);
        newWeightedGraph.addWeightedEdge(0,1,2);
        newWeightedGraph.addWeightedEdge(0,2,5);
        newWeightedGraph.addWeightedEdge(1,2,6);
        newWeightedGraph.addWeightedEdge(1,3,1);
        newWeightedGraph.addWeightedEdge(1,4,3);
        newWeightedGraph.addWeightedEdge(2,5,8);
        newWeightedGraph.addWeightedEdge(2,4,4);
        newWeightedGraph.addWeightedEdge(4,6,9);
        newWeightedGraph.addWeightedEdge(5,6,7);

        System.out.println("Printing bellmanford from source: A");
        newWeightedGraph.bellmanFord(nodesList.get(0));



    }

}
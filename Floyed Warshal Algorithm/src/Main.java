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

        WeightedGraph newWeightedGraph = new WeightedGraph(nodesList);
        newWeightedGraph.addWeightedEdge(0,3,1);
        newWeightedGraph.addWeightedEdge(0,1,8);
        newWeightedGraph.addWeightedEdge(1,2,1);
        newWeightedGraph.addWeightedEdge(2,0,4);
        newWeightedGraph.addWeightedEdge(3,1,2);
        newWeightedGraph.addWeightedEdge(3,2,9);

        newWeightedGraph.floydWarshal();



    }

}
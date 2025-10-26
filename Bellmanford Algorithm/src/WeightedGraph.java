import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {

    public ArrayList<WeightedNode> nodesList = new ArrayList<>();

    public WeightedGraph(ArrayList<WeightedNode> nodesList){
        this.nodesList = nodesList;
    }


    public void addWeightedEdge(int i,int j,int d){
        WeightedNode first = nodesList.get(i);
        WeightedNode second = nodesList.get(j);
        first.neighbours.add(second);
        first.weightMap.put(second,d);
    }

    public void bellmanFord(WeightedNode sourceNode){
        sourceNode.distance = 0;
        for(int i=0;i<nodesList.size();i++){
            for(WeightedNode currentNode:nodesList){
                for(WeightedNode neighbour:currentNode.neighbours){
                    if(neighbour.distance > currentNode.distance+currentNode.weightMap.get(neighbour)){
                        neighbour.distance = neighbour.distance + currentNode.weightMap.get(neighbour);
                        neighbour.parent = currentNode;
                    }
                }
            }
        }

        System.out.println("Checking for negative cycle...");
        for(WeightedNode currentNode:nodesList){
            for(WeightedNode neighbour:currentNode.neighbours){
                if(neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)){
                    System.out.println("Negative cycle found");
                    System.out.println("Vertex name: "+neighbour.name);
                    System.out.println("Old cost: "+neighbour.distance);
                    int newDistance = currentNode.distance + currentNode.weightMap.get(neighbour);
                    System.out.println("New cost: "+newDistance);
                    return;
                }
            }
        }

        System.out.println("No negative cycle found");

        for(WeightedNode nodeToCheck : nodesList){
            System.out.print("Node "+nodeToCheck+", distance "+nodeToCheck.distance+", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();

        }
    }


    public static void pathPrint(WeightedNode node){
        if(node.parent != null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }
}



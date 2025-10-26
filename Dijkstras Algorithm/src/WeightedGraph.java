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

    public void dijkstra(WeightedNode node){
        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        node.distance = 0;
        queue.addAll(nodesList);
        while(!queue.isEmpty()){
            WeightedNode currentNode = queue.remove();
            for(WeightedNode neighbour : currentNode.neighbours){
                if(queue.contains(neighbour)){
                    if(neighbour.distance > currentNode.distance + currentNode.weightMap.get(neighbour)){
                        neighbour.distance = (currentNode.distance + currentNode.weightMap.get(neighbour));
                        neighbour.parent = currentNode;
                        queue.remove(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }

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



import java.util.ArrayList;

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

    public void floydWarshal(){
        int size = nodesList.size();
        int[][] V = new int[size][size];
        for(int i=0; i<size; i++){
            WeightedNode first = nodesList.get(i);
            for(int j=0; j<size; j++){
                WeightedNode second = nodesList.get(j);
                if(i==j){
                    V[i][j] = 0;
                } else if(first.weightMap.containsKey(second)){
                    V[i][j] = first.weightMap.get(second);
                }
                else{
                    V[i][j] = Integer.MAX_VALUE/10;
                }
            }
        }

        for(int k=0; k<nodesList.size(); k++){
            for(int i=0; i<nodesList.size(); i++){
                for(int j=0; j<nodesList.size(); j++){
                    if(V[i][j] > V[i][k] + V[k][j]){
                        V[i][j] = V[i][k] + V[k][j];
                    }
                }
            }
        }

        for(int i=0; i<size; i++){
            System.out.print("Printing distance list for node "+nodesList.get(i)+":");
            for(int j=0; j<size; j++){
                System.out.print(V[i][j]+" ");
            }
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



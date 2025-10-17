import java.util.ArrayList;
import java.util.LinkedList;

public class GraphWithLinkedList {

    ArrayList<GraphNodeWithLinkedList> nodeList = new ArrayList<>();

    public GraphWithLinkedList(ArrayList<GraphNodeWithLinkedList> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i,int j){
        GraphNodeWithLinkedList first = nodeList.get(i);
        GraphNodeWithLinkedList second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    public void printGraph(){
      StringBuilder s = new StringBuilder();
      for(int i=0; i<nodeList.size();i++){
          s.append(nodeList.get(i).name+": ");
          for(int j=0; j<nodeList.get(i).neighbors.size();j++){
              if(j == nodeList.get(i).neighbors.size()-1){
                  s.append((nodeList.get(i).neighbors.get(j).name));
              }
              else{
                  s.append((nodeList.get(i).neighbors.get(j).name)+ " -> ");
              }
          }
          s.append("\n");
      }

      System.out.println(s.toString());
    }














}

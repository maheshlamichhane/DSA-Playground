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


    public void bfsVisit(GraphNodeWithLinkedList node){
        LinkedList<GraphNodeWithLinkedList> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNodeWithLinkedList currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.println(currentNode.name);
            for(GraphNodeWithLinkedList neighbor : currentNode.neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }

        }


    }

    public  void bfs(){
        for(GraphNodeWithLinkedList nodee : nodeList){
            if(!nodee.isVisited){
                bfsVisit(nodee);
            }
        }
    }

    // Time Complexity For Breadth First Traversal O(V+E),Space Complexity O(V+E)


}

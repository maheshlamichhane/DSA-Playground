import java.util.ArrayList;

public class GraphNodeWithLinkedList {

    public String name;
    public int index;
    public boolean isVisited;
    public GraphNodeWithLinkedList parent;

    public ArrayList<GraphNodeWithLinkedList> neighbors =  new ArrayList<>();
    public GraphNodeWithLinkedList(String name, int index) {
        this.name = name;
        this.index = index;
        isVisited = false;
    }
}

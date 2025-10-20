public class GraphNodeWithArray {



    public String value;
    public int index;
    public boolean isVisited;
    public GraphNodeWithArray parent;

    public GraphNodeWithArray(String value, int index) {
        this.value = value;
        this.index = index;
        isVisited = false;
    }
}

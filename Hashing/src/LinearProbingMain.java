public class LinearProbingMain {
    public static void main(String[] args) {

        LinearProbing probing = new LinearProbing(3);
        probing.insertInHashTable("mahesh");
        probing.insertInHashTable("nabin");
        probing.insertInHashTable("akash");
        probing.insertInHashTable("kamal");
        probing.insertInHashTable("kamal");
        probing.insertInHashTable("kamal");

        probing.displayHashTable();
        probing.deleteKeyHashTable("kamal");
        probing.displayHashTable();
        probing.searchHashTable("mahesh");
    }
}
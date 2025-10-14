public class QuadraticProbingMain {
    public static void main(String[] args) {

        QuardraticProbing probing = new QuardraticProbing(5);
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
public class DirectChainingMain {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(15);
        directChaining.insertHashTable("Quick");
        directChaining.insertHashTable("Brown");
        directChaining.insertHashTable("Red");
        directChaining.insertHashTable("Green");
        directChaining.insertHashTable("Blue");
        directChaining.insertHashTable("Yellow");
        directChaining.displayHashTable();
        directChaining.searchHashTable("Quick");
        directChaining.searchHashTable("djsfkdj");
        directChaining.deleteKeyHashTable("Green");
        directChaining.displayHashTable();
        directChaining.deleteKeyHashTable("Blue");
        directChaining.displayHashTable();
    }
}

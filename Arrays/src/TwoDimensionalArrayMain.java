public class TwoDimensionalArrayMain {

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(4,4);
        twoDimensionalArray.insert(10,4,4);
        twoDimensionalArray.search(10);
        twoDimensionalArray.delete(3,3);
        twoDimensionalArray.traverse();
    }
}

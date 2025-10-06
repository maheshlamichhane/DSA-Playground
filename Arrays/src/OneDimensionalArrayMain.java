//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class OneDimensionalArrayMain {
    public static void main(String[] args) {
        OneDimensionalArray array = new OneDimensionalArray(5);
        array.insert(10,3);
        array.delete(3);
        array.search(10);
        array.traverse();
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StackWithArrayMain {
    public static void main(String[] args) {

        StackWithArray stack = new StackWithArray();
        stack.create(2);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.deleteStack();
        stack.pop();


    }
}
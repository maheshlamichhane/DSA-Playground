import java.util.Arrays;

public class QuestionSix {

	public static void main(String[] args) {
		QuestionSix six = new QuestionSix();
		int[] array = { 1, 2, 3, 4, 5 };
		six.reverseArray(array);
		System.out.print(Arrays.toString(array));

        // Time Complexity O(n)

	}

	public void reverseArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int other = array.length - i - 1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}

	}

}

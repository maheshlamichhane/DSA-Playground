public class QuestionTwo {

	public static void main(String[] args) {
		
		QuestionTwo two = new QuestionTwo();
		int[] array = {1,2,3};;
		two.printPair(array);

        // Time Complexity O(N2)
		

	}
	
	public void printPair(int[] array) {
		for(int i=0; i<array.length;i++) {
			for(int j=0; j<array.length;j++) {
				System.out.println(array[i]+","+array[j]);
			}
		}
	}

}

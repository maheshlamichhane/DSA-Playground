public class QuestionThree {

	public static void main(String[] args) {
		
		QuestionThree three = new QuestionThree();
		int[] array = {1,2,3};
		three.printPair(array);

        // Time complexity O(N2)

	}
	
	public void printPair(int[] array) {
		for(int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length;j++) {
				System.out.println(array[i]+","+array[j]);
			}
		}
	}

}

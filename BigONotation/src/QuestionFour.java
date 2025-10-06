public class QuestionFour {
	
public static void main(String[] args) {
		
		QuestionFour three = new QuestionFour();
		int[] array1 = {1,2,3};
		int[] array2 = {4,5,6,0};
		three.printPair(array1,array2);

        // Time complexity O(ab)

	}
	
	public void printPair(int[] array1,int[] array2) {
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array2.length;j++) {
				if(array1[i]<array2[j]) {
					System.out.println(array1[i]+","+array2[j]);
				}
				
			}
		}
	}
	
}

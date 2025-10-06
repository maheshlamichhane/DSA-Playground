public class QuestionOne {

	public static void main(String[] args) {
		
		QuestionOne one = new QuestionOne();
		int[] array = {1,2,3,4,5};
		one.calculateSumAndProduct(array);
        // Time complexity O(n)
		
	}
	
	public void calculateSumAndProduct(int[] array) {
		int sum = 0;
		int product = 1;
		for(int i=0; i<array.length;i++) {
			sum=sum+array[i];
		}
		for(int i=0;i<array.length;i++) {
			product = product*array[i];
		}
		System.out.println("Sum="+sum+" and product="+product);
	}

}

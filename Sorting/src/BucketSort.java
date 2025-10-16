import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {

    public int[] array;

    public BucketSort(int[] array) {
        this.array = array;
    }

    public void bucketSort(){
        int noOfBuckets = (int) Math.ceil(Math.sqrt(array.length));
        int maxValue = Integer.MIN_VALUE;
        for(int value : array){
            if(value > maxValue){
                maxValue = value;
            }
        }
        ArrayList<Integer>[]  buckets = new ArrayList[noOfBuckets];
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int value : array){
            int bucketNumber = (int) Math.ceil(((float) value * noOfBuckets)/(float)maxValue);
            buckets[bucketNumber-1].add(value);
        }

        System.out.println("\n\n Printing buckets before sorting...");
        System.out.println(Arrays.toString(buckets));

        for(ArrayList<Integer> bucket : buckets){
            Collections.sort(bucket);
        }

        System.out.println("\n\n Printing bucket after sorting...");
        System.out.println(Arrays.toString(buckets));

        int index = 0;
        for(ArrayList<Integer> bucket : buckets){
            for(int value : bucket){
                array[index] = value;
                index++;
            }
        }

    }


    public void printArray(){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    // Time Complexity O(NLogN),Space Complexity O(n)


}

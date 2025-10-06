public class UniqueArrayMain {

    public static void main(String[] args) {
        int[] array = {1,3,5,8,1};
        System.out.println("Is Array Unique="+isArrayUnique(array));
    }

    private static boolean isArrayUnique(int[] arr){
        boolean isUnique = true;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    isUnique = false;
                    return isUnique;
                }
            }
        }
        return isUnique;
    }
}

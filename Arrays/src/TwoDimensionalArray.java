public class TwoDimensionalArray {

    private int[][] array;
    private int rows;
    private int columns;


    public TwoDimensionalArray(int rows,int columns){
        array = new int[rows][columns];
        this.rows = rows;
        this.columns = columns;

        // Time Complexity O(N2),Space Complexity O(N2)
    }

    public void traverse(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Time Complexity O(N2),Space Complexity O(1)
    }

    public void search(int value){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(array[i][j] == value){
                    System.out.println("Element found");
                    return;
                }
            }
        }
        System.out.println("Element not found");

        // Time Complexity O(N2), Space Complexity O(1)
    }


    public void insert(int value,int row,int columns){
        if (row < 1 || row > rows || columns < 1 || columns > this.columns) {
            System.out.println("Invalid index provided");
        }

        else{
            array[row-1][columns-1] = value;
        }

        // Time Complexity O(1), Space Complexity O(1)
    }

    public void delete(int row,int columns){
        if (row < 1 || row > rows || columns < 1 || columns > this.columns) {
            System.out.println("Invalid index provided");
        }
        else{
            array[row-1][columns-1] = Integer.MIN_VALUE;
        }

        // Time Complexity O(1),Space Complexity O(1)
    }
}

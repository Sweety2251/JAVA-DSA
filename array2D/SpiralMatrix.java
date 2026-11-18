package array2D;

public class SpiralMatrix {

    public static void printArr(int[][] arr) {
        for (int[] is : arr) {
            System.out.print(is+ " ");
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};           

            int startRow = 0;
            int endRow = arr.length-1;
            int startCol = 0;
            int endCol = arr[0].length-1;

            while(startRow <= endRow && startCol <= endCol){

                //top
                for(int j=startCol;j<endCol;j++){
                    System.out.print(arr[startRow][j]+" ");
                }
                //right
                for(int i=startRow;i<endRow;i++){
                    System.out.print(arr[i][endCol]+" ");
                }
                //bottom
                for(int j=endCol;j>startCol;j--){
                    System.out.print(arr[endRow][j]+" ");
                }
                //left
                for(int i=endRow;i>startRow;i--){
                    System.out.print(arr[i][startCol]+" ");
                }
                startRow++;
                startCol++;
                endRow--;
                endCol--;
            }
    }
}

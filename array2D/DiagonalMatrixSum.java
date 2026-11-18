package array2D;

public class DiagonalMatrixSum {

    public static int diagonalSum(int[][] matrix){
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            // sum of the primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            // matrix.length-1-i will give the value of j
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

            System.out.println(diagonalSum(matrix));
    }
}
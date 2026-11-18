package array2D;

public class NumOf7s {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 4, 7 },
                { 8, 8, 7, 9 },
                { 10, 14, 60, 22 } };

        int count= 0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] % 7 == 0){
                    count++;
                }
            }
        }
        System.out.println("7's of number: "+count);
    }
}

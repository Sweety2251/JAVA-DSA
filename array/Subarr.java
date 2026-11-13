package array;

// in this pronlem statement we will update the ending value becuase our ending index is updating on every iteration 

public class Subarr {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int str = 0;
        int end = 0;
         
        for(int i=0;i<arr.length-1;i++){
            str = i;
            for(int j=i;j<arr.length;j++){
                end = j;
                for(int k=str;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}

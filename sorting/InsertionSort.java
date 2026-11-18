package sorting;

public class InsertionSort {

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args) {
        
        int[] arr = {94,74,7,3,7,92,577};

        // this loop will select the element from the unsorted part of the array
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            // this will compare the element with the temp variable value to find the corrt position of the element
            for(int j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                } else{
                    break;
                }
            }
        }
        printArr(arr);
    }
}

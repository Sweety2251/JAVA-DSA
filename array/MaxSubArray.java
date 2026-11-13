package array;

public class MaxSubArray {

    public static int prefix(int[] arr){
        int max = 0;
        int curr = 0;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curr = i==0? prefix[j] : prefix[j]-prefix[i-1];
                if(max<curr){
                    max = curr;
                } 
                //curr =0;
            }
            
        }
            return max;
    }

    public static int bruetForce(int[] arr){
            int max = 0;
            int curr=0;


        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    curr += arr[k];
                }
                if(max<curr){
                    max = curr;
                } 
                curr =0;
            }
            
        }
            return max;
    }

    public static int kadanAlgo(int[] arr) {
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for(int i=0;i<arr.length;i++){
            curr += arr[i];
            if(curr < 0){
                curr = 0;
            }
            max = Math.max(max,curr);
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        System.out.println("max subarray is: " + kadanAlgo(arr));
    }
}

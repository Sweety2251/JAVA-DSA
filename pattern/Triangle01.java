package pattern;

public class Triangle01{


    // this logic repeat the conditional statement check again and again 
    // public static void main(String[] args) {
        
    //     int n= 5;
    //     int signl = 1;

    //     //loop 1
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             // update the signa; value to 0 or 1 according to the perivous value
    //             if(signl == 1){
    //                 System.out.print(signl+" ");
    //                 signl = 0;
    //             } else{
    //                 System.out.print(signl+" ");
    //                 signl = 1;
    //             }
    //         }
    //         System.out.println();
    //     }
    // }


// in this logic if we observe the 0-1 triangle then we get to know 1 is printed on the even place of the i+j and the rest of the place there is 0 this is also the one of the approach to doing this prob

    public static void main(String[] args) {
        int n = 5;

        //loop 1
        for(int i=1;i<=n;i++){
            // loop 2
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

}

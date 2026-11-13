package pattern;

// the main logic of this code is the n-i+1 because for i=1 we have to run inner loop 5 times and decrease its value by one n-i give the one decrease value every time so to balance it we add 1 in it 


public class InvertedHalfPyramidNumber {
    
    public static void main(String[] args) {
        
        int n=5;
        //loop 1
        for(int i=1;i<=n;i++){
            //loop 2
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

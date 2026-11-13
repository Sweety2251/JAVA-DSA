package pattern;

public class SolidRhombus {

    public static void main(String[] args) {
        
        int n = 5;

        // loop 1
        for(int i=1;i<=n;i++){
            // loop for spaces
            for(int j=1;j<=n-i;j++){
                System.err.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}
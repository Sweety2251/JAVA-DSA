package pattern;

public class Butterfly {
    
    public static void main(String[] args) {
        int n = 4;

        System.out.println("Butterfly pattern: ");
        // upper outer loop 
        for(int i=1;i<=n;i++){
            // uper left inner loop
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // uper right inner loop
            // loop for the space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            } 
            // loop for the stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower outer loop 
       for(int i=n;i>=1;i--){
         for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            // uper right inner loop
            // loop for the space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            } 
            // loop for the stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
       }
    }
}

package string;

public class ShortestPath {
    public static void main(String[] args) {
        String dir = "WNEENESENNN";
        int x = 0;
        int y = 0;

        for(int i=0;i<dir.length();i++){
            if(dir.charAt(i) == 'N'){
                // for north 
                y++;
            } else if(dir.charAt(i) == 'S'){
                // for south
                    y--;
                } else if(dir.charAt(i) == 'W'){
                    // for west
                    x--;
                } else if(dir.charAt(i) == 'E'){
                    // for east
                    x++;
                }
        }

        // cal the shortest distance
        int X2 = x*x;
        int Y2 = y*y;
        float dis = (float)Math.sqrt(X2 + Y2);

        System.out.println("The shortest distance is: "+ dis);
    }
}

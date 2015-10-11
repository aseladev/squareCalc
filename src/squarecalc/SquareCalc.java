package squarecalc;

import java.util.Scanner;

/**
 *
 * @author Asela
 */
public class SquareCalc {

    
    public static void main(String[] args) {
//        int x = 4;
        System.out.print("Please enter grid size: ");
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int sqCount = 0;
        
        while (x > 0){
            sqCount = (int) (sqCount + Math.pow(x, 2));
            x--;
//            System.out.println(x +"- "+sqCount);
        }
        System.out.println("Number of squares: "+sqCount);
    }
    
}

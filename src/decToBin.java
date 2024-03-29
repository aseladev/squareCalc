
import java.util.Scanner;

public class decToBin {

    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        number = in.nextInt();

        if (number < 0) {
            System.out.println("Error: Not a positive integer");
        } else {

            System.out.print("Convert to binary is: ");
            //System.out.print(binaryform(number));
            printBinaryform(number);
            System.out.println("");
        }
    }

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;   // KICK OUT OF THE RECURSION
        }

        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }

}

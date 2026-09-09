package CS240.HW1;
import java.util.Scanner;
/* 
 * This program takes a numarical input and converts it to binary, decimal, octal, and hexadecimal. 
 * Bryan Brady
 * 133696690
 * 9/6/2026
*/
public class hw1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter current base (2, 8, 10, 16): ");
        int base = input.nextInt();

        if (base == 2) {
            System.out.println("Binary: " + num);
            System.out.println("Decimal: " + Integer.parseInt(Integer.toString(num), 2));
            System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(Integer.toString(num), 2)));
            System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(Integer.toString(num), 2)));
        } else if (base == 8) {
            System.out.println("Binary: " + Integer.toBinaryString(Integer.parseInt(Integer.toString(num), 8)));
            System.out.println("Decimal: " + Integer.parseInt(Integer.toString(num), 8));
            System.out.println("Octal: " + num);
            System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(Integer.toString(num), 8)));
        } else if (base == 10) {
            System.out.println("Binary: " + Integer.toBinaryString(num));
            System.out.println("Decimal: " + num);
            System.out.println("Octal: " + Integer.toOctalString(num));
            System.out.println("Hexadecimal: " + Integer.toHexString(num));
        } else if (base == 16) {
            System.out.println("Decimal: " + Integer.parseInt(Integer.toString(num), 16));
            System.out.println("Binary: " + Integer.toBinaryString(Integer.parseInt(Integer.toString(num), 16)));
            System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(Integer.toString(num), 16)));
            System.out.println("Hexadecimal: " + num);
        } else {
            System.out.println("Invalid base.");
        }
        input.close();
    }
}

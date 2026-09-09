package CS240.HW1;
import java.util.Scanner;

class hw1{
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s = name.nextLine();

        for(char c : s.toCharArray()) {
            System.out.println((int) c);
        }
        name.close();
    }
}
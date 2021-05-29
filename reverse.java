import java.util.*;  // Import the Scanner class

public class reverse {
    public static void main(String args[]) {
       Scanner a = new Scanner(System.in);
       int num = a.nextInt();
       int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed Number: " + reversed);
}}
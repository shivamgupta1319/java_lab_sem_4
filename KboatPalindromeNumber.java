import java.util.Scanner;

public class KboatPalindromeNumber
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int copyNum = num;
        int revNum = 0;

        while(copyNum != 0) {
            int digit = copyNum % 10;
            copyNum /= 10;
            revNum = revNum * 10 + digit;
        }

        if (revNum == num) 
            System.out.println("A Palindrome number");
        else
            System.out.println("Not a Palindrome number");
    }
}
import java.util.*;  // Import the Scanner class

class userinput1 {
  public static void main(String[] args) {
    Scanner a = new Scanner(System.in);  // Create a Scanner object
    Scanner b = new Scanner(System.in);
    System.out.println("Enter number a and b :-");

    int x = a.nextInt();  // Read user input
    int y = b.nextInt();
    int sum = x + y;
    System.out.println("sum is: " + sum);  // Output user input
  }
}
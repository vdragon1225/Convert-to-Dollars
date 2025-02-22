// Import Scanner
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Declare Scanner
      Scanner scnr = new Scanner(System.in);

      // declare coin amount
      final double NICKEL_AMOUNT = 0.05; // Use "final" to make variables constants
      final double DIME_AMOUNT = 0.10;
      final double QUARTER_AMOUNT = 0.25;

      // variables to hold user amount
      int userNickels, userDimes, userQuarters;
      double dollar; // holds final amount of money

      // Get user input
      // Get number of nickels
      System.out.print("Enter number of nickels: ");
      userNickels = scnr.nextInt();

      // Get number of dimes
      System.out.print("Enter number of dimes: ");
      userDimes = scnr.nextInt();

      // Get number of quarters
      System.out.print("Enter number of quarters: ");
      userQuarters = scnr.nextInt();

      // Calculate the amount in dollars
      dollar = (NICKEL_AMOUNT * userNickels) + (DIME_AMOUNT * userDimes) + (QUARTER_AMOUNT * userQuarters);

      // Output with two digits after decimal point
      System.out.printf("Amount: $%.2f\n", dollar);

      // Close scanner
      scnr.close();
   }
}
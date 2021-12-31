/*************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck 5 10 15 2
 *
 *  @author: Aatif Sayed
 *  E-mail:  aatif.sayed@rutgers.edu
 *
 *  Program that takes four integer command-line arguments and prints true
 *  if the four integer inputs are in strictly ascending order or strictly
 *  descending order, false otherwise
 *
 *  % java OrderCheck 5 10 15 2
 *  false
 *
 *  % java OrderCheck 15 11 9 4
 *  true
 *************************************************************************/

public class OrderCheck {

    public static void main(String[] args) {

        /* Check that exactly 4 integer command-line arguments are provided; no more, no less.
           If not, display error message on console and terminate program. */
        if (args.length != 4) {
            System.out.println("USAGE ERROR: Program must have exactly 4 integer command-line argument inputs: [number_1] [number_2] [number_3] [number_4]");
            System.out.println("Terminating program...");
            return;
        }

        /* Input validation: check if any of the command-line arguments provided are not integers.
           If any non-integer input is found, display error message to console and terminate program. */
        for (int i = 0; i < 4; i++) {
            try { Integer.parseInt(args[i]); }
            catch (Exception _exception) {
                System.out.println("INPUT ERROR: Non-integer user input detected for number " + (i + 1));
                System.out.println("Terminating program...");
                return;
            }
        }
        
        // Parse user-given command-line arguments to Integer data type to be used for mathematical/logical comparisons.
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);

        // Check if numbers are in either strictly ascending or strictly descending order. Print result to console
        boolean strictlyAscendingOrDescending = ((num1 < num2) && (num2 < num3) && (num3 < num4)) || ((num1 > num2) && (num2 > num3) && (num3 > num4));
        System.out.println(strictlyAscendingOrDescending);

    }

}
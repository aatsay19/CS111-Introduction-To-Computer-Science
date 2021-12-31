/*************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill 35.0 10.0
 *
 *  @author: Aatif Sayed
 *  E-mail:  aatif.sayed@rutgers.edu
 *
 *  Program that takes two double command-line arguments, temperature 
 *  (in Farenheit) and velocity (in mph), and prints the wind chill 
 *  (a double) according to the following formula:
 *
 *  w = 35.74 + 0.6215*T + (0.4275*T - 35.75) * v^0.16
 *
 *  % java WindChill 35.0 10.0
 *  Wind Chill: 27.445 degrees Farenheit
 *
 *  The formula is not valid if T is larger than 50 in absolute value or if 
 *  v is larger than 120 or less than 3.
 *************************************************************************/

public class WindChill {

    public static void main(String[] args) {

        double temperature = 0.0, velocity = 0.0;

        /* Check that exactly 2 numerical command-line arguments are provided; no more, no less.
           If not, display error message on console and terminate program. */
        if (args.length != 2) {
            System.out.println("USAGE ERROR: Program must have exactly 2 numerical command-line argument inputs: [temperature] [velocity]");
            System.out.println("Terminating program...");
            return;
        }

        /* Parse user-given command-line arguments to Double data type to be used later for wind chill calculation.
           Handle non-numeric inputs by displaying error message to console and terminating program (input validation). */
        try { temperature = Double.parseDouble(args[0]); }
        catch (Exception _exception) {
            System.out.println("INPUT ERROR: Non-numeric temperature detected");
            System.out.println("Terminating program...");
            return;
        }
        try { velocity = Double.parseDouble(args[1]); }
        catch (Exception _exception) {
            System.out.println("INPUT ERROR: Non-numeric velocity detected");
            System.out.println("Terminating program...");
            return;
        }

        /* Check if wind chill formula becomes invalid due to temperature or velocity being out of acceptable range.
           Remember that the formula is not valid if T is larger than 50 in absolute value or if v is larger than 120 or less than 3.
           If formula becomes invalid, display error message on console and terminate program. */ 
        if (Math.abs(temperature) > 50 || velocity > 120 || velocity < 3) {
            System.out.println("RANGE ERROR: Temperature must be between -50 and 50 degrees Farenheit and velocity must be between 3 and 120 mph");
            System.out.println("Terminating program...");
            return;
        }

    	double windChill = (35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(velocity, 0.16));
        System.out.println("Wind Chill: " + String.format("%.3f", windChill) + " degrees Farenheit");

    }

}

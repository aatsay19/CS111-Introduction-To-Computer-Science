/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @author: Aatif Sayed
 *  E-mail:  aatif.sayed@rutgers.edu
 *
 *  This program takes three command-line arguments, , computes and displays the price a
 *  person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *
 *************************************************************************/

public class Gas {

    public static void main(String[] args) {

    	double pricePerGallon = Double.parseDouble(args[0]);
    	double numGallons = Double.parseDouble(args[1]);
    	boolean cashOrCredit = Boolean.parseBoolean(args[2]);
    	// If cashOrCredit is true, the user will pay by cash and if false then by credit.

    	if (pricePerGallon <= 0 || numGallons <= 0) {
    		System.out.println("Illegal input");
    		return;
    	}

    	double totalPrice = pricePerGallon * numGallons;

    	if (cashOrCredit == false) {
    		totalPrice = totalPrice * 1.1;
    	}

    	System.out.println(totalPrice);

    }

}
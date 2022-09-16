/*
* This program takes a log length and
* calculates how many can fit in a truck
* with a capacity of 1100kg.
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-09-15
*/

import java.util.Scanner;

/**
* This is a log length to weight in a truck program.
*/

final class LogCalculation {

    /**
     * Constant assigned to 55.
     */
    public static final float FIFTY_FIVE = 55;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private LogCalculation() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // input
        final Scanner logObject = new Scanner(System.in);
        System.out.println("How long are your logs (m)?");
        // process
        final float logLength = logObject.nextFloat();
        final float truckCapacity = FIFTY_FIVE / logLength;
        // output
        System.out.printf("You can fit " + truckCapacity
                           + " logs in a 1100kg capacity truck.");

        System.out.println("\nDone.");
    }
}

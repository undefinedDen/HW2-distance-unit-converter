package app;

import java.util.Scanner;

public class Main {
    private static final double ONE_MILL_INTO_KILOMETERS = 1.609344;
    static double ml;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello! It is a distance unit converter.\nVersion 1.0 \nI can convert only mills into kilometers");
         ml = getInput("mills: ");
         getOutput("Mills", "Kilometers", convertMillsToKilometers());
    }

    private static double convertMillsToKilometers() {
        return ml * ONE_MILL_INTO_KILOMETERS;
    }

    private static double getInput(String measurementDistanceUnit) {
        System.out.print("Input " + measurementDistanceUnit);
        return  scanner.nextDouble();

    }
    private static void getOutput(String convertingFrom, String convertingTo, double result){
        System.out.printf("Result of converting from %s to %s is : %.2f %s",convertingFrom,convertingTo, result, convertingTo);
    }
}

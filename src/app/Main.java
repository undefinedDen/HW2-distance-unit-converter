package app;

import java.util.Scanner;

public class Main {
    private static final double ONE_MILL_INTO_KILOMETERS = 1.609344;
    private static  final String FINISH_MSG = "Thank`s for using!";
    static double ml;
    static double km;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("""
                Hello! It is a distance unit converter.
                Version 2.0
                I can convert  mills into kilometers and kilometers into mills
                
                Choose option:
                1 - convert mills to kilometers
                2 - convert kilometers to mills
                3 - exit
                """);
        int choice = 0;
        try {
            System.out.print("Input number of operation: ");
             choice = Integer.parseInt(scanner.nextLine().trim());

            switch (choice) {
                case 1 -> {
                    ml = getInput("mills: ");
                    getOutput("Mills", "Kilometers", convertMillsToKilometers());
                }
                case 2 -> {
                    km = getInput("kilometers: ");
                    getOutput("Kilometers", "Mills", convertKilometersToMills());
                }
                case 3 -> System.out.println(FINISH_MSG);
                default -> throw new IllegalStateException();
            }
        } catch (IllegalStateException e) {
            System.out.println("Unexpected value: " + choice);
        } catch (Exception e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

       
    }

    private static double convertMillsToKilometers() {
        return ml * ONE_MILL_INTO_KILOMETERS;
    }

    private static double convertKilometersToMills() {
        return km / ONE_MILL_INTO_KILOMETERS;
    }

    private static double getInput(String measurementDistanceUnit) {
        System.out.print("Input " + measurementDistanceUnit);
        return scanner.nextDouble();

    }

    private static void getOutput(String convertingFrom, String convertingTo, double result) {
        System.out.printf("Result of converting from %s to %s is: %.2f %s\n", convertingFrom, convertingTo, result, convertingTo);
    }
}

package se.lexicon;

import java.util.Scanner;

public class UnitConverter {

    public static double convert(double km) {
        return km * 0.621371; // km to miles
    }

    public static double convert(double kg, String unit) {
        if (unit.equalsIgnoreCase("lbs")) {
            return kg * 2.20462; // kg to pounds
        }
        return kg;
    }

    public static double convert(double celsius, boolean toFahrenheit) {
        if (toFahrenheit) {
            return (celsius * 9 / 5) + 32; // Celsius to Fahrenheit
        } else {
            return celsius + 273.15; // Celsius to Kelvin
        }
    }

    public static void printUnitConverter(){
        Scanner scanner = new Scanner(System.in);

        IO.println("Choose conversion:\n" + "1. km → miles\n" + "2. kg → lbs\n" + "3. °C → °F / K\n" + "Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                IO.println("Enter value in km: ");
                double km = scanner.nextDouble();
                System.out.printf("%.1f km = %.2f miles%n", km, UnitConverter.convert(km));
                break;

            case 2:
                IO.println("Enter value in kg: ");
                double kg = scanner.nextDouble();
                System.out.printf("%.1f kg = %.2f lbs%n", kg, UnitConverter.convert(kg, "lbs"));
                break;

            case 3:
                IO.println("Enter value in Celsius: ");
                double celsius = scanner.nextDouble();
                IO.println("Convert to Fahrenheit? (true/false): ");
                boolean toFahrenheit = scanner.nextBoolean();
                double result = UnitConverter.convert(celsius, toFahrenheit);

                if (toFahrenheit) {
                    System.out.printf("%.1f °C = %.2f °F%n", celsius, result);
                } else {
                    System.out.printf("%.1f °C = %.2f K%n", celsius, result);
                }
                break;

            default:
                IO.println("Invalid choice.");
        }

    }
}

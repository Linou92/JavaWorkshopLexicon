package se.lexicon;

import java.util.Scanner;

public class TemperatureConverter {
    public static void printTemperatureConverter() {
        Scanner scanner = new Scanner(System.in);

        IO.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5 + 32);
        double kelvin = celsius + 273.15;
        IO.println("Celsius : " + celsius + " °C\n"+
                "Fahrenheit : " + fahrenheit + " °F\n"+
                "Kelvin : " + kelvin + " K");
    }
}

package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number");
        a = scanner.nextInt();
        System.out.println("Insert second number");
        b = scanner.nextInt();
        System.out.println("Insert third number");
        c = scanner.nextInt();



        farenheitToCelsius(80);
        farenheitToCelsius(100);

        celsiusToFarenheit(25);
        minMax(a, b,c );

    }
    public static void farenheitToCelsius(int farenheit) {

        double celsius = (farenheit - 32) / 1.8;
        System.out.println(farenheit+ "farenheit ----> " +  celsius + "Celsius");
}

    public static void celsiusToFarenheit(int celsius) {
        double fahrenheit = 1.8 * celsius + 32;
        System.out.println(celsius + "C = " + fahrenheit + "F");
    }


public static void minMax (int a, int b, int c) {
    int min, max;
    if (a >=  b && a >= c) {
        max = a;
    } else if (b >= a && b >= c) {
        max = b;
    } else {
        max = c;
    }

    if (a <=  b && a <= c) {
        min = a;
    } else if (b <= a && b <= c) {
        min = b;
    } else {
        min = c;

    }


    System.out.println("Min value: " + min);
    System.out.println("Max value: " + max);
}

}
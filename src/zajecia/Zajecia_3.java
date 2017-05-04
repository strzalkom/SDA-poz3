<<<<<<< HEAD:src/zajecia/Zajecia3.java
package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia3 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        int c = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your weight");
        a = scanner.nextDouble();
        System.out.println("Insert your height [meters]");
        b = scanner.nextDouble();


        //System.out.println("Insert third number");
      //  c = scanner.nextInt();


        //farenheitToCelsius(80);
        //farenheitToCelsius(100);

        //celsiusToFarenheit(25);
        //minMax(a, b,c );
        bmi(a,b);
    }
     public static void bmi(double weight, double height) {
         double bmi = ((weight) / (height * height));

         System.out.println("Twoje bmi to: " + bmi);

         if (bmi < 18.5) {

             System.out.println("PRZYTYJ!");
         } else if (bmi >= 18.5 && bmi <= 24.9) {

             System.out.println("jest OK!");
         } else if (bmi > 24.9)   {

             System.out.println("ZA GRUBO!");
         }
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
=======
package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia_3 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        int c = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your weight");
        a = scanner.nextDouble();
        System.out.println("Insert your height [meters]");
        b = scanner.nextDouble();


        //System.out.println("Insert third number");
      //  c = scanner.nextInt();


        //farenheitToCelsius(80);
        //farenheitToCelsius(100);

        //celsiusToFarenheit(25);
        //minMax(a, b,c );
        bmi(a,b);
    }
     public static void bmi(double weight, double height) {
         double bmi = ((weight) / (height * height));

         System.out.println("Twoje bmi to: " + bmi);

         if (bmi < 18.5) {

             System.out.println("PRZYTYJ!");
         } else if (bmi >= 18.5 && bmi <= 24.9) {

             System.out.println("jest OK!");
         } else if (bmi > 24.9)   {

             System.out.println("ZA GRUBO!");
         }
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
>>>>>>> origin/master:src/zajecia/Zajecia_3.java

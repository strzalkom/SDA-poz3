import java.util.Scanner;

/**
 * Created by RENT on 2017-04-07.
 */
public class Zajecia_4 {
    public static void main(String[] args) {
        //  Scanner scanner = new Scanner(System.in);
        //  System.out.println("Insert day: ");
        //  int day = scanner.nextInt();
        // System.out.println("Insert month");
        // int month = scanner.nextInt();
        //System.out.println("Insert year");
        // int year = scanner.nextInt();
        // displayDate(day,month,year);

        int[] array = {0, 1, 2, 3, 4, -5, -6, 7, 8, 9, 12, 15, 543, -1293};
        //int minValue = minFromArray(array);
        //int maxValue = maxFromArray(array);
        double avg = avg(array);

        int sum = sum(array);

        double abs = abs(-8);

        double span = span(array);
       // statistic(array);
       // revers(array);
        //getArrayFromUser();
        PublicArray(getArrayFromUser());

    }

    public static void statistic(int[] array) {
        System.out.println("Min from array " + minFromArray(array));
        System.out.println("Max from array " + maxFromArray(array));
        System.out.println("Sum " + sum(array));
        System.out.println("Avg " + avg(array));
        System.out.println("Span of array " + span(array));

    }

    public static void revers(int[] array) {
        System.out.print("[ ");
        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.print(" ]");

    }

    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int  i = 0; i < size ; i++) {
            System.out.println("Insert next number. " );
            array[i] = scanner.nextInt();;

        }
         return array;
    }
    public static void PublicArray(int [] array){

       for( int i = 0; i < array.length; i++)
           System.out.print(array[i] + ", ");
    }





    public static int abs(int number) {
        if (number < 0) {
            number *= -1;

        }
    return number;
    }

    public static int span(int[] array) {
     int min = minFromArray(array);
        int max = maxFromArray(array);
        int result = max - min;
        return abs(result);
 }





    public static int sum(int[] array) {


        int sum = 0;
        for (int i = 0 ; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }


    public static double avg(int[] array) {
        int sum = sum(array);
        return (double) sum / array.length;

    }



    public static int minFromArray(int[] array) {
       int min= array[0];
       for(int i = 1; i < array.length; i++) {

           if (array[i] < min) {
               min = array[i];
           }
       }
              return min;



   }
    public static int maxFromArray(int[] array) {
       int max = array[0];
        for(int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];

            }
        }
               return max;

        }



    public static void displayDate (int day, int month, int year) {
        if (day <=31 && day>=1 && month <=12 && month>=1 && year <=9999 && year >=0) {
            System.out.println(" Today is " + day +" day " + month + " month " + year + " year ");
        }else {System.out.println("Invalid date");


    }
}
}

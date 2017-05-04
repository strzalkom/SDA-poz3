package zajecia;

import java.util.Scanner;

/**
 * Created by mateuszstanislaw on 11.04.2017.
 */
public class Poprawka_zajecia4 {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6,7,8,9};
        displayArray(array);
        displayReversed(array);
        int[] arrayFromUser = getArrayFormUser();
        displayReversed(arrayFromUser);

    }
    public static void displayArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if( i !=array.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
   public static int[] reverseArray(int[] array) {
         int[] newArray = new int[array.length];
         for (int i = 0; i < array.length; i++) {
             newArray[array.length - i -1] = array[i];

         }
         return newArray;

    }
   public static void displayReversed(int[] array) {
        displayArray(reverseArray(array));
   }
   public static void statistics(int[] array) {
       System.out.println("Min value: " + minFromArray(array));
       System.out.println("Max value: " + maxFromArray(array));
       System.out.println("Sum: " + sum(array));
       System.out.println("Avg: " + avg(array));
       System.out.println("Span: "+ span(array));
       System.out.print("Reversed: ");
   }
   public static int[] getArrayFormUser() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Insert number of elements: ");
       int size = scanner.nextInt();
       int[] array = new int[size];
       for (int i = 0; i < array.length; i++) {
           System.out.println("Insert next number");
           array[i] = scanner.nextInt();
       }
   return array;
    }
   public static int minFromArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
            min = array[i];
           }
        }
           return min;

   }
   public static int maxFromArray(int[] array) {
            int max = array[0];
            for (int i=1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
                return max;
            }
    public static int sum(int[] array) {
                int sum = 0;
                for (int i = 0; i < array.length; i++){
                    sum += array[i];

                }
                return sum;
            }
    public static double avg(int[] array) {
                int sum = sum(array);
                return (double)sum / array.length;
    }

     public static int span(int[] array) {
                int min = minFromArray(array);
                int max = maxFromArray(array);
                int result = max - min;
                return abs(result);


     }
      public static int abs(int number) {
                if (number < 0 ){
                    number *= -1;

                }
                return number;
            }



        }






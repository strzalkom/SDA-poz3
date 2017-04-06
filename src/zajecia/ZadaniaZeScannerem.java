package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class ZadaniaZeScannerem {

    public static void main(String[] args) {
       // max();
      //  isEven();
       // sumOddElements();
        //displayEvenElements();
       // countEvenElements();
      //  addPreviousElement();
       // incrementElements();
       // multiplyBy2();
       // fillArrayWithKnownSize();
       // fillArrayWithUnknownSize();
        addElementsMultipliedBy();
    }
    public static void addElementsMultipliedBy() {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0 ; i < array.length; i++) {
            System.out.println("Insert next number: ");
            int element = scanner.nextInt();
            if (i == 0) {
                array[i] = element;
            } else {
                array[i] = array[i-1] * element;

            }
        }
        int sum = 0;
        for (int i= 0 ; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println(sum / (double)array.length);


    }



    public static void fillArrayWithUnknownSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int[] array = new int[100];
        int element = 1;
        int i = 0;
        while (element != 0) {
            System.out.println("Insert next number. Press 0 to break.");
            element = scanner.nextInt();
            array[i] = element;
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(array[j]);
        }

    }



    public static void fillArrayWithKnownSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Insert next number: |");
            int number = scanner.nextInt();
            array[i] = number;
        }
    }




    public static void multiplyBy2() {
        int[] array = {2, 3, -4, -5, 6, 7, -8, -9, 12, 31};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 && array[i] > 0) {
                array[i] *= 2; //e = e * 2
            }
        }

    }



    public static void addPreviousElement() {
        int[] array = {2,-3,4,5,6,7,-9,11};
    for (int i = 1; i < array.length; i++) {
        array[i] +=  array[ i - 1]; }

        for (int i = 0 ; i <array.length; i++) {
            System.out.println(array[i]);



        }

    }





    public static void incrementElements() {
        int[] array = {-2, -3, -4, 5, 2, 3, -6, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i]++;

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void countEvenElements() {
    int[] array = {2,3,4,5,6,7,8,9,11};
    int counter = 0;
    for (int i = 0; i < array.length; i++){
        if (array[i] % 2 == 0) {
            counter++;

        }
    }
}


    public static void sumOddElements() {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 12, 13};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){  //to samo co ==1
                sum += array[i];
            }


        }

    }

     public static void isEven(){
        Scanner scanner = new Scanner(System.in);
         int number = scanner. nextInt();
         System.out.println("Insert your number");
         if (number % 2 == 0 ) {
             System.out.println("Your number is even");
         }else {
             System.out.println("Your number is not even");

         }
     }

    public static void displayEvenElements() {    //co drugi element
        int[] array = {2,3,4,5,6,7,9,11,13};
       // Scanner scanner = scanner.next.Int();
        //int number = scanner.nextInt();
        //int number = scacnner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)  {
                System.out.println(array[i]);

            }
        }
    }



    public static void max() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Insert first number: ");
        int number2 = scanner.nextInt();
        System.out.println("Insert second number: ");

        if (number > number2) {
            System.out.println("First number is bigger");
        } else if (number == number2) {
            System.out.println("Number are equal");
        } else
            System.out.println("Second number is bigger");
    }
}






package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class Hello_World {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(5);
        int number = 7;
        int secondNumber = 3;
        System.out.println(number + secondNumber);

        if (number > 3) {
            System.out.println("Number bigger than 3");
        } else {
            System.out.println("Number less than 3");
        }
      //  arrayTest();
      //  checkAge();
      //  isNumberEven();
      //  displayEvenNumbers();
      //  greaterThan0();
      //  checkBigger();
     //   listEvenGreaterThan0();
       // sumOfElements();
     //   sumOfEven();
     //   sumOfPositive();
       // sumOfEvenGreaterThan0();
        sumOf();
      //   avg();
     //  avgMultipliedBy();
       // int number1 = 5;
       // double number2 = 3;
       // System.out.println(number1 / (double)number2);

       // Scanner scanner = new Scanner(System.in);
        //String name= scanner.nextLine();
        //System.out.println("Your name is: " + name);
        //int number3 = scanner.nextInt();
        //System.out.println("Your number is: " + number3);

    }
    public static void avgMultipliedBy(){
        int[] array = {1, 2, 3, 4 ,5, 6, 7, 8, 9, 0};
        int sum = 0;
        for ( int i = 1; i < array.length; i++) {
            sum += array[i]*i;}
            System.out.println(sum / (double) array.length);

    }


    public static void sumOf() {
        Scanner scanner = new Scanner(System.in);

        int number = 5;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; {
            System.out.println("Insert your number: ");
            int number4 = scanner.nextInt();
            int sum = 0;
            for (int i= 1; i < number4; i++) {
               sum += i;}
                System.out.println("Sum Of: " + sum);
           }
    }


    public static void avg(int[] array) {

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        System.out.println("Avg: " + (sum/(double)array.length));

        }


    public static void sumOfEvenGreaterThan0() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, -5, -4};
        int sum = 0;
        for (int i = 0; i <array.length; i++) {
            if (array[i] > 0 && array[i] % 2 ==0)  {
                sum += array[i];

            }
        }
        System.out.println("Sum of Even Greater Than 0: " + sum);
    }



    public static void sumOfPositive() {
        int[] array = {1, -2, 4, 6, 7, 8, 9, 0, -6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];

            }
        }
        System.out.println("Sum of Positive: " + sum);
    }

    public static void sumOfEven() { //suma parzystych
        int[] array = {5, 6, 8, 9, 0, 6};
    int sum= 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    sum += array[i];
                }
            }
        System.out.println("Sum of even: " + sum);

    }



    public static void sumOfElements() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int sum= 0;
                for (int i = 0; i < array.length; i++) {
                    sum += array[i];
                }
        System.out.println("sum: " + sum);


    }


     public static void displayEvenNumbers() {
         int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
         System.out.println(array.length);
         for (int i=0; i < array.length; i++)
             if(array[i] % 2==0){
             System.out.println(array[i]);
     }

      //  int[] array = {1, 2, 3, 4, 5, 6, 7};
       // System.out.println(array.length);
     //   for (int i = 0; i < array.length; i++) { //i++ == i = i+1
       //     System.out.println(array[i]);
       // }

    }
    public static void listEvenGreaterThan0() {
        int[] array = {-1, 2, -3, -4, -5, 6, 7, -8, 9, 0};
        for(int i = 0; i <array.length; i++) {
            if (array[i] >0 && array[i] % 2 ==0) {
                System.out.println(array[i]);
            }
        }

    }

    public static void greaterThan0() {

        int[] array = {-1, 2, -3, 4, -5, 6, 7, -8, 9, 0};
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void arrayTest() {
        int[] array = {32, 54, 37, 74, 35, 226, 88, 94, 20, 3 , 2, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
    }

}


public static void checkAge() {

    int age = 18;
    if (age >= 18) {
        System.out.println("Age over 18");
    } else {
        System.out.println("Age under 18");
    }
}
public static void isNumberEven(){
    int number = 1;
if (number % 2 ==0) {
    System.out.println("Number is even");
} else {
    System.out.println("Number is add");
}
}
public static void checkBigger() {
    int number1 = 3;
    int number2 = 3;
    if( number1 > number2) {
        System.out.println("Number1 is bigger");
    } else if(number1 == number2) {
        System.out.println("numbers are equal");

    }else {
        System.out.println("Number2 is bigger");
    }
}
}






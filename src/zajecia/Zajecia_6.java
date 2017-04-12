package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-11.
 */
public class Zajecia_6 {
    public static void main(String[] args) {
        int[] numberAsArray= numberToArray(157);
        System.out.println(arrayToNumber(numberAsArray));
        

        Zajecia_4.PublicArray(numberToArray(357));
        //System.out.println(sumOfRandom(150));
        //System.out.println(sumOfRandom(150));
        //System.out.println("15 " + sumOfDigits(357));
        // System.out.println("3 "+ numberOfDigits(357));
        // System.out.println("1 " + numberOfDigits(0));
        //   Scanner scanner = new Scanner(System.in);
        //  System.out.println("Insert number: ");
        //    int number = scanner.nextInt();
        // printPowersOf2(number);
        //   whileTest();
        //sumUntil();
        //  avgUntill();
        //Random random = new Random();
        //int result = game(random.nextInt(100));
        //System.out.println("You finished in " + result + " steps.");
    }

    public static void whileTest() {
        int number = 5;
        int counter = 0;
        Random random = new Random();
        while (number > 0) {

            counter++;
            number -= random.nextInt(3);
        }
        System.out.println(counter);
    }

    public static void printPowersOf2(int number) {
        int value = 1;
        while (number > value) {
            System.out.println(value);
            value *= 2;
        }
    }

    public static boolean sumUntil(int[] array, int sum) {
        int arraySum = 0;
        int i = 0;

        while (arraySum < sum && i < arraySum) {
            arraySum += array[i];
            i++;
        }
        return arraySum >= sum;
        // if (arraySum < sum) {
        //    retrun false;
        // } else {
        //    retrun true;
    }


    public static boolean avgUntill(int[] array, int avg) {
        int arraySum = array[0];
        int i = 0;
        while (arraySum / i < avg && i < array.length) {
            arraySum += array[i];
            i++;
        }
        return arraySum / i >= avg;
    }


    public static int game(int number) {

        Scanner scanner = new Scanner(System.in);
        int numberFromUser = -1;
        int stepsCounter = 0;
        while (numberFromUser != number) {
            System.out.println("Insert next number <0 - 99> : ");
            numberFromUser = scanner.nextInt();
            stepsCounter++;
            if (numberFromUser < number) {
                System.out.println("Your answer is too low!");
            } else if (numberFromUser > number) {
                System.out.println("Your number is too high!");

            }
        }
        return stepsCounter;
    }

    public static int numberOfDigits(int number) {

        int counter = 1;
        while (number / 10 > 1) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    // public static int bot


    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int sumOfRandom(int value) {
        Random random = new Random();
        int sum = 0;
        int i = 0;
        while (sum < value) {
            sum += random.nextInt(30 - 10);
            i++;
        }
        return i;
    }

    public static int[] numberToArray(int number) {


        int size = numberOfDigits(number);
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            array[array.length - i - 1] = number % 10;
            number /= 10;

            i++;
        }
        return array;
    }
    public static int arrayToNumber(int[] array) {
        int sum = 0;
        int valueToMultiply = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[array.length - i - 1] * valueToMultiply;
            valueToMultiply *= 10;

        }

    return sum;
    }
}









//zadanie domowe --> bot do gry + sumofRanodm zakres (-10 do 20) zwrot liczby i n razy dodanie [public static int sumOfRandom(int value)
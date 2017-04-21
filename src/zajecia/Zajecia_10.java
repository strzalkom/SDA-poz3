package zajecia;


import com.sun.org.glassfish.external.statistics.StringStatistic;

import java.util.Random;

/**
 * Created by RENT on 2017-04-20.
 */
public class Zajecia_10 {
    public static void main(String[] args) {
//        System.out.println(countAll("Ala ma kota", 'm'));
//        System.out.println(find("Ala ma kota", 'a'));
////       Zajecia_4.displayNewArray(stringStatistics("abbbbbbcccccdddzzz"));
//       int [] statistics = stringStatistics("Ala ma kota ");
//        int[] array = {1,2,3,4,5,6,7,8};

//        System.out.println(multiplyDigits(34));
//        System.out.println(multiplyDigits(123));
int[][] ints = randomMatrix(3,10,5);
    }


    public static int countAll(String message, char sentence) {
        char[] charArray = message.toCharArray();
        int i = 0;
        while (charArray[i] != sentence && i < charArray.length) {
            i++;
        }
        return (i == charArray.length) ? -1 : i;
    }

    public static int find(String message, char sentence) {

        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == sentence) {
                counter++;
            }
        }
        return counter;

    }

    public static char toLowerCase(char a) {
        if (a >= 65 && a <= 90) {

            a += 32;
        }
        return a;
    }

    public static int[] stringStatistics(String message) {
        char[] charArray = message.toCharArray();
        int[] ints = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            char charInLowerCase = toLowerCase(charArray[i]);
            if (charInLowerCase >= 97 && charInLowerCase <= 122) {
                ints[charInLowerCase - 97]++;
            }

        }

        return ints;

    }

    public static void printStringStarics(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print((char) (i + 97));
            }
        }
    }

    public static int multiplyDigits(int number) {

        int tmpNumber = number;
        int product = 1;
        while (number != 0) {
            product *= number % 10;
            number /= 10;

        }
        return product;
    }


    public static int[][] randomMatrix(int size, int bounds, int offset) {

        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                matrix[i][j] = random.nextInt(bounds) + offset;
            }
        }
        return matrix;
    }

    public static double[][] avg(int[][] matrix1, int[][] matrix2) {
        double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = (matrix1[i][j] + matrix2[i][j]) / 2.0;
            }
        }
        return resultMatrix;

    }



}
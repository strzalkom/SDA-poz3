<<<<<<< HEAD
package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia_5 {
    public static void main(String[] args) {
        tree(3);
//        printEmptySpace(5);
//        //  printOnesMatrix(5);
        // printOneMatrix(5);
        //printMatrixOfNumbers(4);
        // printTriangle(10);
        //  printRectangle(6,4);
        // printSquare(5);
        // randomTest();
        // Zajecia_4.PublicArray(getArray(10));
        // Zajecia_4.PublicArray(getArray(12));
        // Scanner scanner = new Scanner(System.in);
        //  System.out.println("Insert value:");
        // int someValue = scanner.nextInt();
        // int anotherValue = 24;
        // Zajecia_4.PublicArray(getArray(someValue));
        // Zajecia_4.PublicArray(getArray(anotherValue));
        // Zajecia_4.PublicArray(getRandomArray(5, 10, 10));
        // Zajecia_4.PublicArray(getRandomArray(5, 10, 5));
        //  Zajecia_4.PublicArray(getRandomArray(10, 10));
        // Scanner scanner = new Scanner(System.in);
        //  System.out.println("Insert size:");
        // int size = scanner.nextInt();
        //  System.out.println("Insert bound:");
        //  int bound = scanner.nextInt();
        //  System.out.println("Insert offset:");
        //  int offset = scanner.nextInt();
        // Zajecia_4.PublicArray(getRandomArray(size,bound,offset));

        // System.out.println("STATISTIC:");
        // Zajecia_4.statistic(getRandomArray(size,bound,offset));
        // System.out.println();
    }
    // public static void randomTest() {
    //  Random random = new Random();
    //  System.out.println(random.nextInt());
    // System.out.println(random.nextInt(10)-5);
    // System.out.println(random.nextInt(15)+5);
    // }

    public static int[] getRandomArray(int size, int bound) {
        return getRandomArray(size, bound, 0);
    }


    public static int[] getRandomArray(int size, int bound, int offset) {

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + offset;
        }
        return array;
    }

    public static int[] getArray(int value) {
        int size = value / 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + value % 2;

        }
        return array;
    }

    public static void printSquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" & ");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" 0 ");
            }
            System.out.println();
        }

    }

    public static void printTriangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" * ");


            }
            System.out.println();
        }
    }

    public static void printMatrixOfNumbers(int a) {
        //    int number = 1;

        //     for(int i = 0; i < a; i++) {
        //       for(int j= 0; j <a; j++) {
        //          System.out.print(number + " ");
        //           number++;
        //       }
        //       System.out.println();
        //     }
        // }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print((a * i) + (j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void printOneMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == i) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();

        }

    }

    public static void printOnesMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void printEmptySpace(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0 || i == (a - 1)) || (j == 0 || j == (a - 1))) {
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    // konar (liczba spacji) a-1
    //narysować korzeń --> zdanie domowe
    public static void tree(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("   ");

            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a - 1; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }

    }
}


=======
package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-10.
 */
public class Zajecia_5 {
    public static void main(String[] args) {
        homework();
        lineOfNumbers(20);
        // tree(5);
        //printEmptySpace(5);
        //  printOnesMatrix(5);
        // printOneMatrix(5);
        //printMatrixOfNumbers(4);
        // printTriangle(10);
        //  printRectangle(6,4);
        // printSquare(5);
        // randomTest();
        // Zajecia_4.PublicArray(getArray(10));
        // Zajecia_4.PublicArray(getArray(12));
        // Scanner scanner = new Scanner(System.in);
        //  System.out.println("Insert value:");
        // int someValue = scanner.nextInt();
        // int anotherValue = 24;
        // Zajecia_4.PublicArray(getArray(someValue));
        // Zajecia_4.PublicArray(getArray(anotherValue));
        // Zajecia_4.PublicArray(getRandomArray(5, 10, 10));
        // Zajecia_4.PublicArray(getRandomArray(5, 10, 5));
        //  Zajecia_4.PublicArray(getRandomArray(10, 10));
        // Scanner scanner = new Scanner(System.in);
        //  System.out.println("Insert size:");
        // int size = scanner.nextInt();
        //  System.out.println("Insert bound:");
        //  int bound = scanner.nextInt();
        //  System.out.println("Insert offset:");
        //  int offset = scanner.nextInt();
        // Zajecia_4.PublicArray(getRandomArray(size,bound,offset));

        // System.out.println("STATISTIC:");
        // Zajecia_4.statistic(getRandomArray(size,bound,offset));
        // System.out.println();
    }
    // public static void randomTest() {
    //  Random random = new Random();
    //  System.out.println(random.nextInt());
    // System.out.println(random.nextInt(10)-5);
    // System.out.println(random.nextInt(15)+5);
    // }

    public static int[] getRandomArray(int size, int bound) {
        return getRandomArray(size, bound, 0);
    }


    public static int[] getRandomArray(int size, int bound, int offset) {

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound) + offset;
        }
        return array;
    }

    public static int[] getArray(int value) {
        int size = value / 2;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + value % 2;

        }
        return array;
    }

    public static void printSquare(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" & ");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" 0 ");
            }
            System.out.println();
        }

    }

    public static void printTriangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" * ");


            }
            System.out.println();
        }
    }

    public static void printMatrixOfNumbers(int a) {
        //    int number = 1;

        //     for(int i = 0; i < a; i++) {
        //       for(int j= 0; j <a; j++) {
        //          System.out.print(number + " ");
        //           number++;
        //       }
        //       System.out.println();
        //     }
        // }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print((a * i) + (j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void printOneMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (j == i) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();

        }

    }

    public static void printOnesMatrix(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void printEmptySpace(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ((i == 0 || i == (a - 1)) || (j == 0 || j == (a - 1))) {
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    // konar (liczba spacji) a-1
    //narysować korzeń --> zdanie domowe
    public static void tree(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print("  ");

            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }

    public static void homework() {
        //losujemy liczbe z przedzialu 15-25
        //wywolac metode getArray()
        // uzyc wygenerowanej tablicy w metodzie statistics
        // dla wylosowanej liczby -12 wywolali metode tree
        Random random = new Random();
        System.out.println(random.nextInt());

        int number = random.nextInt(10) + 15;
        Zajecia_4.statistic(getArray(number));
        tree(number - 12);
        System.out.println();

    }

    public static void lineOfNumbers(int value) {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(i+1);
        }

    }
}
>>>>>>> origin/master

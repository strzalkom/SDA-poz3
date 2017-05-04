package zajecia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-12.
 */
public class Zajecia_7 {
    public static void main(String[] args) {
        int[][] matrix = fillWithRandomNumbers(3, 3);
        for (int i = 0; i < 100; i++) {
            matrix = biggerValues(matrix, fillWithRandomNumbers(3, 3));
            if (i % 10 == 0) {
                System.out.println();
                printMatrix(matrix);
            }
        }
        printMatrix(matrix);

//        int[][] matrix1 = fillWithRandomNumbers(3, 4);
//        int[][] matrix2 =fillWithRandomNumbers(4,8);
//        int[][] product = product(matrix1, matrix2);
//        printMatrix(matrix1);
//        System.out.println();
//        System.out.println("\t");
//        System.out.println();
//        printMatrix(matrix2);
//        System.out.println();
//        System.out.println("\t");
//        System.out.println();
//        printMatrix(product);
        //  System.out.println();
//        System.out.println(indexOfHighestSum(matrix));
        // int [][] matrix1 = fillWithRandomNumbers(3,3);
        // int[][] matrix2 = fillWithRandomNumbers(3, 3);
        // printMatrix(addTwoMatrix(matrix1,matrix2));

//        int[][] matrix = fillWithRandomNumbers(3,3);
//        System.out.println(sumOfElements(matrix));
////        int[][] matrix = fillWithRandomNumbers(3, 3);
//        int value = 5;
//        printMatrix(multiplyBy(matrix, 4));
// Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert number of rows: ");
//                int rows = scanner. nextInt();
//        System.out.println("Insert number of columns: ");
//        int columns = scanner. nextInt();
//        int[][] matrix = fillWithRandomFromUser(rows, columns);
//        printMatrix(matrix);
        // int[][] matrix = saveToMatrixExample();
        // printMatrix(matrix);
        //  printMatrix(fillWithRandomNumbers(4, 5));
        // System.out.println();
        //  printMatrix(fillWithRandomNumbers(6, 6));

    }



    public static int[][] saveToMatrixExample() {
        int rows = 2;
        int columns = 4;
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println("|");
        }
    }

    public static int[][] fillWithRandomNumbers(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(30) - 15;
            }
        }
        return matrix;
    }

    public static int[][] addTwoMatrix(int[][] matrix1, int[][] matrix2) {
        //rows --> matrix1.length;
        //columns --> matrix1[0].length
        //nowa maciez
        //dodajemy kolejene elementy do nowej macierzy
        //zwracamy nowa macierz

        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }

    //mnozymy kazdy element macierzy przez value. zwracamy nowa macierz
    public static int[][] multiplyBy(int[][] matrix, int value) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix[i][j] * value;
            }
        }
        return resultMatrix;
    }

    //zwracamy index wiersza ktory ma najwieksza sume elementow w wierszu
    public static int indexOfHighestSum(int[][] matrix) {
        int indexOfHighestRow = 0;
        for (int i = 1; i < matrix.length; i++) {
            if (Zajecia_4.sum(matrix[indexOfHighestRow]) < Zajecia_4.sum(matrix[i])) {
                indexOfHighestRow = i;
            }

        }

        return indexOfHighestRow;
    }

    public static int[][] flip(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] ResultMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ResultMatrix[j][i] = matrix[i][j];
            }
        }
        return ResultMatrix;
    }

    //bierzemy wieksza wartosc z jednej z dwoch macierzy i wyrzucamy ja do nowej
    public static int[][] biggerValues(int[][] matrix1, int[][] matrix2) {
        int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i][j]; j++) {
                if (matrix1[i][j] > matrix2[i][j]) {
                    resultMatrix[i][j] = matrix1[i][j];
                } else {
                    resultMatrix[i][j] = matrix2[i][j];
                    // resultMatrix[i][j] = (matrix1[i][j] > matrix2[i][j]) ? matrix1[i][j] : matrix2[i][j];
                }
            }
        }
            return resultMatrix;
        }




    public static int maxValue(int[][] matrix) {
        int max = Zajecia_4.maxFromArray(matrix[0]);
            for (int i = 1; i < matrix.length; i++) {
                int maxCandidate = Zajecia_4.maxFromArray(matrix[i]);
                if (max < maxCandidate) {
                    max = maxCandidate;
                }

            }
        return max;
        }
   //product = iloczyn
        public static int [][] product(int[][] matrix1, int[][] matrix2) {
            int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix2.length; k++) {
                        resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];

                    }
                }

            }
       return resultMatrix;
   }





    public static int sumOfElements(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
                sum += Zajecia_4.sum(matrix[i]);
            }

        return sum;
    }

    public static int[][] fillWithRandomFromUser(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Insert[" + i + "][" + j +"]: ");
                matrix[i][j] = scanner.nextInt();
                System.out.println();
            }
        }
        return matrix;
    }
}




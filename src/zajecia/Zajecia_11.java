package zajecia;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-21.
 */
public class Zajecia_11 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\src\\zajecia\\Alpaka");
        readFromFIleTest(file);
        writeToFileTest(file, "LAMA");
    }

    public static void readFromFIleTest(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static void writeToFileTest(File file, String message) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(message);

        }
    }


    public static int[] readIntegersFromFile(File file) throws FileNotFoundException {
        File file2 = new File("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\src\\zajecia\\Cwiczenie1");
        Scanner scanner = new Scanner(file2);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        return new int[0];
    }




public static int getLength(File file) throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    int counter = 0;
    while (scanner.hasNext()) {
        counter++;
        scanner.nextLine();

    }
    return counter;
}
}



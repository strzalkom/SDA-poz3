package zajecia.oop.Quiz1.result;

import java.io.*;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-26.
 */
public class FileResultsRespository implements ResultsRepository{


    private String pathToFile;

    private File fileWithResults;

    public FileResultsRespository(String pathToFile) {
        this.pathToFile = pathToFile;
        this.fileWithResults = new File(pathToFile);
    }

    public int getSize() {
        int counter = 0;

        try {
            Scanner scanner = new Scanner(fileWithResults);
            while (scanner.hasNextLine()) {
                counter++;
                scanner.nextLine();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return counter;

    }

    public Result[] getAllResults() {
        Result[] results = null;
        try {
            Scanner scanner = new Scanner(fileWithResults);
            results = new Result[getSize()];
            int i = 0;
            while (scanner.hasNextLine()) {
                results[i] = mapToResult(scanner.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return results;
    }

    private Result mapToResult(String resultString) {
        String[] split = resultString.split(" ");
        return new Result(split[0], Integer.valueOf(split[1]));

    }
    public Result[] getTopResults(int n) {
        Result[] resultsToReturn = new Result[n];
        try {
            Scanner scanner = new Scanner(fileWithResults);
            int loopSize = n < getSize() ? n : getSize();
            for (int i = 0; i < loopSize; i++) {
                resultsToReturn[i] = mapToResult(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return resultsToReturn;
    }

    public void add(Result result) {
        try (FileWriter fw = new FileWriter(fileWithResults, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




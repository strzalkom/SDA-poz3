package zajecia.oop.Quiz1.question;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-04-27.
 */
public class FileQuestionsRepository implements QuestionsRepository {

    public FileQuestionsRepository(String pathToFile) {
        this.pathToFile = pathToFile;
        this.fileWithResults = new File(pathToFile);
    }

    private String pathToFile;
    private File fileWithResults;

    public int getSize() throws FileNotFoundException {
        Scanner scanner = new Scanner(fileWithResults);
        int counter = 0;
        while (scanner.hasNextLine()) {
            counter++;
            scanner. nextLine();
        }
    return counter/6;
    }


    @Override
    public Question[] getQuestions() {
        Question[] questions = null;

        try {
            Scanner scanner = new Scanner(fileWithResults);
            questions = new Question[getSize()];
            int index = 0;
            while (scanner.hasNextLine()) {
//           1. Pobrac tresc
            String questionText = scanner.nextLine();
//           2. Pobrac odpowiedzi

            String[] answers = new String[4];
            for (int i = 0; i < answers.length; i++) {
                answers[i] = scanner.next();
            }


//            3. Pobrac poprawna odpowiedz
            int correctAnswer = scanner.nextInt();
                scanner.nextLine();
                questions[index] = map(questionText,answers,correctAnswer);
                index++;

        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new Question[0];
    }

    public Question map(String questionText, String[] answers, int correctAnswer){
        return new Question(questionText,correctAnswer,answers);

    }

}

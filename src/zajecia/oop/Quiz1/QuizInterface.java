package zajecia.oop.Quiz1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-25.
 */
public class QuizInterface {
    private Scanner scanner;
    public QuizInterface(){
        this.scanner = new Scanner(System.in);
    }
    public int menu () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("1. START");
        System.out.println("2. Wyniki");
        System.out.println("0. Koniec");


        int answer = scanner.nextInt();
        this.scanner.nextLine();
        return answer;
    }
public String insertName(){
    System.out.println("Insert Your name:   ");
    return this.scanner.nextLine();
}

public void beforeStart() {
    System.out.println("Press ENTER to start");
    this.scanner.nextLine();

}
public boolean showQuestion(Question question) {

    System.out.println(Question question);
    String[] possibleAnswers = question.getAnswers();
    for (int i = 0; i < possibleAnswers.length; i++) {
        System.out.println(i+1) + ". " + possibleAnswers[i]);
    }
  int answerFromUser = scanner. nextInt();
    scanner.nextLine();
    return question.checkAnswer(answerFromUser - 1);

    public void correctAnswer() {
        System.out.println("Correct answer!");
        scanner.nextLine();
    }


    public void incorrectAnswer(){
        System.out.println("Incorrect answer!");
    scanner.nextLine();
    }

    public void showResult(String name, int result) {
        System.out.println("Congratulation " + name "! You finished game with score: " + result);
    }


}


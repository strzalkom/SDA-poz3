package zajecia.oop.Quiz1;

import zajecia.oop.Quiz1.question.MockQuestionsRepository;
import zajecia.oop.Quiz1.question.Question;
import zajecia.oop.Quiz1.result.MockResultsRepository;
import zajecia.oop.Quiz1.result.Result;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        MockQuestionsRepository questionsRepository = new MockQuestionsRepository();
        MockResultsRepository resultsRepository = new MockResultsRepository();
//        Question[] questions = questionsRepository.getQuestions();
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);
//
//        }
//    }
        QuizInterface quizInterface = new QuizInterface();
        boolean gameFlag = true;
        while (gameFlag) {
            int decision = quizInterface.menu();
            switch (decision) {
                case 1:

                    String playerName = quizInterface.insertName();
                    quizInterface.beforeStart();
                    Question[] questions = questionsRepository.getQuestions();
                    int correctAnswerCounter = 0;
                    for (int i = 0; i < questions.length; i++) {
                        boolean result = quizInterface.showQuestion(questions[i]);
                        if (result) {
                            quizInterface.correctAnswer();
                            correctAnswerCounter++;
                        } else {
                            quizInterface.incorrectAnswer();

                        }

                    }
                   Result result = new Result(playerName, correctAnswerCounter);
                    quizInterface.showResult(result);
                   resultsRepository.add(result);

                    break;
                case 2:

                    quizInterface.showTopResults(resultsRepository.getTopResults(10));
                    break;
                case 0:

                    gameFlag = false;
                    break;
                default:
                System.out.println("Wrong decision");

            }

        }
 quizInterface.afterGameEnded();

    }
}


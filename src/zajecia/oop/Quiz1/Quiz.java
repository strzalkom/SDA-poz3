package zajecia.oop.Quiz1;

import zajecia.oop.Quiz1.question.FileQuestionsRepository;
import zajecia.oop.Quiz1.question.MockQuestionsRepository;
import zajecia.oop.Quiz1.question.Question;
import zajecia.oop.Quiz1.question.QuestionsRepository;
import zajecia.oop.Quiz1.result.FileResultsRespository;
import zajecia.oop.Quiz1.result.MockResultsRepository;
import zajecia.oop.Quiz1.result.Result;
import zajecia.oop.Quiz1.result.ResultsRepository;

/**
 * Created by RENT on 2017-04-25.
 */
public class Quiz {
    public static void main(String[] args) {
        QuestionsRepository questionsRepository = new FileQuestionsRepository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\src\\zajecia\\oop\\Quiz1\\quiz");
       ResultsRepository resultsRepository = new FileResultsRespository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\results.txt");
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


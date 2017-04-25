package zajecia.oop.Quiz1;

import zajecia.oop.Quiz1.question.MockQuestionsRepository;
import zajecia.oop.Quiz1.question.Question;
import zajecia.oop.Quiz1.result.MockResultsRepository;

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
        int decision = quizInterface.menu();
        if (decision ==1) {
            String playerName = quizInterface.insertName();
            quizInterface.beforeStart();
            Question[] questions = questionsRepository.getQuestions();
           int  correctAnswerCounter = 0;
            for (int i = 0; i < questions.length; i++) {
              boolean result =  quizInterface.showQuestion(questions[i]);
                if (result) {
                    quizInterface.correctAnswer();
                    correctAnswerCounter++;
                } else {
                    quizInterface.incorrectAnswer();
                    correctAnswerCounter++;
                }

            }
            quizInterface.showResult(playerName, correctAnswerCounter);
        }else if (decision ==2) {
            quizInterface.showResults(resultsRepository.getAllResults());
        }else {
                System.out.println("End of game");
            }
        }

    }

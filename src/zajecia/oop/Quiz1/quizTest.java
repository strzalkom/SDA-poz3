package zajecia.oop.Quiz1;

import zajecia.oop.Quiz1.question.FileQuestionsRepository;
import zajecia.oop.Quiz1.question.Question;
import zajecia.oop.Quiz1.question.QuestionsRepository;
import zajecia.oop.Quiz1.result.FileResultsRespository;
import zajecia.oop.Quiz1.result.Result;

/**
 * Created by RENT on 2017-04-26.
 */
public class quizTest {
    public static void main(String[] args) {


//        FileResultsRespository respository = new FileResultsRespository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\results.txt");
//        Result[] allResult = respository.getAllResults();
//        respository.add(new Result("Agnieszka", 2));
//        Result[] allResults1 = respository.getAllResults();
        QuestionsRepository questionsRepository = new FileQuestionsRepository("C:\\Users\\RENT\\IdeaProjects\\projekt\\SDA-poz3\\src\\zajecia\\oop\\Quiz1\\quiz");
       Question[] questions = questionsRepository.getQuestions();
    }

}

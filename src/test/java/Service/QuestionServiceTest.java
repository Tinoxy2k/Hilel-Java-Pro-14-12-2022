package Service;

import Model.Question;
import Repository.ConnectionSingleTone;
import Repository.Dao.QuestionRepository;
import Repository.QuestionRepositoryImplementation;
import org.junit.Assert;

import org.junit.Test;
import java.util.List;

public class QuestionServiceTest {
    private final List<Question> testQuestion = List.of(
            Question.builder().id(1).question("What is Java").topic("Java").build(),
            Question.builder().id(3).question("What is Class").topic("OOP").build(),
            Question.builder().id(1).question("What is SOLID").topic("OOP").build());

    private final QuestionRepository questionRepository = new QuestionRepository() {

        @Override
        public Question get(int id) {
            return null;
        }

        @Override
        public boolean save(Question question) {
            return false;
        }

        @Override
        public int update(Question question) {
            return 0;
        }

        @Override
        public boolean delete(int id) {
            return false;
        }

        @Override
        public List<Question> getAllQuestion() {
            return testQuestion;
        }

        @Override
        public List<Question> getByTopic(String topic) {
            return null;
        }
    };

    @Test
    public void getRandomTopic() {
        QuestionService questionService =
                new QuestionService(new QuestionRepositoryImplementation(ConnectionSingleTone.getConnection()));
        Question actual = questionService.getRandomQuestionTopic("OOP");
        System.out.println(actual);

    }
    @Test
    public void getRandomQuestion(){
       QuestionService questionService = new QuestionService(this.questionRepository);
       Question randomQuestion = questionService.getRandomQuestion();
       Assert.assertTrue(testQuestion.contains(randomQuestion));

    }
}

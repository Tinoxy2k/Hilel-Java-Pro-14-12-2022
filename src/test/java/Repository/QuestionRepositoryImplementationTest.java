package Repository;

import Model.Question;
import Repository.Dao.QuestionRepository;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class QuestionRepositoryImplementationTest {


    private final List<Question> testQuestionByTopic = List.of(
            Question.builder().id(2).question("What is OOP?").topic("OOP").build(),
            Question.builder().id(3).question("What is Class").topic("OOP").build(),
            Question.builder().id(4).question("What is SOLID").topic("OOP").build());


    @Test
    public void getTest() {
        QuestionRepository questionRepository =
                new QuestionRepositoryImplementation(ConnectionSingleTone.getConnection());
        int id = 2;
        Question expected = Question.builder().id(2).question("What is OOP?").topic("OOP").build();
        Question actual = questionRepository.get(id);
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void getByTopicTest() {
        QuestionRepository questionRepository = new QuestionRepositoryImplementation(
                ConnectionSingleTone.getConnection());
        String topic = "OOP";
        List<Question> expected = testQuestionByTopic;
        List<Question> actual = questionRepository.getByTopic(topic);
        Assert.assertEquals(expected, actual);
        //Assert.assertTrue(testQuestionByTopic.contains(actual));
        // Assert.assertTrue(!actual); ???????? ЯК ЗРІВНЯТИ ЧИ ВСЕ ВІРНО ЯКЩО В НАС В ТОПІКУ (Листі) МОЖЕ БУТИ БАГАТО ІНФИ
        // І РУЧКАМИ НАПИСАТИ ТЕСТ З ПІДКІДНИМ ЕРРЕЙ ЛІСТОМ ? ЯКЩО АССЕРТ ТРУ ТО ВІН ЯКЩО НАВІТЬ І ЗРІВНЯЄ САМ З СОБОЮ
        // ТО ТЕСТ НЕ ВПАДЕ ЧИ НЕ ТАК?
    }

    @Test
    public void saveTest() {
        QuestionRepository questionRepository =
                new QuestionRepositoryImplementation(ConnectionSingleTone.getConnection());
        Question expected = Question.builder().question("What is OOP?").topic("OOP").build();
        boolean actual = questionRepository.save(expected);
        Assert.assertTrue(!actual);
    }

    @Test
    public void removeTest() {
        QuestionRepository questionRepository = new QuestionRepositoryImplementation(
                ConnectionSingleTone.getConnection());
        int id = 6;
        boolean result = questionRepository.delete(id);
        Assert.assertTrue(!result);
    }

    @Test
    public void updateTest() {
        QuestionRepository questionRepository =
                new QuestionRepositoryImplementation(ConnectionSingleTone.getConnection());
        Question expected = Question.builder().question("What is OOP?").topic("OOP").id(2).build();
        int result = questionRepository.update(expected);
        Assert.assertEquals(1, result);
    }
}

package Service;
import Model.Question;
import Repository.Dao.QuestionRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class QuestionService {

    private final QuestionRepository questionRepository;
    private final Map<String,List<Question>> questionsByTopic = new HashMap<>();
    public QuestionService(QuestionRepository questionRepository) {
       this.questionRepository = questionRepository;
    }

    public Question getRandomQuestionTopic(String topic){
        List<Question> topics = questionRepository.getByTopic(topic);
        int randomValue = ThreadLocalRandom.current().nextInt(0,topics.size());
       return topics.get(randomValue);
    }
    public Question getRandomQuestion(){
        List<Question> allQuestion = questionRepository.getAllQuestion();
        int randomValue = ThreadLocalRandom.current().nextInt(0,allQuestion.size());
        return allQuestion.get(randomValue);
    }
}

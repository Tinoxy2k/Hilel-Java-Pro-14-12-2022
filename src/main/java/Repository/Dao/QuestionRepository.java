package Repository.Dao;

import Model.Question;

import java.util.List;

public interface QuestionRepository {
    Question get(int id);

    boolean save(Question question);

    int update(Question question);

    boolean delete(int id);

    List<Question> getAllQuestion();

    List<Question> getByTopic(String topic);


}

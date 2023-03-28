package Repository;

import Exceptions.SqlUpdateException;
import Model.Question;
import Repository.Dao.QuestionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionRepositoryImplementation implements QuestionRepository {
    private final Connection connection;

    public QuestionRepositoryImplementation(Connection connection) {
        this.connection = connection;
    }

    private final String findByID = """
            SELECT * 
            FROM questionare 
            WHERE id = ?
            """;

    private final String save = """
            INSERT INTO public.questionare(
            question,topic)
            VALUES(?,?)        
            """;

    private final String delete = """
            DELETE FROM public.questionare
            	WHERE id = ?;
            """;

    private final String update = """
            UPDATE public.questionare
            SET question=?, topic=?
            WHERE id = ?;
            """;

    private final String getAllQuestions = """
            SELECT * FROM public.questionare
             """;
    private final String findByTopic = """
            SELECT * 
            FROM public.questionare 
            WHERE topic = ?
            """;

    @Override
    public Question get(int id) {

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(findByID);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            resultSet.next();
            return Question.builder()
                    .id(resultSet.getInt("id"))
                    .question(resultSet.getString("question"))
                    .topic(resultSet.getString("topic"))
                    .build();

        } catch (SQLException e) {
            throw new SqlUpdateException(e.getMessage());
        }
    }

    @Override
    public boolean save(Question question) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(save);
            preparedStatement.setString(1, question.getQuestion());
            preparedStatement.setString(2, question.getTopic());

            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new SqlUpdateException(e.getMessage());
        }
    }

    @Override
    public int update(Question question) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1, question.getQuestion());
            preparedStatement.setString(2, question.getTopic());
            preparedStatement.setInt(3, question.getId());
            return preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new SqlUpdateException(e.getMessage());
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new SqlUpdateException(e.getMessage());
        }
        return false;
    }

    @Override
    public List<Question> getByTopic(String topic) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(findByTopic);
            preparedStatement.setString(1, topic);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            List<Question> questionsByTopic = new ArrayList<>();
            while (resultSet.next()) {
                questionsByTopic.add(Question.builder()
                        .id(resultSet.getInt("id"))
                        .question(resultSet.getString("question"))
                        .topic(resultSet.getString("topic"))
                        .build());
            }
            return questionsByTopic;

        } catch (SQLException e) {
            throw new SqlUpdateException(e.getMessage());
        }
    }

    @Override
    public List<Question> getAllQuestion() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(getAllQuestions);
            ResultSet resultSet = preparedStatement.getResultSet();
            preparedStatement.execute();
            List<Question> allQuestions = new ArrayList<>();
            while (resultSet.next()) {
                allQuestions.add(Question.builder()
                        .id(resultSet.getInt("id"))
                        .question("question")
                        .topic("topic")
                        .build());
            }
            return allQuestions;
        } catch (SQLException e) {
            throw new SqlUpdateException(e.getMessage());
        }
    }
}

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TextQuestionRepository extends QuestionRepository<TextQuestion>{
}

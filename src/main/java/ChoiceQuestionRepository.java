import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ChoiceQuestionRepository extends QuestionRepository<ChoiceQuestion>{
}

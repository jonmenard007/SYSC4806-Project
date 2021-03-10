import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberQuestionTest {
    private NumberQuestion question;
    public NumberQuestionTest(){

    }

    @Before
    public void buildUp(){
        question = new NumberQuestion();
    }

    @After
    public void tearDown(){
        question = null;
    }

    @Test
    public void testReturnQuestion(){
        String s = "Test Question 1";
        question.addQuestion(s);
        Assert.assertEquals(s, question.returnQuestion());

    }

    @Test
    public void testReturnAnswer(){
        String s = "Test Answer 1";
        question.addAnswer(s);
        Assert.assertEquals(s, question.returnAnswer(0));
    }
}
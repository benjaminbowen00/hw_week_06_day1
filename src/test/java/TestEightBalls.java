import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestEightBalls {

    EightBall myEightBall;

    @Before
    public void before(){
//            myEightBall = new EightBall();
        ArrayList <String> answers = new ArrayList<>();
        answers.add("Try Again!");
        answers.add("Not today");
        answers.add("Yes!");
        myEightBall = new EightBall(answers);

    }

    @Test
    public void hasAnswers(){
        assertEquals(3, myEightBall.numberOfAnswers());
    }

    @Test
    public void givesRandomAnswer() {
        assertNotNull(myEightBall.randomAnswer());
    }

    @Test
    public void canAddPrediction() {
        myEightBall.addPrediction("No Way");
        assertEquals(4, myEightBall.numberOfAnswers());
    }

    @Test
    public void canRemovePrediction() {
        myEightBall.removePrediction("Try Again!");
        assertEquals(2, myEightBall.numberOfAnswers());
    }

    @Test
    public void canRemovePredictionByIndex() {
        myEightBall.removePredictionByIndex(0);
        assertEquals(2, myEightBall.numberOfAnswers());
        assertEquals("Not today", myEightBall.getPredictionByIndex(0));
    }

    @Test
    public void getPredictionByIndex() {
        assertEquals("Try Again!", myEightBall.getPredictionByIndex(0));
        assertEquals("Not today", myEightBall.getPredictionByIndex(1));
    }
}

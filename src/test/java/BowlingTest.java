import org.junit.Test;
import tdd.Bowling;

import static org.junit.Assert.assertEquals;

/**
 * @author ：ls05
 * @date ：Created in 2020/5/1 0:22
 */
public class BowlingTest {
    @Test
    public void should_get_0_wher_all_0(){
        Bowling bowling = new Bowling();
        bowling.roll(0);
        int score = bowling.score();
        assertEquals(0,score);

    }
}

import org.junit.Test;
import tdd.Bowling;

import static org.junit.Assert.assertEquals;

public class BowlingTest {
    @Test
    public void should_get_0_wher_all_0(){
        Bowling bowling = new Bowling();
        bowling.roll(0);
        int score = bowling.score();
        assertEquals(0,score);
        
    }
    @Test
    public void should_get_300_when_roll_all_strike(){

        Bowling bowling = new Bowling();
        for (int i = 0; i <12 ; i++) {
            bowling.roll(10);
        }
        assertEquals(10,bowling.getRollList().get(0).getRoll());
        assertEquals(10,bowling.getRollList().get(9).getRoll());
        assertEquals(300,bowling.score());

    }
    @Test
    public void should_get_3_when_roll_all_spare(){

        Bowling bowling = new Bowling();
        for (int i = 0; i <10 ; i++) {
            bowling.roll(3);
            bowling.roll(7);
        }
        bowling.roll(7);
        assertEquals(3,bowling.getRollList().get(0).getRoll());
        assertEquals(7,bowling.getRollList().get(1).getRoll());
        assertEquals(7,bowling.getRollList().get(7).getRoll());
        assertEquals(21,bowling.getRollList().size());
        assertEquals(134,bowling.score());

    }
    @Test
    public void should_get_4_when_roll_all_miss(){

        Bowling bowling = new Bowling();
        for (int i = 0; i <10 ; i++) {
            bowling.roll(4);
            bowling.roll(2);
        }
        assertEquals(4,bowling.getRollList().get(0).getRoll());
        assertEquals(2,bowling.getRollList().get(1).getRoll());
        assertEquals(4,bowling.getRollList().get(2).getRoll());
        assertEquals(20,bowling.getRollList().size());
        assertEquals(60,bowling.score());
    }
    @Test
    public void should_get_score_when_one_strike_and_other_miss(){

        Bowling bowling = new Bowling();
        bowling.roll(10);
        for (int i = 0; i <9 ; i++) {
            bowling.roll(4);
            bowling.roll(2);
        }
        assertEquals(10,bowling.getRollList().get(0).getRoll());
        assertEquals(4,bowling.getRollList().get(1).getRoll());
        assertEquals(19,bowling.getRollList().size());
        assertEquals(70,bowling.score());
    }
    @Test
    public void should_get_score_when_two_strike_and_other_miss(){

        Bowling bowling = new Bowling();
        bowling.roll(10);
        bowling.roll(10);
        for (int i = 0; i <8 ; i++) {
            bowling.roll(4);
            bowling.roll(2);
        }
        assertEquals(10,bowling.getRollList().get(0).getRoll());
        assertEquals(4,bowling.getRollList().get(2).getRoll());
        assertEquals(18,bowling.getRollList().size());
        assertEquals(88,bowling.score());
    }
    @Test
    public void should_get_score_when_two_miss_and_other_strike(){

        Bowling bowling = new Bowling();
        for (int i = 0; i <2 ; i++) {
            bowling.roll(4);
            bowling.roll(2);
        }
        for (int i = 0; i <8 ; i++) {
            bowling.roll(10);
        }
        assertEquals(20,bowling.getRollList().size());
        assertEquals(252,bowling.score());
    }
    
}

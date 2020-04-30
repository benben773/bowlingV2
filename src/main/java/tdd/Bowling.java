package tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ls05
 * @date ：Created in 2020/5/1 0:24
 */
public class Bowling {
    private List<Ball> rollList;
    private int score;

    public Bowling() {
        rollList = new ArrayList<Ball>();
    }

    public void roll(int roll) {
        Ball ball = new Ball(roll);
        rollList.add(ball);
    }

    public int score() {
        int size = rollList.size();
        for (int ballCount = 0; ballCount < size-2; ballCount++) {
            score += rollList.get(ballCount).getRoll() + rollList.get(ballCount +1).getRoll() + rollList.get(ballCount + 2).getRoll();
        }
        return score;
    }

    public List<Ball> getRollList() {
        return rollList;
    }

}

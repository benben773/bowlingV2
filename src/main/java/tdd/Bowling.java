package tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ls05
 * @date ：Created in 2020/5/1 0:24
 */
public class Bowling {
    private List<Ball> rollList;

    public Bowling() {
        rollList = new ArrayList<Ball>();
    }

    public void roll(int roll) {
        Ball ball = new Ball(roll);
        rollList.add(ball);
    }

    public int score() {
        return 0;
    }

    public List<Ball> getRollList() {
        return rollList;
    }

    public void setRollList(List<Ball> rollList) {
        this.rollList = rollList;
    }
}

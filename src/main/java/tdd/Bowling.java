package tdd;

import java.util.ArrayList;
import java.util.List;

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
            int firstRoll = rollList.get(ballCount).getRoll();
            int secondRoll = rollList.get(ballCount + 1).getRoll();
            if (isStrike(firstRoll,secondRoll)) {
                int therdRoll = rollList.get(ballCount + 2).getRoll();
                score += firstRoll + secondRoll + therdRoll;
            } else if  (isSpare(firstRoll, secondRoll)){
                int therdRoll = rollList.get(ballCount + 2).getRoll();
                score += 10 + therdRoll;
                ballCount += 1;
            } else if  (isMiss(firstRoll, secondRoll)){
                score += firstRoll + secondRoll;
                ballCount += 1;
                if(ballCount == size-7){
                    ballCount--;
                }
            }
        }
        return score;
    }

    private boolean isMiss(int firstRoll, int secondRoll) {
        return firstRoll +secondRoll < 10;
    }

    private boolean isSpare(int firstRoll, int secondRoll) {
        return firstRoll + secondRoll == 10;
    }

    private boolean isStrike(int firstRoll, int secondRoll) {
        return firstRoll==10;
    }

    public List<Ball> getRollList() {
        return rollList;
    }

}

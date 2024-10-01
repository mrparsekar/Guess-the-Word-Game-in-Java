/*
Name:Shreyash Parsekar
MCA Part-1
OOPS Lab
Topic: Java Game
Start Date:16/08/2024
Modified Date:27/08/2024
 */
public class GameBase {
    private int remainingAttempts;

    public GameBase(int maxAttempts) {
        this.remainingAttempts = maxAttempts;
    }

    public boolean isGameEnded() {
        return remainingAttempts <= 0;
    }

    public int getRemainingAttempts() {
        return remainingAttempts;
    }

    protected void decrementAttempts() {
        remainingAttempts--;
    }


}

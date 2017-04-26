package zajecia.oop.Quiz1.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class Result {
    private String playerName;
    private int result;

    @Override
    public String toString() {
        return playerName + " " + result;
    }

    public Result(String playerName, int result) {
        this.playerName = playerName;
        this.result = result;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getResult() {
        return result;
    }
}
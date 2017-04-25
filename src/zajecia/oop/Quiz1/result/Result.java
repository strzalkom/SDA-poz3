package zajecia.oop.Quiz1.result;

/**
 * Created by RENT on 2017-04-25.
 */
public class Result {
    private String playernName;
    private int result;

    public String getPlayernName() {
        return playernName;
    }

    public int getResult() {
        return result;
    }

    public Result(String playernName, int result) {
        this.playernName = playernName;
        this.result = result;

    }
}

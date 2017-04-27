package zajecia.oop.Quiz1.result;

/**
 * Created by RENT on 2017-04-27.
 */
public interface ResultsRepository {
    public Result[] getAllResults();
    public Result[] getTopResults(int n);
    public void add(Result result);
}

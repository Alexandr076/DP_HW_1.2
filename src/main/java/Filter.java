import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer i: source) {
            if (i >= this.f) {
                logger.log("Элемент " + "\"" + i + "\"" + " подходит");
                result.add(i);
            }
            else {
                logger.log("Элемент " + "\"" + i + "\"" + " не подходит");
            }
        }
        return result;
    }
}

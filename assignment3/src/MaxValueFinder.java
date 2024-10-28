import java.util.ArrayList;
import java.util.Collections;

public class MaxValueFinder {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return Collections.max(list);
    }

}

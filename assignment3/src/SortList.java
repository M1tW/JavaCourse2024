import java.util.ArrayList;
import java.util.Collections;

public class SortList {

    public static void sort(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        Collections.sort(list);
    }
}

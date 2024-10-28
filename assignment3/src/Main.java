import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.max;
import static java.util.Collections.sort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);

        System.out.println("The maximum value is: " + max(list));
        System.out.println("Before sorting: " + list);
        sort(list);
        System.out.println("After sorting: " + list);
    }
}
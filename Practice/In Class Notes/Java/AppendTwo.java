import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendTwo {

    // todo: do app2 using ArrayList<Integer> instead

    public static ArrayList<Integer> app2(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int x : a) { // "for each item x IN (:) the arraylist a":
            result.add(x);
        }
        for (int i = 0 ; i < b.size() ; i++) {
            result.add(b.get(i + a.size()));
        }
        return result;
    }

    public static int[] app(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0 ; i < a.length ; i++) {
            result[i] = a[i];
        }
        for (int i = 0 ; i < b.length ; i++) {
            result[i + a.length] = b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x1 = {20, 30};
        int[] x2 = {40, 50, 60};
        // [20, 30, 40, 50, 60]

        int[] res = app(x1, x2);

        System.out.println(Arrays.toString(res));
    }
}

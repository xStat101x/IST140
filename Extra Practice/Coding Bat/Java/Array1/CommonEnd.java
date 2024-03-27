package Array1;

public class CommonEnd {
    public static boolean commonEnd(int[] a, int[] b) {
        boolean is0True = false;
        boolean isLengthTrue = false;
        if (a[0] == b[0]) {
            is0True = true;
        }
        if (a[a.length - 1] == b[b.length - 1]) {
            isLengthTrue = true;
        }
        if (isLengthTrue || is0True) {
            return true;
        }
        return false;
    }
}

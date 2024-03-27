public class recursion {
    public static void printAllOnNewLines(String s, int currIndex) {
        if (currIndex >= s.length()) {
            return;
        }
        System.out.println(s.charAt(currIndex));
        printAllOnNewLines(s, currIndex + 1);
    }

    public static void main(String[] args) {
        printAllOnNewLines("cat", 0);
    }
}

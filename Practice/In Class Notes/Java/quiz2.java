import java.util.Scanner;

public class quiz2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();

        int n = num.length();

        String lastNum = num.substring(n - 3, n);

        String firstNum = num.substring(0, n - 3);

        System.out.println(firstNum + "," + lastNum);
    }
}

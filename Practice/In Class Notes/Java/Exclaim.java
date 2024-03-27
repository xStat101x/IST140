import java.util.Scanner;

public class Exclaim {

    public static String exclaimName(String input) {
        input = input.concat("!");
        return input;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        System.out.println(exclaimName(input));
    }
}

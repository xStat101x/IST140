import java.util.Scanner;

public class PA4Hailstone {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int count = 0;

        if (input == 1) {
            System.out.println(input);
            return;
        }

        System.out.print(input + "\t");
        count++;

        while (input != 1) {

            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = input * 3 + 1;
            }
            if (input == 1) {
                System.out.print(input);
                break;
            }
            System.out.print(input + "\t");

            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

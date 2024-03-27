import java.util.Scanner;

public class question6 {
    /**
     * Takes in the inputs and checks if its 6
     * then adds the non 6's together and returns sum
     * @param in1
     * @param in2
     * @param in3
     * @return sum
     */
    public static int add3(int in1, int in2, int in3) {
        int sum = 0;
        if (in1 == 6) {
            sum = in2 + in3;
        } else if (in2 == 6) {
            sum = in1 + in3;
        } else if (in3 == 6) {
            sum = in1 + in2;
        } else if (in3 == 6 && in2 == 6) {
            sum = in1;
        } else if (in1 == 6 && in2 == 6) {
            sum = in3;
        } else if (in3 == 6 && in1 == 6) {
            sum = in2;
        } else {
            sum = in1 + in2 + in3;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int in1 = scan.nextInt();
        int in2 = scan.nextInt();
        int in3 = scan.nextInt();

        System.out.println(add3(in1, in2, in3));
    }
}

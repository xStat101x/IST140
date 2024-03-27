import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int limitMPH = scan.nextInt();
        int currSpeed = scan.nextInt();

        if (currSpeed <= limitMPH - 10) {
            System.out.println("50");
        } else if (currSpeed >= (limitMPH + 6) && currSpeed <= (limitMPH + 20) ) {
            System.out.println("75");
        } else if (currSpeed >= (limitMPH + 21) && currSpeed <= (limitMPH + 40) ) {
            System.out.println("150");
        } else if (currSpeed > (limitMPH + 40)) {
            System.out.println("300");
        } else {
            System.out.println("0");
        }

    }
}

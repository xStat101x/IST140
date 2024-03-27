import java.util.Scanner;

public class LoginName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstname = scan.next();
        String lastname = scan.next();
        String firstLetterLast = lastname.substring(0, 1);
        int dateOfBirth = scan.nextInt();

        String login1;

        if (firstname.length() >= 6) {
            login1 = firstname.substring(0, 6);
        } else {
            login1 = firstname;
        }

        System.out.print("Your login name: ");
        System.out.print(login1);
        System.out.print(firstLetterLast);
        System.out.print("_");
        System.out.println(dateOfBirth % 10);
    }
}

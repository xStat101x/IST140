import java.util.Scanner;

public class PA2Books {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final double TAX = .075;

        double num1 = scan.nextDouble();
        double num2 = scan.nextInt();
        double basePrice = num1 * num2;
        double tax = basePrice * TAX;
        double shipping = num2 * 2;
        double total = tax + shipping + basePrice;

        System.out.printf("%-20s $%.2f\n", "ind. book price:", num1);
        System.out.printf("%-20s %.0f\n", "num of copies:", num2);
        System.out.printf("%-20s $%.2f\n", "base price:", basePrice);
        System.out.printf("%-20s $%.2f\n", "tax:", tax);
        System.out.printf("%-20s $%.0f\n", "shipping:", shipping);
        System.out.println("----------");
        System.out.printf("%-20s $%.2f\n", "total:", total);

    }
}

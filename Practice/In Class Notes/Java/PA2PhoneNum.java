import java.util.Scanner;

public class PA2PhoneNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();
        int n = num.length();
        String areacode = "(" + num.substring(0, 3) + ")";
        String midnum = " " + num.substring(3, 6);
        String lastnum = "-" + num.substring(6, n);

        System.out.print(num);
        System.out.print(" ---format---> ");
        System.out.print(areacode);
        System.out.println(midnum + lastnum);


    }
}

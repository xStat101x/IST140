
/*
public class PA4Pass {
    static void myStaticMethod() {
        
    }
    public static void main(String[] args) {



    }
}

*/




import java.util.Scanner;

public class PA4Pass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        for (int x = 0 ; x < input.length() ; x++) {
            String subInput = input.substring(x , x + 1);
            if (subInput.equals("i")) {
                System.out.print("1");
            } else if (subInput.equals("a")) {
                System.out.print("@");
            } else if (subInput.equals("m")) {
                System.out.print("M");
            } else if (subInput.equals("B")) {
                System.out.print("8");
            } else if (subInput.equals("s")) {
                System.out.print("$");
            } else {
                System.out.print(subInput);
            }
        }
        System.out.println("!");
    }
}

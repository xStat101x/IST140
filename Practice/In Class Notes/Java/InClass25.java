public class InClass25 {
    public static void main(String[] args) {

        //equals vs .equals(..)

        int x = 40;
        int y = 50;

        // == : is called "reference equality"

        String s1 = "Rob";
        //           012345
        String s2 = "RobRob".substring(3, 6); // "Rob" s2: "Rob

        if (s1.equals(s2)) { //  == compares addresses whereas .equals compares as you would expect
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }


    }
}

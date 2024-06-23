import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        // Take a User Input Two , Calc Program
        //


        //  Logic Building
        //        1. Understand it
        //        2. Inputs -> num1,num2 ? data type?  int
        //        3. Rough Logic -> num1+num2 , -, * , / , %
        //        4. Correct Logic ->
        //        5. Optimize
        //        6. Edge Cases Fix

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1 = scanner.nextInt();
        System.out.println(num1);
        System.out.println("Enter the Num2");
        int num2 = scanner.nextInt();
        System.out.println(num2);


        System.out.println("Sum is -> " + (num1 + num2));
        System.out.println("Sub is -> " + (num1 - num2));
        System.out.println("Mul -> " + (num1 * num2));


    }
}

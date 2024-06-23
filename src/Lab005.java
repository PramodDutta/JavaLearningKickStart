import java.util.Scanner;

public class Lab005 {
    public static void main(String[] args) {
        // Take a User Input Two numbers int , Calc Program

        // //  Logic Building


        // 1. Understand the problem
        // num1, num2 -> sum, div, sub, mul


        //2. Inputs
        //  2 inputs, data type?  int
        // o/p - int
        // ? Scanner Class jAVA
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num1\n");
        int num1 = sc.nextInt();

        System.out.println("Enter your second num2\n");
        int num2 = sc.nextInt();


        //3. Rough Logic
        // a +b , a-b , a*b , a/b


        //4. Correct Logic
        System.out.println("Sum is = " + (num1 + num2));
        System.out.println("Sub is = " + (num1 - num2));
        System.out.println("Mul is = " + (num1 * num2));
        System.out.println("Divis = " + (num1 / num2));


        //5. Optimize
        //6. Edge Cases Fix


    }
}

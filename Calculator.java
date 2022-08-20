import java.util.*;
public class Calculator
{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("List are:");
        System.out.println("1.Addition\n2.Subtractio\n3.Multiplication\n" +
                "4.Quotient\n5.Remainder\n");
        System.out.println("Choose the operator(1-5)");
        int c = sc.nextInt();
        System.out.println("Enter any two numbers:");
        int a =sc.nextInt();
        int b= sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Sum is:" + a+b);
                break;
            case 2:
                int d= a-b;
                System.out.println("Difference is:" + d);
                break;
            case 3:
                System.out.println("Multiplication is:" + a*b);
            case 4:
                System.out.println("Quotient is:" + a/b);
            case 5:
                System.out.println("Remainder is:"+ a%b);
            default:
                System.out.println("INVALID");
        }
   }
}
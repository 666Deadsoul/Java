import java.util.Scanner;
public class Multiplication_Table
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        for(int i=0;i<=10;i++)
        {
            int m= n*i;
            System.out.println(n+"*"+i+"="+m);
        }
    }
}

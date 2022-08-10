import java.util.*;
public class Prac
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:\n");
        String name= sc.nextLine();
        System.out.println("Enter your address:\n");
        String address = sc.nextLine();
        System.out.println("Enter age:\n");
        int age= sc.nextInt();
        System.out.println("Name: " + name + "\nAge: " + age + "\nAddress: " + address);
    }

}
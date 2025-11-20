import java.util.Scanner;
public class PR47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is maximum");
        else
            System.out.println(b + " is maximum");
    }
}
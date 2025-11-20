import java.util.Scanner;
public class PR48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();
        if (score >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
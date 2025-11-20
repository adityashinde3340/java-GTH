import java.util.Scanner;
public class PR49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score out of 100: ");
        int score = sc.nextInt();
        if (score >= 90)
            System.out.println("Excellent");
        else if (score >= 75)
            System.out.println("Good");
        else if (score >= 50)
            System.out.println("Average");
        else
            System.out.println("Poor");
    }
}
import java.util.*;
public class PR53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage: ");
        int percentage = sc.nextInt();
        System.out.print("Enter income: ");
        int income = sc.nextInt();
        String result = (percentage >= 75 && income < 200000) ? "Eligible" : "Not Eligible";
        System.out.println(result);
    }
}

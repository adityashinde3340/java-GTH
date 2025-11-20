import java.util.*;
public class PR60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount and balance: ");
        int x = sc.nextInt();
        double y = sc.nextDouble();
        y = (x % 5 == 0 && x + 0.50 <= y) ? (y - x - 0.50) : y;
        System.out.printf("%.2f", y);
    }
}

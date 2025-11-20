import java.util.*;
public class PR57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter performance rating: ");
        double rating = sc.nextDouble();
        double bonus = (rating > 8) ? 15 : (rating > 5 ? 10 : 0);
        System.out.println("Bonus Percentage: " + bonus + "%");
    }
}

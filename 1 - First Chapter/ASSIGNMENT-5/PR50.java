import java.util.*;
public class PR50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        String result = (sqrt == (int)sqrt) ? "Perfect Square" : "Not Perfect Square";
        System.out.println(result);
    }
}

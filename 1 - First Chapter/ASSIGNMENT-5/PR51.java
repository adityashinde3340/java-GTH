import java.util.*;
public class PR51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int diff = m - n;
        String result = (diff > 10) ? "Difference > 10" : "Difference <= 10";
        System.out.println(result);
    }
}

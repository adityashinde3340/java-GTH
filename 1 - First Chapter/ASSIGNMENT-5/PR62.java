import java.util.*;
public class PR62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit score: ");
        int x = sc.nextInt();
        String result = (x >= 750) ? "YES" : "NO";
        System.out.println(result);
    }
}

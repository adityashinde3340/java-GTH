import java.util.*;
public class PR58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        while(t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            String result = (x < y) ? "FIRST" : (x > y ? "SECOND" : "ANY");
            System.out.println(result);
        }
    }
}

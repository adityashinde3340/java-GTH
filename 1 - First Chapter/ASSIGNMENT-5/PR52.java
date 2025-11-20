import java.util.*;
public class PR52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p: ");
        int p = sc.nextInt();
        System.out.print("Enter q: ");
        int q = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int middle = (p > q) ? ((p < r) ? p : (q > r ? q : r)) : ((q < r) ? q : (p > r ? p : r));
        System.out.println("Middle Number: " + middle);
    }
}

import java.util.*;
public class PR54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();
        int first = num / 100;
        int last = num % 10;
        int larger = (first > last) ? first : last;
        System.out.println("Larger digit: " + larger);
    }
}

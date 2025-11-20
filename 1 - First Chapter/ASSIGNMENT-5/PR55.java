import java.util.*;
public class PR55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();
        int first = num / 100;
        int mid = (num / 10) % 10;
        int last = num % 10;
        String result = (mid > (first + last)) ? "Middle digit is greater" : "Middle digit is not greater";
        System.out.println(result);
    }
}

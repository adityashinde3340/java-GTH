import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity units: ");
        int units = sc.nextInt();
        int total = 0;
        
        if (units <= 100) {
            total = units * 5;
        } else if (units <= 200) {
            total = 100 * 5 + (units - 100) * 7;
        } else if (units <= 300) {
            total = 100 * 5 + 100 * 7 + (units - 200) * 10;
        } else {
            total = 100 * 5 + 100 * 7 + 100 * 10 + (units - 300) * 15;
        }
        
        System.out.println("Total Bill: ₹" + total);
        sc.close();
    }
}
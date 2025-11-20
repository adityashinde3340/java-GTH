import java.util.*;
public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Balance: " + balance);
                break;
            case 2:
                System.out.println("Enter amount to withdraw:");
                int w = sc.nextInt();
                if(w <= balance){
                    balance -= w;
                    System.out.println("Withdrawn. New Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 3:
                System.out.println("Enter amount to deposit:");
                int d = sc.nextInt();
                balance += d;
                System.out.println("Deposited. New Balance: " + balance);
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}

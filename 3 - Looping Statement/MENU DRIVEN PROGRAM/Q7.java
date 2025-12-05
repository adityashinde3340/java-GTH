import java.util.*;
class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = 0;

        while(true){
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter amount: ");
                    balance += sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    if(amt <= balance) balance -= amt;
                    else System.out.println("Insufficient balance");
                    break;

                case 3:
                    System.out.println("Balance = " + balance);
                    break;

                case 4: return;
            }
        }
    }
}
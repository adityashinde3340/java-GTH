import java.util.*;
class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        String mini = "";

        while(true){
            System.out.println("\n1. Withdraw\n2. Deposit\n3. Mini Statement\n4. Check Balance\n5. Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    if(w <= balance){
                        balance -= w;
                        mini += "Withdraw: " + w + "\n";
                    } else System.out.println("Not enough balance!");
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    balance += d;
                    mini += "Deposit: " + d + "\n";
                    break;

                case 3:
                    System.out.println("\nMini Statement:\n" + mini);
                    break;

                case 4:
                    System.out.println("Balance = " + balance);
                    break;

                case 5: return;
            }
        }
    }
}
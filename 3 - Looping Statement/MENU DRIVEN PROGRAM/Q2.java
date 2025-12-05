import java.util.*;
class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Check Even/Odd\n2. Exit");
            int ch = sc.nextInt();

            if(ch == 2) break;

            System.out.print("Enter number: ");
            int n = sc.nextInt();

            System.out.println(n % 2 == 0 ? "Even" : "Odd");
        }
    }
}
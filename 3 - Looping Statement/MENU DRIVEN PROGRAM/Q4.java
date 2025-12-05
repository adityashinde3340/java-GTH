import java.util.*;
class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Square\n2. Cube\n3. Factorial\n4. Exit");
            int ch = sc.nextInt();

            if(ch == 4) break;

            System.out.print("Enter number: ");
            int n = sc.nextInt();

            switch(ch){
                case 1: System.out.println("Square = " + (n*n)); break;
                case 2: System.out.println("Cube = " + (n*n*n)); break;
                case 3:
                    long fact = 1;
                    for(int i=1;i<=n;i++) fact *= i;
                    System.out.println("Factorial = " + fact);
                    break;
            }
        }
    }
}
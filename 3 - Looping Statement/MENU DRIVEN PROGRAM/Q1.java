import java.util.*;
class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if(ch == 5) break;

            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            switch(ch){
                case 1: System.out.println("Addition = " + (a+b)); break;
                case 2: System.out.println("Subtraction = " + (a-b)); break;
                case 3: System.out.println("Multiplication = " + (a*b)); break;
                case 4: 
                    if(b != 0) System.out.println("Division = " + (a/b));
                    else System.out.println("Cannot divide by zero!");
                    break;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
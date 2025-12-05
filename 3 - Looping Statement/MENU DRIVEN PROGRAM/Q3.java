import java.util.*;
class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Area of Circle\n2. Area of Rectangle\n3. Area of Triangle\n4. Exit");
            int ch = sc.nextInt();

            if(ch == 4) break;

            switch(ch){
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area = " + (3.14 * r * r));
                    break;
                case 2:
                    System.out.print("Enter length & breadth: ");
                    double l = sc.nextDouble();
                    double b = sc.nextDouble();
                    System.out.println("Area = " + (l * b));
                    break;
                case 3:
                    System.out.print("Enter base & height: ");
                    double base = sc.nextDouble();
                    double h = sc.nextDouble();
                    System.out.println("Area = " + (0.5 * base * h));
                    break;
            }
        }
    }
}
import java.util.*;
class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Celsius → Fahrenheit\n2. Fahrenheit → Celsius\n3. Exit");
            int ch = sc.nextInt();

            if(ch == 3) break;

            switch(ch){
                case 1:
                    System.out.print("Enter Celsius: ");
                    double c = sc.nextDouble();
                    System.out.println("Fahrenheit = " + ((c * 9/5) + 32));
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    double f = sc.nextDouble();
                    System.out.println("Celsius = " + ((f - 32) * 5/9));
                    break;
            }
        }
    }
}
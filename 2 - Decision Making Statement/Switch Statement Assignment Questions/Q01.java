import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();

        switch (num1) {
            case 1: System.out.println("1 - Monday"); break;
            case 2: System.out.println("2 - Tuesday"); break;
            case 3: System.out.println("3 - Wednesday"); break;
            case 4: System.out.println("4 - Thursday"); break;
            case 5: System.out.println("5 - Friday"); break;
            case 6: System.out.println("6 - Saturday"); break;
            case 7: System.out.println("7 - Sunday"); break;
            default: System.out.println("Please enter a number between 1 and 7.");
        }
    }
}

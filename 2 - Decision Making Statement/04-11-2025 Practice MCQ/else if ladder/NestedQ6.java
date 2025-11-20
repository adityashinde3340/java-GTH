import java.util.Scanner;
public class NestedQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter nationality: ");
        String nationality = sc.next();
        
        if (age >= 18) {
            if (nationality.equalsIgnoreCase("Indian"))
                System.out.println("Eligible to vote");
            else
                System.out.println("Not Indian citizen");
        } else
            System.out.println("Not eligible (underage)");
        
        sc.close();
    }
}
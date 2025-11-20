import java.util.Scanner;
public class NestedQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            if ("AEIOUaeiou".indexOf(ch) != -1)
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Symbol");
        }
        
        sc.close();
    }
}
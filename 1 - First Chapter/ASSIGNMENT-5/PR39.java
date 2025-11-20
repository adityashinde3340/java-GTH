import java.util.Scanner;
public class PR39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("Vowel");
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("Consonant");
        else
            System.out.println("Not an alphabet");
    }
}
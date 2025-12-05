import java.util.*;
class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Length\n2. Reverse\n3. Uppercase\n4. Exit");
            int ch = Integer.parseInt(sc.nextLine());

            if(ch == 4) break;

            System.out.print("Enter string: ");
            String s = sc.nextLine();

            switch(ch){
                case 1: System.out.println("Length = " + s.length()); break;
                case 2: System.out.println("Reverse = " + new StringBuilder(s).reverse()); break;
                case 3: System.out.println("Uppercase = " + s.toUpperCase()); break;
            }
        }
    }
}
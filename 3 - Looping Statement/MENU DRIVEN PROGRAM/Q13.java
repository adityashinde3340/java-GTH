import java.util.*;
class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<>();
        books.add("Java");
        books.add("Python");
        books.add("HTML");

        while(true){
            System.out.println("\n1. Issue Book\n2. Return Book\n3. Search Book\n4. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch(ch){
                case 1:
                    System.out.print("Enter book to issue: ");
                    String b1 = sc.nextLine();
                    if(books.contains(b1)){
                        books.remove(b1);
                        System.out.println("Book Issued.");
                    } else System.out.println("Not available.");
                    break;

                case 2:
                    System.out.print("Enter book to return: ");
                    String b2 = sc.nextLine();
                    books.add(b2);
                    System.out.println("Book Returned.");
                    break;

                case 3:
                    System.out.print("Enter book name: ");
                    String b3 = sc.nextLine();
                    if(books.contains(b3)) System.out.println("Available");
                    else System.out.println("Not Available");
                    break;

                case 4: return;
            }
        }
    }
}
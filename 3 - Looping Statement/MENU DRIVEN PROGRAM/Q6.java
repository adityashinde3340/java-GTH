import java.util.*;
class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m1=0,m2=0,m3=0;
        int total = 0;
        double per = 0;

        while(true){
            System.out.println("\n1. Enter Marks\n2. Total\n3. Percentage\n4. Grade\n5. Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter marks of 3 subjects: ");
                    m1=sc.nextInt(); m2=sc.nextInt(); m3=sc.nextInt();
                    break;
                case 2:
                    total = m1 + m2 + m3;
                    System.out.println("Total = " + total);
                    break;
                case 3:
                    per = (m1 + m2 + m3) / 3.0;
                    System.out.println("Percentage = " + per);
                    break;
                case 4:
                    if(per >= 90) System.out.println("Grade A");
                    else if(per >= 75) System.out.println("Grade B");
                    else if(per >= 60) System.out.println("Grade C");
                    else System.out.println("Grade D");
                    break;
                case 5: return;
            }
        }
    }
}
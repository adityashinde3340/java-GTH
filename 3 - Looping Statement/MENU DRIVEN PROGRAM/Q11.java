import java.util.*;
class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int units = 0;
        double bill = 0;

        while(true){
            System.out.println("\n1. Enter Units\n2. Calculate Bill\n3. Display Bill\n4. Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter units: ");
                    units = sc.nextInt();
                    break;

                case 2:
                    if(units <= 100) bill = units * 5;
                    else if(units <= 200) bill = 100*5 + (units-100)*7;
                    else bill = 100*5 + 100*7 + (units-200)*10;
                    break;

                case 3:
                    System.out.println("Electricity Bill = ₹" + bill);
                    break;

                case 4: return;
            }
        }
    }
}
import java.util.*;
class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double basic=0, hra=0, da=0, net=0;

        while(true){
            System.out.println("\n1. Enter Basic Salary\n2. Calculate HRA & DA\n3. Net Salary\n4. Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter Basic Salary: ");
                    basic = sc.nextDouble();
                    break;

                case 2:
                    hra = basic * 0.20;
                    da = basic * 0.10;
                    System.out.println("HRA = " + hra);
                    System.out.println("DA = " + da);
                    break;

                case 3:
                    net = basic + hra + da;
                    System.out.println("Net Salary = " + net);
                    break;

                case 4: return;
            }
        }
    }
}
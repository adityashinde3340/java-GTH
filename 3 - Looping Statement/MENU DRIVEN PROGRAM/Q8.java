import java.util.*;
class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n1. First N Even\n2. First N Odd\n3. Fibonacci\n4. Exit");
            int ch = sc.nextInt();

            if(ch == 4) break;

            System.out.print("Enter N: ");
            int n = sc.nextInt();

            switch(ch){
                case 1:
                    for(int i=1;i<=n;i++) System.out.print((2*i)+" ");
                    System.out.println();
                    break;
                case 2:
                    for(int i=0;i<n;i++) System.out.print((2*i+1)+" ");
                    System.out.println();
                    break;
                case 3:
                    int a=0,b=1;
                    for(int i=1;i<=n;i++){
                        System.out.print(a+" ");
                        int c=a+b; a=b; b=c;
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
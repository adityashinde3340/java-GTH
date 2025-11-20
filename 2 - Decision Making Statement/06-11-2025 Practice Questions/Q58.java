import java.util.*;
class Q58{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int balance=0;
    int ch=sc.nextInt();
    switch(ch){
      case 1: int d=sc.nextInt(); balance+=d; System.out.println("Deposited"); break;
      case 2: int w=sc.nextInt(); balance-=w; System.out.println("Withdrawn"); break;
      case 3: System.out.println(balance); break;
      case 4: System.out.println("Exit"); break;
      default: System.out.println("Invalid");
    }
  }
}

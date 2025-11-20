import java.util.*;
class Q62{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    switch(ch){
      case 1:
        int n=sc.nextInt();
        if(n>0) System.out.println("Positive");
        else if(n<0) System.out.println("Negative");
        else System.out.println("Zero");
        break;
      case 2:
        int m=sc.nextInt();
        System.out.println(m%2==0?"Even":"Odd");
        break;
      case 3:
        int x=sc.nextInt(), y=sc.nextInt();
        System.out.println(x>y?x:y);
        break;
      default: System.out.println("Invalid");
    }
  }
}

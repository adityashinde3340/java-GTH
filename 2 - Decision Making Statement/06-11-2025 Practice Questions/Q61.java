import java.util.*;
class Q61{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    int a=sc.nextInt(), b=sc.nextInt();
    switch(ch){
      case 1: System.out.println(a+b); break;
      case 2: System.out.println(a-b); break;
      case 3: System.out.println(a*b); break;
      case 4: System.out.println(a/b); break;
      default: System.out.println("Invalid");
    }
  }
}

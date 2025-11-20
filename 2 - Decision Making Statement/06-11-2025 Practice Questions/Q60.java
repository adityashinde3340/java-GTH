import java.util.*;
class Q60{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int ch=sc.nextInt();
    switch(ch){
      case 1: System.out.println("Burger - Rs 120"); break;
      case 2: System.out.println("Pizza - Rs 250"); break;
      case 3: System.out.println("Pasta - Rs 150"); break;
      case 4: System.out.println("Sandwich - Rs 100"); break;
      default: System.out.println("Invalid");
    }
  }
}

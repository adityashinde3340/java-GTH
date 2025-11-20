import java.util.*;
class Q46{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int X=sc.nextInt();
    double Y=sc.nextDouble();
    if(X%5==0 && X+0.50<=Y){
      Y=Y-(X+0.50);
    }
    System.out.printf("%.2f",Y);
  }
}

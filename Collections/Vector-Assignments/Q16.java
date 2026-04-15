/*

Q17.Create Mobile class:
id
brand
quantity
Store mobiles in Vector and display mobiles with stock less than 10.
Description
Condition:
quantity < 10
Input
1 Samsung 15
2 Vivo 8
3 Oppo 5
4 Apple 20
Output
Low Stock Mobiles:

2 Vivo 8
3 Oppo 5

*/

import java.util.*;
class Mobile{
  private int id;
  private String brand;
  private int quantity;
  
   Mobile(int id , String brand , int quantity){
      this.id = id;
      this.brand = brand;
      this.quantity = quantity;
  }
  
  public void setId(int id){
     this.id = id;
  }
  public int getId(){
     return id;
  }
  
  public void setBrand(String brand){
     this.brand = brand;
  }
  public String getBrand(){
     return brand;
  }
  
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  public int getQuantitiy(){
    return quantity;
  }
  
}
public class Q16{
   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter No of brands : ");
   int size = sc.nextInt();
   int count = 1;
   Vector<Object> v1 = new Vector<>(size , 2);
   for(int i = 0 ; i < size ; i++){
      System.out.println("Enter data for brand number "+count);
      System.out.println();
      System.out.println("Enter id of mobile : ");
      int id = sc.nextInt();
      sc.nextLine();  

      System.out.println("Enter brand of mobile : ");
      String brand = sc.nextLine();  

      System.out.println("Enter Quantity of mobiles : ");
      int quantity = sc.nextInt();
      
      v1.add(new Mobile(id , brand , quantity));
      count++;
   }
   count = 0;
   
  for(Object o:v1){
     Mobile e = (Mobile)o;
     System.out.println(e.getId()+" "+e.getBrand()+" "+e.getQuantitiy());
  }
   
  //v1.add(new Mobile(id , brand , quantitiy));
   
   
   }
}

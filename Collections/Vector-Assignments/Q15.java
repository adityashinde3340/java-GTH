/*
Q15.Create Book class:
bookId
bookName
price
Store books in Vector and calculate total price of all books.
Description
Logical operation:
total = total + price
Input
1 Java 500
2 SQL 350
3 Python 400
Output
Total Book Price = 1250
*/
import java.util.*;
class Book{
   private int bookId;
   private String bookName;
   private int price;
   
   public Book(int bookId , String bookName , int price){
     this.bookId = bookId;
     this.bookName = bookName;
     this.price = price;
   }
   
   public void setId(int bookId){
     this.bookId = bookId;
   }
   public int getId(){
     return bookId;
   }
   
   public void setName(String bookName){
     this.bookName = bookName;
   }
   public String getName(){
     return bookName;
   }
   
   public void setPrice(int price){
     this.price = price;
   }
   public int getPrice(){
     return price;
   }
}
public class Q15{
  public static void main(String x[]){
  Scanner sc = new Scanner(System.in);
  Vector<Object> v1 = new Vector<>();
  System.out.println("Enter number of books : ");
  int size = sc.nextInt();
  Book[] ob = new Book[size];
  int count = 1;
   
  for(int i = 0 ; i < ob.length ; i++){
     System.out.println("Enter data for book no "+count+" : ");
     System.out.println();
     System.out.println("Enter book id : ");
     int id = sc.nextInt();
     
     
     System.out.println("Enter name for book : ");
     String name = sc.nextLine();
     sc.nextLine();
     
     System.out.println("Enter price for book : ");
     int price = sc.nextInt();
    
     ob[i]  = new Book(id , name , price);
     count++;
     v1.add(ob[i]);
     System.out.println();
    
  }
  int total = 0;
  for(Object o:v1){
     Book e = (Book)o;
     total += e.getPrice();
  }
  
  System.out.println("Total price of the books : "+total);
  
  
  }
}


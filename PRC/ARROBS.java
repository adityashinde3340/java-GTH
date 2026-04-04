import java.util.Scanner;
class stud{
  int id;
  String name;
  int marks;
}

public class ARROBS{

   public static void main(String x[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Number of Students : ");
   int n = sc.nextInt();
   stud[] st = new stud[n];
   
   for(int i = 0 ; i < n; i++){
   st[i] = new stud();
       System.out.println("Enter id : ");
       st[i].id = sc.nextInt();
       sc.nextLine();
       System.out.println("Enter name : ");
       st[i].name = sc.nextLine();
       System.out.println("Enter marks : ");
       st[i].marks = sc.nextInt();
        System.out.println("Next Student ->>");
   }
   
   for(int i = 0 ; i < st.length ; i++){
      
      System.out.println("Student ID : "+st[i].id);
      System.out.println("Student Name : "+st[i].name);
      System.out.println("Student Marks : "+st[i].marks);
     
   }
   
   }
}

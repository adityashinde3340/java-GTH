public class MCQ50{
	public static void main(String x[]){
	int a = 1;
if(++a == 2)
    switch(a++) {
        case 2:
            if(a++ == 3)
                System.out.println("First");
            else
                System.out.println("Second");
            break;
        case 3:
            System.out.println("Third"); break;
        default:
            System.out.println("Default");
    }
else
    System.out.println("Else");

System.out.println(a);
	}	
}
public class MCQ44{
	public static void main(String h[]){
		int a = 2, b = 2;
if(--a * b++ == 2)
    if(b++ == 2)
        switch(a * b) {
            case 6: System.out.println("Six"); break;
            case 9: System.out.println("Nine"); break;
            default: System.out.println("Default");
        }
    else
        System.out.println("Fail");
else
    System.out.println("End");

	}
}
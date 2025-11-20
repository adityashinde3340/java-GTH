public class MCQ49{
	public static void main(String x[]){
		int a = 4;
if(a-- > 3)
    if(a++ == 3)
        switch(--a) {
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            default: System.out.println("Other");
        }
    else
        System.out.println("NoSwitch");
else
    System.out.println("Fail");

	}
}
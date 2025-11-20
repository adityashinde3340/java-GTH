public class MCQ45{
	public static void main(String aditya[]){
	int x = 4;
switch(x--) {
    case 3:
        System.out.println("Three"); break;
    case 4:
        if(--x == 3)
            System.out.println("FourThenThree");
        else
            System.out.println("Four");
        break;
    default:
        System.out.println("Default");
}


	}
}
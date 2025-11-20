class MCQ23 {
	public static void main(String x[]){
int a = 5, b = 10;
if(a++ > 5)
    if(++b > 10)
        System.out.println("A");
    else
        System.out.println("B");
else
    if(b-- == 10)
        System.out.println("C");
    else
        System.out.println("D");


	}
}
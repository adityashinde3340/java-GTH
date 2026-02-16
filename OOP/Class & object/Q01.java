/*
1. Create a Class and Print a Message
Create a class HelloWorld with a method printMessage that prints "Hello, World!" when called.
Explanation: Helps understand class and method creation.

*/
class Q01{
	public static void main(String x[]){
		HelloWorld obj = new HelloWorld();
		obj.printMessage();
	}
}

class HelloWorld{ 
	static void printMessage(){
		System.out.println("Hello World ! ");
	}
}
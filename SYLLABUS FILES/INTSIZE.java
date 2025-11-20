public class INTSIZE{
	public static void main(String x[]){
		int intNum1 = Integer.SIZE;
		System.out.println("Size of int is "+intNum1+" bits / "+(intNum1 / 8)+" byte");
		long longNum1 = Long.SIZE;
		System.out.println("Size of long is "+longNum1+" bits / "+(longNum1 / 8)+" byte");
		short shortNum1 = Short.SIZE;
		System.out.println("Size of short is "+shortNum1+" bits / "+(shortNum1 / 8)+" byte");
		byte byteNum1 = Byte.SIZE;
		System.out.println("Size of byte is "+shortNum1+" bits / "+(byteNum1 / 8)+" byte");
	}
}
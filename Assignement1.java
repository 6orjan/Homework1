public class Assignement1 {
	public static void main(String[] args) {
		
		double random_Num = Math.random() * 100;
		int int_part = (int)random_Num;
		double decimal_part = random_Num - int_part; 
		char code = (char)int_part;
		
		System.out.println("From 0 to 100 the number picked is " + random_Num);
		System.out.println("Integer part is " + int_part);
		System.out.println("Decimal part is " + decimal_part);
		System.out.println("ASCII Code for the integer part " + int_part +  " is " + code);
	}

}

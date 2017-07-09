import java.util.Scanner;
public class TypeCsting {

	public static void main(String[] args) {
		//Take six variables as one of each byte, short, int, long, float and double
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		//Initialize only byte and short asking the value from the user.
		Scanner inp = new Scanner(System.in);
		System.out.println(" Enter the value of a : ");
		a = inp.nextByte();
		System.out.println(" Enter the value of b : ");
		b = inp.nextShort();
		//Take byte & short variables and 
		//store their sum in the integer variable and print the sum
		c = a + b;
		System.out.println("c = a + b : " + c);
		//then take short and int and store their addition in a long variable
		d = b + c;
		System.out.println("d = b + c: " + d);
		//then take int and long and store their addition in a float variable
		e = c  + d;
		System.out.println("e = c + d: " + e);
		//then take long and float and store their addition in a double variable
		f = d  + e;
		System.out.println("f = d + e: " + f);
		

	}

}

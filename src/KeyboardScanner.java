import java.util.Scanner;
//import java.math.BigDecimal;

@SuppressWarnings("unused")
public class KeyboardScanner {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter a integer:");
		int i=keyboard.nextInt();
		//System.out.println(i);
		System.out.println("Enter a float point number:");
		double f=keyboard.nextDouble();
		//System.out.println(f);
		System.out.println("Enter a your name:");
		String name=keyboard.next();
		//System.out.println(name);
		//BigDecimal bd2 = new BigDecimal( i * f );
		System.out.printf("Hi "+name+",the multiplication of "+i+" and "+f+" is ");
		System.out.printf("%e",i*f);
	}

}

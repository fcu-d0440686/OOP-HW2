import java.util.Scanner;

public class CheckOddEven {


	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter a integer:");
		int i=keyboard.nextInt();
		if(i%2==1)
			System.out.println("The input integer is Odd Number.");
		else
			System.out.println("The input integer is Even Number.");
	}

	
}

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter a string 1:");
		String one=keyboard.next();
		System.out.println("Enter a string 2:");
		String two=keyboard.next();
		//boolean flag = one.equals(two);
		//System.out.println(flag);
		if(one.equalsIgnoreCase(two))
			System.out.println("The two strings are the same.");
		else
			System.out.println("The two strings are not the same.");
	}

}

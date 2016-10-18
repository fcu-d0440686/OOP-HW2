import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args) {
		int flag=1;
		Scanner keyboard= new Scanner(System.in);
		while(flag==1){
			System.out.println("Enter a string 1:");
			String one=keyboard.next();
			System.out.println("Enter a string 2:");
			String two=keyboard.next();
			if(one.equalsIgnoreCase(two)){
				System.out.println("The two strings are the same.");
				flag=0;
			}
			else{
				System.out.println("The two strings are not the same.");
				flag=1;
			}
		}
	}
}

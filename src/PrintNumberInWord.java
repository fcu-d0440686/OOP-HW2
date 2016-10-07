import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Enter a integer:");
		int i=keyboard.nextInt();
		if(i==1)System.out.println("ONE");
		else if(i==2)System.out.println("TWO");
		else if(i==3)System.out.println("THREE");
		else if(i==4)System.out.println("FOUR");
		else if(i==5)System.out.println("FIVE");
		else if(i==6)System.out.println("SIX");
		else if(i==7)System.out.println("SEVEN");
		else if(i==8)System.out.println("EIGHT");
		else if(i==9)System.out.println("NINE");
		else System.out.println("OTHER");
	}

}


import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		int no;
		int factorial=1;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Enter the number that you want to find the factorail:");
		no = myScanner.nextInt();
		
		for(int i=no; i>0; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+no+"! is "+factorial+".");
	}
}

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){
		int num1 = 1;
		int num2 = 1;
		int nextNum = 0;
		int stop = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number less than 100");
		stop = in.nextInt();
		
		System.out.println("Here is the Fibonacci Sequence up to " + stop);
		System.out.print(num1);
		
		while (num2 < stop) {
		nextNum = num1 + num2;
		num1 = num2;
		num2 = nextNum;
		System.out.print(", " + num1);
		} 
		
		System.out.println(); // Cleans up terminal screen
	}
}

package datastrctures;

import java.util.Scanner;

public class Factorial {
	
	static int product = 1;

	public static int userInput(){

		System.out.println("Enter the number you wish to find the factorial for: ");
		Scanner sc = new Scanner(System.in);
		int out = sc.nextInt();
		sc.close();
		return out;
	}

	public static int factorial(int fact){

		while (fact>=1) {
			product *= fact;
			fact--;
		}
		return product;
	}


	public static void main(String[] args) {

		int out = userInput();
		System.out.println(factorial(out));

	}

}

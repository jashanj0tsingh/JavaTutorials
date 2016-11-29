package JavaTutorials;

import java.util.Random;
import java.util.Scanner;

public class RandomizeArray {

	int j,temp;
	Random rand = new Random();

	public RandomizeArray() {
	}

	public int [] buildArray(int num){

		int [] myArray;

		myArray = new int [num];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements.");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = sc.nextInt();
		}
		sc.close();
		return myArray;
	}

	public void printArray(int [] myArray){
		System.out.print("{ ");
		for (int i = 0; i < myArray.length; i++) {
			if(i!=myArray.length-1)
				System.out.print(myArray[i]+", ");
			else
				System.out.print(myArray[i]);
		}
		System.out.print(" }");
	}

	public void randomizeArray(int [] myArray){

		temp = 0;

		for (int i = 0; i < myArray.length; i++) {
			j = rand.nextInt(myArray.length) + 0;
			System.err.print(j);
			temp = myArray[i];
			myArray[i] = myArray[j];
			myArray[j] = temp;
		}
	}

}

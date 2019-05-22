package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String stringArray[] = {"Hello,", "how", "are", "you", "today?"};
		//2. print the third element in the array
		System.out.println(stringArray[3]);
		//3. set the third element to a different value
		stringArray[3] = "your friends";
		//4. print the third element again
		System.out.println(stringArray[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		//6. make an array of 50 integers
		int intArray[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		int smallestNumber = 100;
		int largestNumber = -100;
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(50);
			if(intArray[i] < smallestNumber) {
				smallestNumber = intArray[i];
			}
			if(intArray[i] > largestNumber) {
				largestNumber = intArray[i];
			}
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println("Smallest Number: " + smallestNumber);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		//10. print the largest number in the array.
		System.out.println("Largest Number: " + largestNumber);
		//bubble sort
		for (int i = 0; i < intArray.length-1; i++) {
			for (int j = i+1; j < intArray.length; j++) {
				if(intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}

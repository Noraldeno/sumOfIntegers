/*Title: Sum of Integers
Description: Reads an integer between 0 and 1000, and sums all of the digits in an integer
Created by: Norald Alejo
Email: Norald.Alejo@gmail.com
Date: 8/27/2016
Version: 1.01
*/
/* Psuedocode
1. Asks user for an integer between 0 and 1000

2. Takes in user input

3. while number / 10 does not equal 0 ->
number / 10
sum + = number % 10

4. Prints sum of all digits in an integer
*/

import java.util.*;

public class SumOfIntegers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		char answer;

		//Ask and takes in user input
		System.out.println("Welcome! Please enter an integer between 0 and 1000.");
		int num = input.nextInt();
		while (true){
			while (num < 0 || num > 1000){
				
				System.out.println("Invalid! Please enter an integer between 0 and 1000.");
				num = input.nextInt();
			}

			System.out.println("You entered: " + num);

			//Finds and adds each digit
			while(num / 10 != 0){
				sum += (num % 10);
				num /= 10;
			}
			sum += (num % 10);

			//Prints out the digits
			System.out.printf("The sum of digits is %d\n", sum);

			//Ask user if they want to add another integer
			System.out.println("Do you want to find the sum of another integer?");
			answer = input.next().charAt(0);
			
			//Breaks if user said y
			if (answer != 'y'){
				break;
			}

			//Ask user again for another integer
			System.out.println("\n---------------------------------------------------------");
			System.out.println("Please enter another integer.");
			num = input.nextInt();
			sum = 0;


		}
		System.out.println("See you later!");
	}

}

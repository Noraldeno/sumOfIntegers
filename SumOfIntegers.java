/*Title: Sum of Integers
Description: Reads an integer between 0 and 1000, and sums all of the digits in an integer
Created by: Norald Alejo
Email: Norald.Alejo@gmail.com
Date: 8/27/2016
Version: 1.00
*/
/* Psuedocode
1. Asks user for an integer between 0 and 1000

2. Takes in user input

3. while number / 10 does not equal 0 ->
number / 10
sum + = number % 10

4. Prints sum of all digits in an integer
*/

import java.util.Scanner;

public class SumOfIntegers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int temp = 0;

		System.out.println("Welcome! Please enter an integer between 0 and 1000");
		int num = input.nextInt();

		while(num / 10 != 0){
			sum += (num % 10);
			num /= 10;
		}
		sum += (num % 10);
		System.out.printf("The sum of integers is %d", sum);
	}

}

package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Solution to PA2a.
 * Provides a program that calculates and displays different
 * calculations of five integers entered by the .
 *
 * It computes: 
 * The sum of all positive numbers
 * The sum of all negative numbers
 * The sum of all five numbers
 * The average of all positive numbers
 * The average of all negative numbers
 * The average of all five numbers
 * 
 * @author Victor Pereira
 */

public class PA2a {

/** 
 * The main method that runs the program.
 * It reads five integers from the user, computes the sums
 * and averages for positive, and negative integers, all integers
 * and then prints the results. 
 * 
 * @param args command-line arguments (not used)
 */
	
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2; 
		int num3; 
		int num4;
		int num5;
		
		//Prompts user for 5 whole numbers
		System.out.printf("Enter five whole numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		
		//Calculates the total sum
		int totalSum = num1 + num2 + num3 + num4 + num5;
		
		int sumPos = 0;
		int sumNeg = 0;
		int countPos = 0;
		int countNeg = 0;
		
		int[] numbers = {num1, num2, num3, num4, num5};
		
		for (int i = 0; i < numbers.length; i = i + 1) {
			int num = numbers[i];
			
			if (num > 0) {
				sumPos = sumPos + num;
				countPos = countPos + 1;
			}
			else {
				sumNeg = sumNeg + num;
				countNeg = countNeg + 1;
			}
		}
		
		//Calculate the averages
		double averagePos;
		if (countPos > 0) {
			averagePos = (double) sumPos / countPos;
		}
		else {
			averagePos = 0.0;
		}
		
		double averageNeg;
		if (countNeg > 0) {
			averageNeg = (double) sumNeg / countNeg;
		}
		else {
			averageNeg = 0.0;
		}
		
		double averageAll = (double) totalSum / 5;
		
		//Results
		if (countPos == 1) {
			 System.out.printf("The sum of the %d positive number: %d%n", countPos, sumPos);
		} 
		else {
			 System.out.printf("The sum of the %d positive numbers: %d%n", countPos, sumPos);
		}
		if (countNeg == 1) {
			 System.out.printf("The sum of the %d non-positive number: %d%n", countNeg, sumNeg);
		}
		else {
			 System.out.printf("The sum of the %d non-positive numbers: %d%n", countNeg, sumNeg);
		}
		System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
		if (countPos == 1) {
			 System.out.printf("The average of the %d positive number: %.2f%n", countPos, averagePos);
		}
		else {
			 System.out.printf("The average of the %d positive numbers: %.2f%n", countPos, averagePos);
		}
		if (countNeg == 1) {
			 System.out.printf("The average of the %d non-positive number: %.2f%n", countNeg, averageNeg);
		}
		else {
			 System.out.printf("The average of the %d non-positive numbers: %.2f%n", countNeg, averageNeg);
		}
		
		System.out.printf("The average of the 5 numbers: %.2f%n", averageAll);
		
		input.close();
	}
	
}

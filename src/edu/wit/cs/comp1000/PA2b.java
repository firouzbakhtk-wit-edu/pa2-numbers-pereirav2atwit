package edu.wit.cs.comp1000;

import java.util.Scanner;

/**
 * Solution to PA2b.
 * Provides a program that solves a quadratic equation
 * of the form ax^2 + bx + c = 0.
 * Takes user input for a, b, and c, then calculates 
 * the discriminant to detremine the nature of the roots.
 * 
 * If the disriminant is negative it prints "Roots: imaginary".
 * If zero, it prints one real root.
 * If positive, it prints two real roots.
 * 
 * @author Victor Pereira
 */

public class PA2b {

/**
 * The main method that runs the program.
 * It reads coefficients a, b, and c, calculates the discriminant, and then
 * determines whether the roots are imaginary, a single real root,
 * or two real roots. 
 * 
 * @param args command-line arguments (not used)
 */
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		
		// Prompts user for coefficients a, b, and c
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		// Calculates the discriminant
		double discriminant = b*b - 4*a*c;
		
		if (discriminant < 0 ) {
			System.out.printf("Roots: imaginary%n");
		}
		else if (discriminant == 0) {
			double root = -b / (2*a);
			System.out.printf("Root: %.2f%n", root);
		}
		else {
			double sqrtDiscriminant = Math.sqrt(discriminant);
			double root1 = (-b - sqrtDiscriminant) / (2*a);
			double root2 = (-b + sqrtDiscriminant) / (2*a);
	
		
		// Print roots
		System.out.printf("Roots: %.2f, %.2f%n", Math.min(root1, root2), Math.max(root1, root2));
		}
		input.close();
	}

}

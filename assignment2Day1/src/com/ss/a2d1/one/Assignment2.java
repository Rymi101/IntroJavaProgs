/**
 * 
 */
package com.ss.a2d1.one;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Ryan.Michels
 *
 */
public class Assignment2 {

	Random random = new Random();
	private int numGuesses = 0;
	private int randNum = random.nextInt(99) + 1;

	public Assignment2() {
		int above = randNum + 10;
		int below = randNum - 10;

		while (numGuesses < 5) {
			numGuesses++;
			

			int num = enterNum();

			if (num == randNum) {

				System.out.println("The correct number was: " + randNum);
				System.exit(0);
			}

			else if (num >= below && num < above) {

				System.out.println("Please guess again.");
			}
			
			else {
				System.out.println("Sorry, you've failed to guess the correct number. The correct number was: " + randNum);
				System.exit(0);
			}
		}
		
		

	}

	public int enterNum() {

		Scanner input = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a number between 1 and 100 (inclusive). \n");
		int num = input.nextInt(); // Read user input

		while (num < 1 || num > 100) {
			System.out.println("Please enter another number that is between 1 and 100 inclusive.");

			num = input.nextInt(); // Read user input
		}

		return num;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Assignment2 a2 = new Assignment2();

	}

}

/**
 * 
 */
package com.ss.a1d2;

import java.util.Scanner;

/**
 * @author Ryan.Michels
 *
 */
public class Assignment1 {
	
	
	private Scanner input = new Scanner(System.in);
	private static int result = 0;
	private Integer num1 = 0;

	
	public Assignment1() {
		System.out.println("What operation would you like to do? (add, sub, mult, div)");
		
		String pref = input.nextLine();
		
		System.out.println("How many numbers would you like to enter?");
		
		num1 = input.nextInt();
		
		userInput(num1, pref);
	}

	
	//based on the user preference, this program will add/sub etc. numbers until the amount of numbers being entered is satisfied
	public void userInput(int x, String pref) {
		
		if(pref.equals("add")) {
			for(int counter = 0; counter < x; counter++) {
				System.out.println("\nPlease enter a value");
				num1 = input.nextInt();
				
				result += num1; 
			}
		}
		
		else if(pref.equals("sub")) {
			/**note: if you dont put this preliminary code before the loop, then there wont be an initial value to subtract from.
			 Instead, It'll subtract the inital value from 0.
			  */
			 
			System.out.println("\nPlease enter a value");
			num1 = input.nextInt();
			result = num1;
			
			for(int counter = 1; counter < x; counter++) {
				System.out.println("\nPlease enter a value");
				num1 = input.nextInt();
				
				result -= num1; 
			}
		}

		else if(pref.equals("mult")) {
			System.out.println("\nPlease enter a value");
			num1 = input.nextInt();
			
			result = num1;
			
			for(int counter = 1; counter < x; counter++) {
				System.out.println("\nPlease enter a value");
				num1 = input.nextInt();
				
				result *= num1; 
			}
		}
		
		else if(pref.equals("div")) {
			System.out.println("\nPlease enter a value");
			num1 = input.nextInt();
			
			result = num1;
			
			for(int counter = 1; counter < x; counter++) {
				System.out.println("\nPlease enter a value");
				num1 = input.nextInt();
				while(num1 == 0) {
					System.out.println("\nCan't divide by 0. Please enter a different number...");
					num1 = input.nextInt();
				}
				result = result / num1; 
			}
		}
		//print out the result
		System.out.println("\nThe result of your numbers was: " + result + ".");
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Assignment1 a = new Assignment1();
		
	}

}

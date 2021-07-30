/**
 * 
 */
package com.ss.a1d1.one;

/**
 * @author Ryan.Michels
 *
 */
public class Assignment1 {

	//counts iterations
	int counter = 0;
	String stars = "";
	String spaces = "";

	//first iteration, only a half diamond
	public void incrementHalf() {

		counter++;

		System.out.println(counter + ")");

		for (int i = 0; i < 4; i++) {
			stars = stars + "*";
			System.out.println(stars);
		}

		System.out.println(".........");
	}

	//second iteration, fourth quadrant of the diamond.
	public void decrementHalf() {

		counter++;

		System.out.println(counter + ")");

		System.out.println("..........");
		System.out.println(stars);

		for (int i = 3; i != 0; i--) {
			stars = "";

			for (int x = 0; x < i; x++) {
				stars = stars + "*";
			}

			System.out.println(stars);

		}
	}

	
	//3rd iteration, top half of the diamond
	public void increment() {

		counter++;

		System.out.println(counter + ")");

		stars = "*";
		spaces = "     ";

		System.out.print(spaces);
		System.out.println(stars);

		for (int i = 0; i < 3; i++) {
			spaces = "";

			for (int numSpaces = 4; numSpaces > i; numSpaces--) {
				spaces = spaces + " ";
			}

			stars = stars + "**";
			System.out.print(spaces);
			System.out.println(stars);

		}
		
		System.out.println("...........");


}
	
	//4th iteration, bottom half of the diamond
	public void decrement() {

		counter++;

		System.out.println(counter + ")");

		System.out.println("............");

		for (int i = 0; i <= 3; i++) {
			spaces = "";
			stars = "*";

			for (int numSpaces = 0; numSpaces <= i + 1; numSpaces++) {
				spaces = spaces + " ";
			}

			for (int numSpaces = 3; numSpaces > i; numSpaces--) {
				stars = stars + "**";
			}
			
			System.out.print(spaces);
			System.out.println(stars);

		}
	}


	public Assignment1() {
		incrementHalf();
		decrementHalf();
		increment();
		decrement();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 a1 = new Assignment1();

	}

}

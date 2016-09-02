package addTwoNumbers;

import java.util.Scanner;

public class addTwoNumbers {
/**@author Max Smith
 * 
 * This class contains three methods,
 * 		The main method is called on startup where it defines a double variable called "sumOfNumber" then sets it to the parameters retured within the input method.
 *		The double value is then displayed in the console to confirm the action has taken place.
 *
 *		The Input method is set as a double so it can return a double value for "sumOfNumber", the input method creates a new scanner allowing the user to input their own
 *		numbers. It then requests two numbers from the user, storing them as double variables "numberA" and "numberB". The scanner is then closed for memory saving purposes.
 *		a new variable "numberC" is then defined and set to the returning parameters of the "calculation" method ensuring that variables "numberA" and "numberB" are passed
 *		through for reference. Once the parameters have been returned and "numberC" has a set value, it then returns back through to the main method for further action.
 *
 *		The calculations method is also set as a double to allow double values to be returned through it. It also takes the two double variables passed through the input method
 *		and adds them together. the sum of both numbers is stored as a seperate variable allowing all numbers to potentially be modified if needed. (If you wish to save
 *		space the calculations and input methods can also come to the same conclusion using only two variables.) Once it has been stored, it returns back into the input
 *		method for further action.
 * 
 */
	
	public static void main(String[] args) {
		double sumOfNumber = input();
		System.out.println("Your number = " + sumOfNumber);
	}
	
	public static double input(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number 1:");
		double numberA = in.nextInt();
		System.out.println("Enter number 2:");
		double numberB = in.nextInt();
		in.close();
		
		double numberC = calculation(numberA, numberB);
		return numberC;
	}
	
	public static double calculation(double numberA, double numberB ){
		double numberC = numberA + numberB;		
		return numberC;
	}

}

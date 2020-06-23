/****************************************************************************
 *
 * Created by: Chris Asante
 * Date : June 2020
 * Created for : ICS4U
 * Numeric pattern program
 *
 ****************************************************************************/
 
import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) { 		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer below 15: ");
		if(input.hasNextInt()) {
			int userNum = input.nextInt();
			String numPattern = symmetricPattern(userNum);		
			System.out.print(numPattern);
		}
		else {
			System.out.println("Error");
		}
	}
	
	public static String symmetricPattern(int num) {

		String output = "";
		String nextOuput;
		
		if(num >= 15 || num < 1) {
			output = "Error";
			return output;
		}
		else if(num == 1) {
			output = " 1 ";
			return output;
		}
		else {
			nextOuput = symmetricPattern(num - 1);
			if(num <= 5) {
				output = nextOuput + num + nextOuput;
			}
			else {
				output = nextOuput + num + "\n" + nextOuput;
			}
			return output;
		}
	}
}
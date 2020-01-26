/*Feature: Sum of all digits typed
 * As a user I want the program to sum all digits of a integer number
 * 
 * Scenario: Summing
 *	 	Given given that I enter a number
 * 		When that program ask for a number
 * 		Then then I type a number
 * 		And I press Ok
 * 		Then program will print the result of the sum aff all digits.
*/

package challenge;

import javax.swing.JOptionPane;

public class SessionOne_II {

	public static void main(String[] args) {
		
		Integer sum = 0;
		
		char[] number = JOptionPane.showInputDialog("Type a number:").toCharArray();
		
		for (char value : number) {
			sum = sum + Character.getNumericValue(value);
		}
		JOptionPane.showInternalMessageDialog(null, "The sum of all digits is:   " + sum);
	}

}

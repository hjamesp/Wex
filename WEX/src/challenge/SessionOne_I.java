/*Feature: Numbers divisible by 3 that contains 5 in it
 * As a user I want the program to print "Cira" when a number is divisible by 3
 * And print "Dinha" when the number contains 5 in it
 * And print "CiraDinha" when a number is divisible by 3 and contains 5 in it
 * 
 * Scenario: Divisible by 3
 *	 	Given given that I enter a number
 * 		When that program ask for a number
 * 		Then then I type a number
 * 		And I press Ok
 * 		When the number is divisible by 3 
 * 		Then program will print "Cira".
 * Scenario: The number contain 5 in it
 * 		Given given that I enter a number
 * 		When that program ask for a number
 * 		Then then I type a number
 * 		And I press Ok
 * 		When the number contains 5 in it 
 * 		Then program will print "Dinha".
 * Scenario: The number is divisible by 3 and contain 5 in it
 * 		Given given that I enter a number
 * 		When that program ask for a number
 * 		Then then I type a number
 * 		And I press Ok
 * 		When the number is divisible by 3 and contains 5 in it 
 * 		Then program will print "CiraDinha".
 * Scenario: The number isn't divisible by 3 and don't contain 5 in it
 * 		Given given that I enter a number
 * 		When that program ask for a number
 * 		Then then I type a number
 * 		And I press Ok
 * 		When the number isn't divisible by 3 and don't contains 5 in it 
 * 		Then program will print "The number typed it's not divisible by 3 and don't contains 5 in it.".
 */

package challenge;

import javax.swing.JOptionPane;

public class SessionOne_I {
	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        Long number;
        String parameter;
        boolean containsFive = false;
 
        //System.out.println("Type a number: ");
        number = Long.parseLong(JOptionPane.showInputDialog("TYPE A NUMBER: "));
        parameter = Long.toString(number);
        
        for (int i = 0; i < parameter.length(); i++) {
        	if(parameter.charAt(i) == '5') {
        		containsFive = true;
        		break;
        	}
		}
        if(number % 3 == 0 && containsFive == true){
      	  JOptionPane.showInternalMessageDialog(null, "CiraDinha");
        }
        else if(number % 3 == 0){
            JOptionPane.showInternalMessageDialog(null, "Cira");
        }  
        else if(containsFive) {
        	  JOptionPane.showInternalMessageDialog(null, "Dinha");
        } 
        else
        	JOptionPane.showInternalMessageDialog(null, "The number typed it's not divisible by 3 and don't contains 5 in it.");
    }
}

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
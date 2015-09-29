package input.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input output.
 * @author droc6148
 *
 */
public class PopupDisplay
{	
	/**
	 * Provides a popup box for asking a question and allows the user to submia text answer.
	 * Returns the user response as a String.
	 * @param input The supplied question for the popup.
	 * @return he user's answer to the supplied question
	 */
	
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	/**
	 * Shows the dialog that the user put in the popup box.
	 * @param input
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}

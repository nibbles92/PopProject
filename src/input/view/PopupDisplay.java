package input.view;

import javax.swing.JOptionPane;
/**
 * This class provides popups for input output.
 * @author droc6148
 *
 */
public class PopupDisplay
{
	
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What is you birthday? \nEX:1/25");
		if (birthday.equals("2/18")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
JOptionPane.showMessageDialog(null, "Happy Unbirthday!");		
		}
		}
	
	}



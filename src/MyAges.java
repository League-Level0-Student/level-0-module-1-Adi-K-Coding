import javax.swing.JOptionPane;

public class MyAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String age="";
age =JOptionPane.showInputDialog("What is your age?");
	int agenum=Integer.parseInt(age)	;
		for (int i = 0; i < agenum+1; i++) {
	JOptionPane.showMessageDialog(null,"Youare"+i+"yarsold.");
}
	}
	
	}



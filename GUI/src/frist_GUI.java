import javax.swing.JOptionPane;
public class frist_GUI {

	public static void main(String[] args){
		
		String fn=JOptionPane.showInputDialog("Enter the Frist Number=");
		String sn=JOptionPane.showInputDialog("Enter the Second Number=");
		
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		int sum=num1+num2;
		
		JOptionPane.showMessageDialog(null,"the answar is="+sum,"sum of the numbers",JOptionPane.PLAIN_MESSAGE);

	}
}

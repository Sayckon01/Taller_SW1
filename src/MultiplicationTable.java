import javax.swing.*;
public class MultiplicationTable {
	public static void main(String []args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Tabla de multiplicar\nIngrese un numero"));
		String result = "Tabla del "+number;
		for (int i = 1; i<=10; i++) {
			result = result + "\n"+number+" X "+i+" = " + number*i;
		}
		JOptionPane.showMessageDialog(null, result);
	}
}

import javax.swing.JOptionPane;
public class FactorialCalculator {

	public static void main(String[] args) {
		int factorial = 1;
		JOptionPane.showMessageDialog(null, "Calculador del factorial de un numero");
		int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para conocer su factorial"));
		for (int i=1; i<=number; i++ ) {
			factorial*=i;
		}
		JOptionPane.showMessageDialog(null,"El factorial de "+number+" es: "+factorial);
	}

}

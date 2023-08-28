import javax.swing.JOptionPane;
public class CalculadoraDeFactorial {

	public static void main(String[] args) {
		int factorial = 1;
		JOptionPane.showMessageDialog(null, "Calculador del factorial de un numero");
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para conocer su factorial"));
		for (int i=1; i<=numero; i++ ) {
			factorial*=i;
		}
		JOptionPane.showMessageDialog(null,"El factorial de "+numero+" es: "+factorial);
	}

}

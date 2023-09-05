import javax.swing.JOptionPane;
public class OddEvenChecker {
	public static void main(String[] args) {
		int number;
		JOptionPane.showMessageDialog(null, "Verificador de numeros pares e impares\npresione aceptar para continuar...");
		number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		if (number%2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero " + number + " es par");
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero " + number + " es impar");
		}
	}
}

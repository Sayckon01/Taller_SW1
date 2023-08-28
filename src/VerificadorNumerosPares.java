import javax.swing.JOptionPane;
public class VerificadorNumerosPares {
	public static void main(String[] args) {
		int numero;
		JOptionPane.showMessageDialog(null, "Verificador de numeros pares e impares\npresione aceptar para continuar...");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		if (numero%2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero "+numero+" es par");
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero "+numero+" es impar");
		}
	}
}

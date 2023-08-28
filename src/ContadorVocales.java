import javax.swing.JOptionPane;
public class ContadorVocales {

	public static void main(String[] args) {
		int contador = 0;
		JOptionPane.showMessageDialog(null, "Contador de vocales");
		String entrada = JOptionPane.showInputDialog("Ingrese una cadena de texto").toLowerCase();
		for (int i = 0; i<entrada.length();i++) {
			if (entrada.charAt(i) == 'a' || entrada.charAt(i)=='e' || entrada.charAt(i) == 'i' || entrada.charAt(i)=='o' || entrada.charAt(i)=='u') {
				contador++;
			}
		}
		JOptionPane.showMessageDialog(null, entrada+" tiene "+contador+" vocales");
	}

}

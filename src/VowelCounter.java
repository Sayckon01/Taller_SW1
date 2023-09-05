import javax.swing.JOptionPane;
public class VowelCounter {

	public static void main(String[] args) {
		int counter = 0;
		JOptionPane.showMessageDialog(null, "Contador de vocales");
		String input = JOptionPane.showInputDialog("Ingrese una cadena de texto").toLowerCase();
		for (int i = 0; i<input.length();i++) {
			if (input.charAt(i) == 'a' || input.charAt(i)=='e' || input.charAt(i) == 'i' || input.charAt(i)=='o' || input.charAt(i)=='u') {
				counter++;
			}
		}
		JOptionPane.showMessageDialog(null, input+" tiene "+counter+" vocales");
	}

}

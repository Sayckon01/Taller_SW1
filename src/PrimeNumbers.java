import javax.swing.JOptionPane;

public class PrimeNumbers {

	public static void main(String[] args) {
		int number,counter;
		counter = 1;
		JOptionPane.showMessageDialog(null, "Verificador de numeros primos");
		number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		for (int i = 2; i<=number; i++) {
			if (number%i==0) {
				counter++;
			}
		}
		if(counter == 2) {
			JOptionPane.showMessageDialog(null, "El numero "+number+" si es un numero primo");
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero "+number+" no es un numero primo");
		}

	}

}

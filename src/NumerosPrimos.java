import javax.swing.JOptionPane;

public class NumerosPrimos {

	public static void main(String[] args) {
		int numero,acumulador;
		acumulador = 1;
		JOptionPane.showMessageDialog(null, "Verificador de numeros primos");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		for (int i = 2; i<=numero; i++) {
			if (numero%i==0) {
				acumulador++;
			}
		}
		if(acumulador == 2) {
			JOptionPane.showMessageDialog(null, "El numero "+numero+" si es un numero primo");
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero "+numero+" no es un numero primo");
		}

	}

}

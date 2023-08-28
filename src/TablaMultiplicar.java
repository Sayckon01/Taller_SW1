import javax.swing.*;
public class TablaMultiplicar {
	public static void main(String []args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Tabla de multiplicar\nIngrese un numero"));
		String resultado = "Tabla del "+num;
		for (int i = 1; i<=10; i++) {
			resultado = resultado + "\n"+num+" X "+i+" = " + num*i;
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}

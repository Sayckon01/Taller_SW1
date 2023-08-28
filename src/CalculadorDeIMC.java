import javax.swing.JOptionPane;
public class CalculadorDeIMC {

	public static void main(String[] args) {
		double altura,peso,imc;
		JOptionPane.showMessageDialog(null, "Calculadora de IMC");
		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en Metros"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en Kilogramos"));
		imc= peso / (altura*altura);
		JOptionPane.showMessageDialog(null, "Su IMC es: "+imc);
	}

}

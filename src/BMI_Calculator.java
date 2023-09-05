import javax.swing.JOptionPane;
public class BMI_Calculator {

	public static void main(String[] args) {
		double height,weight,bmi;
		JOptionPane.showMessageDialog(null, "Calculadora de IMC");
		height = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en Metros"));
		weight = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso en Kilogramos"));
		bmi= weight / (height*height);
		JOptionPane.showMessageDialog(null, "Su IMC es: "+bmi);
	}

}

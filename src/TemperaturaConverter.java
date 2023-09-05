import javax.swing.*;
public class TemperaturaConverter {

	public static void main(String[] args) {
		double celcius,farenheit, degrees;
		JOptionPane.showMessageDialog(null, "                 Bienvenido\nConvertir grados C° a F° o F° a C°");
		String option = JOptionPane.showInputDialog("¿Desea convertir grados a (F) Farenheit (C) Celcius\n Ingrese la letra correspondiente.").toUpperCase();
		if (option.equals("F")) {
			degrees = Double.parseDouble(JOptionPane.showInputDialog("Convertir grados Celcius a Farenheit\nIngrese la temperatura en C°"));
			farenheit = degrees*9/5+32;
			JOptionPane.showMessageDialog(null, degrees+"C°"+" equivale a: "+farenheit+"F°");
		}
		else if (option.equals("C")) {
			degrees = Double.parseDouble(JOptionPane.showInputDialog("Convertir grados Farenheit a Celcius\nIngrese la temperatura en F°"));
			celcius = (degrees-32)*5/9;
			JOptionPane.showMessageDialog(null, degrees+"F°"+" equivale a: "+celcius+"C°");
		}
		
		else {
			JOptionPane.showMessageDialog(null,option+" Esta opcion no es valida, solo es valido la letra F para (Farenheit) o C para (Celcius), vuelve a intentarlo mas tarde");
		}
	}

}

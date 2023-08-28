import javax.swing.*;
public class TemperaturaConverter {

	public static void main(String[] args) {
		double celcius,farenheit, grados;
		JOptionPane.showMessageDialog(null, "                 Bienvenido\nConvertir grados C° a F° o F° a C°");
		String opcion = JOptionPane.showInputDialog("¿Desea convertir grados a (F) Farenheit (C) Celcius\n Ingrese la letra correspondiente.").toUpperCase();
		if (opcion.equals("F")) {
			grados = Double.parseDouble(JOptionPane.showInputDialog("Convertir grados Celcius a Farenheit\nIngrese la temperatura en C°"));
			farenheit = grados*9/5+32;
			JOptionPane.showMessageDialog(null, grados+"C°"+" equivale a: "+farenheit+"F°");
		}
		else if (opcion.equals("C")) {
			grados = Double.parseDouble(JOptionPane.showInputDialog("Convertir grados Farenheit a Celcius\nIngrese la temperatura en F°"));
			celcius = (grados-32)*5/9;
			JOptionPane.showMessageDialog(null, grados+"F°"+" equivale a: "+celcius+"C°");
		}
		
		else {
			JOptionPane.showMessageDialog(null,opcion+" Esta opcion no es valida, solo es valido la letra F para (Farenheit) o C para (Celcius), vuelve a intentarlo mas tarde");
		}
	}

}

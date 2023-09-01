import javax.swing.JOptionPane;
public class DescuentoCalculator {

	public static void main(String[] args) {
		double precio,descuento,valorDescuento,total;
		JOptionPane.showMessageDialog(null, "      Calculadora de descuentos\npresione aceptar para continuar...");
		precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
		descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el % de descuento del producto"));
		descuento/=100;
		valorDescuento = precio*descuento;
		total=precio-valorDescuento;
		JOptionPane.showMessageDialog(null, "Precio: $"+precio+"\nDescuento "+(descuento*100)+"%: $"+valorDescuento+"\nTotal a pagar: $"+total);

	}

}

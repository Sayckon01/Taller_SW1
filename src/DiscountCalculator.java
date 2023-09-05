import javax.swing.JOptionPane;
public class DiscountCalculator {

	public static void main(String[] args) {
		double price,discount,discountValue,total;
		JOptionPane.showMessageDialog(null, "      Calculadora de descuentos\npresione aceptar para continuar...");
		price = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
		discount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el % de descuento del producto"));
		discount/=100;
		discountValue = price*discount;
		total=price-discountValue;
		JOptionPane.showMessageDialog(null, "Precio: $"+price+"\nDescuento "+(discount*100)+"%: $"+discountValue+"\nTotal a pagar: $"+total);

	}

}


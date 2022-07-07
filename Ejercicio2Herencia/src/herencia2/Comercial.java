package herencia2;

public class Comercial extends Empleado {
	private int num_ventas;
	public static double imp_venta = 45.90;

	// Un constructor sin par�metros que establezca el numero de ventas en 0
	public Comercial() {
		super();
		this.num_ventas = 0;
	}

	// Otro constructor que establezca todos los atributos, incluidos los heredados
	// de la superclase.
	public Comercial(String nombre, String apellido, int edad, double salario, int antiguedad, int num_ventas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.num_ventas = num_ventas;
	}

	// Sobrescribe el m�todo toString para mostrar por pantalla los datos de un
	// Comercial
	@Override
	public String toString() {
		return "Comercial [num_ventas=" + num_ventas + super.toString() + "]";
	}

	// A�ade el m�todo contabilizaVentas que le pase un par�metro con la cantidad de
	// ventas que ha hecho en un d�a, solo se podr�n contabilizar un m�ximo de 7
	// ventas en un d�a y un m�ximo de 25.
	public int contabilizaVentas(int ventas) {
		 //return Math.min(this.num_ventas+Math.min(ventas,7),25);
		if (ventas > 7)
			ventas = 7;

		this.num_ventas = this.num_ventas + ventas;

		if (this.num_ventas > 25)
			this.num_ventas = 25;

		return this.num_ventas;
	}

	// A�ade el m�todo reseteaContadorVentas que coloca el contador de ventas a 0.
	public void reseteaContador() {
		this.num_ventas = 0;
	}

	// Sobrescribe el m�todo calculaSalario para que adem�s del salario calculado se
	// le a�ada la cantidad ganada en comisiones
	@Override
	public double calculaSalario() {

		return ((this.num_ventas * Comercial.imp_venta) + super.calculaSalario());
	}

	public int getNum_ventas() {
		return num_ventas;
	}
}

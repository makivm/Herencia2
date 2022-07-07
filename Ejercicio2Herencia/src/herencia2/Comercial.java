package herencia2;

public class Comercial extends Empleado {
	private int num_ventas;
	public static double imp_venta = 45.90;

	// Un constructor sin parámetros que establezca el numero de ventas en 0
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

	// Sobrescribe el método toString para mostrar por pantalla los datos de un
	// Comercial
	@Override
	public String toString() {
		return "Comercial [num_ventas=" + num_ventas + super.toString() + "]";
	}

	// Añade el método contabilizaVentas que le pase un parámetro con la cantidad de
	// ventas que ha hecho en un día, solo se podrán contabilizar un máximo de 7
	// ventas en un día y un máximo de 25.
	public int contabilizaVentas(int ventas) {
		 //return Math.min(this.num_ventas+Math.min(ventas,7),25);
		if (ventas > 7)
			ventas = 7;

		this.num_ventas = this.num_ventas + ventas;

		if (this.num_ventas > 25)
			this.num_ventas = 25;

		return this.num_ventas;
	}

	// Añade el método reseteaContadorVentas que coloca el contador de ventas a 0.
	public void reseteaContador() {
		this.num_ventas = 0;
	}

	// Sobrescribe el método calculaSalario para que además del salario calculado se
	// le añada la cantidad ganada en comisiones
	@Override
	public double calculaSalario() {

		return ((this.num_ventas * Comercial.imp_venta) + super.calculaSalario());
	}

	public int getNum_ventas() {
		return num_ventas;
	}
}

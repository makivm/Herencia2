package herencia2;

public class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	protected double salario;
	private int antiguedad;

	public static final double factorTrienio1 = 0.05;
	public static final double factorTrienio2 = 0.08;

// Constructor sin parámetros
	public Empleado() {
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.salario = 0.0;
		this.antiguedad = 0;

	}

	// Constructor con los cuatro parámetros
	public Empleado(String nombre, String apellido, int edad, double salario, int antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}

	// Constructor de copia
	public Empleado(Empleado e) {
		this.nombre = e.nombre;
		this.apellido = e.apellido;
		this.edad = e.edad;
		this.salario = e.salario;
		this.antiguedad = e.antiguedad;
	}

	// Métodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	// Sobreescribe el método toString
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ ", antiguedad=" + antiguedad + "]";
	}

	// Método calculaTrienios que devuelva el importe que cobra en concepto de
	// trienios. Se calcula de la siguiente manera: cada 3 años se le añade un 5%
	// más de salario, pero si lleva más de 5 trienios se le suma por cada trienio
	// un 8%
	public double calculaTrienios() {
		double imp_trienios = 0;
		int trienios = this.antiguedad / 3;
		double sal = this.salario;

		for (int i = 1; i <= trienios; i++) {
			sal = this.salario + imp_trienios;

			if (i <= 5) {
				imp_trienios = imp_trienios + (factorTrienio1 * sal);

			} else
				imp_trienios = imp_trienios * (factorTrienio2 * sal);
		}

		return imp_trienios;
	}

	// CalculaSalario. Devolverá la cantidad de salario del empleado sumándole lo
	// que se lelva por trienios
	public double calculaSalario() {
		return this.salario + this.calculaTrienios();

	}

}

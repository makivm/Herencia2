package herencia2;

public class Repartidor extends Empleado {
	private String zona;
	private String matricula;
	private int kmInicioMes;
	private int kmFinMes;
	private double dietas;

	// Constructor sin parámetros
	public Repartidor() {
		super();
		this.zona = "";
		this.matricula = "";		
	}

	// Constructor con todos los parámetros invocando a la superclase
	public Repartidor(String nombre, String apellido, int edad, double salario, int antiguedad, String zona,
			String matricula, int kmInicioMes, int kmFinMes, double dietas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.zona = zona;
		this.matricula = matricula;
		this.kmInicioMes = kmInicioMes;
		this.kmFinMes = kmFinMes;
		this.dietas = dietas;
	}

	// Constructor de copia
	public Repartidor(Repartidor r) {
		super(r);
		this.zona = r.zona;
		this.matricula = r.matricula;
		this.kmInicioMes = r.kmInicioMes;
		this.kmFinMes = r.kmFinMes;
		this.dietas = r.dietas;
	}

	// Sobrescribe el método toString
	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", matricula=" + matricula + ", kmInicioMes=" + kmInicioMes + ", kmFinMes="
				+ kmFinMes + ", dietas=" + dietas + ", toString()=" + super.toString() + "]";
	}

	// Crea los getters y setter salvo el de dietas y kilómetros
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getDietas() {
		return dietas;
	}

	public int getKmInicioMes() {
		return kmInicioMes;
	}

	public int getKmFinMes() {
		return kmFinMes;
	}

	// Añade el método añadirDieta que se le pasa el importe de la dieta y se sumará
	// al cómputo total, aunque la empresa sólo paga hasta un máximo de 25 euros por
	// dieta, el resto lo debe asumir el empleado.
	public void añadirDieta(double d) {
		
		//return this.dietas+(Math.min(d,25));
		if (d > 25)
			d = 25;

		this.dietas = this.dietas + d;
	}

	// Añade el método actualizaKms que le pasa el nuevo valor del cuentakilómetros
	// de la furgoneta, sólo deberá actualizarse si el dato actualizado es superior
	// al anterior almacenado.
	public void actualizakms(int km) {
		if (km > this.kmFinMes)
			this.kmFinMes = km;
	}

	// Sobrescribe el método calculaSalario para calcular el salario del Repartidor,
	// que se calcula como su salario base + los gastos que ha tenido en dietas y
	// más 0.45*km por lo km que ha hecho en el mes. Los repartidores no disfrutan
	// de trienios.
	@Override
	public double calculaSalario() {
		return (this.salario + this.dietas + (0.45 * (this.kmFinMes - this.kmInicioMes)));

	}
	
	
	//FUNCIONES AMPLIADAS
	public void reiniciarDietas() {
		this.dietas=0;
	}
	
	public void reiniciarKM() {
		this.kmInicioMes=this.kmFinMes;
	}

}

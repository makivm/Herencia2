package herencia2;

public class ppal {

	public static void main(String[] args) {

		// Creacion y cumulo de ventas mensuales comercial C1
		System.out.println(
				"__________________________________________________________________________________________________________________________________\n\n		COMERCIAL C1: CREACION,ACUMULACION VENTAS Y SALARIO AL INICIO Y FIN DE MES\n__________________________________________________________________________________________________________________________________");
		Comercial c1 = new Comercial("Juan", "Lopez", 38, 1800, 9, 5);
		System.out.println("Se crea el comercial c1:\n" + c1);
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 8 ventas diarias a COMERCIAL c1.\nVentas anteriores:" + c1.getNum_ventas()
				+ ".\nVentas actuales: " + c1.contabilizaVentas(8));
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 7 ventas diarias a COMERCIAL c1.\nVentas anteriores:" + c1.getNum_ventas()
				+ ".\nVentas actuales: " + c1.contabilizaVentas(7));
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 5 ventas diarias a COMERCIAL c1.\nVentas anteriores:" + c1.getNum_ventas()
				+ ".\nVentas actuales: " + c1.contabilizaVentas(5));
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 3 ventas diarias a COMERCIAL c1.\nVentas anteriores:" + c1.getNum_ventas()
				+ ".\nVentas actuales: " + c1.contabilizaVentas(3));
		System.out.println(
				"\n			-------------------------------------------------------------------------------\n					TOTAL VENTAS MENSUALES COMERCIAL C1: "
						+ c1.getNum_ventas()
						+ "\n			-------------------------------------------------------------------------------\n");

		// Prueba reseteaContador() de ventas,calculaTrienio y calculaSalario
		System.out.println("\n	*******  AL FINALIZAR EL MES (DIA 30), EL COMERCIAL C1 TIENE UN TOTAL DE "
				+ c1.getNum_ventas() + " VENTAS MENSUALES, LO QUE CORRESPONDE A UN IMPORTE DE "
				+ c1.getNum_ventas() * Comercial.imp_venta + "euros .\n			 	TIENE UNA ANTIGÜEDAD DE "
				+ c1.getAntiguedad() + " ANOS, LO QUE SE CORRESPONDE CON UN IMPORTE DE " + c1.calculaTrienios()
				+ " euros" + "  *******\n						SU SALARIO ESTE MES ES DE " + c1.calculaSalario());
		c1.reseteaContador();
		System.out.println("\n	*******  AL INICIAR EL MES (DIA 1), EL COMERCIAL C1 TIENE UN TOTAL DE "
				+ c1.getNum_ventas() + " VENTAS MENSUALES.  *******\n");

		// Creacion y cumulo de ventas mensuales comercial C2
		System.out.println(
				"__________________________________________________________________________________________________________________________________\n\n		COMERCIAL C2: CREACION,ACUMULACION VENTAS Y SALARIO AL INICIO Y FIN DE MES\n__________________________________________________________________________________________________________________________________");
		Comercial c2 = new Comercial("Antonio", "Perez", 24, 1300, 2, 2);
		System.out.println("Se crea el comercial c2:\n" + c2);
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 8 ventas diarias a COMERCIAL c2.\nVentas anteriores:" + c2.getNum_ventas()
				+ ".\nVentas actuales: " + c2.contabilizaVentas(8));
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 7 ventas diarias a COMERCIALc2.\nVentas anteriores:" + c2.getNum_ventas()
				+ ".\nVentas actuales: " + c2.contabilizaVentas(7));
		System.out.println(
				"\n			-------------------------------------------------------------------------------\n					TOTAL VENTAS MENSUALES COMERCIAL C2: "
						+ c2.getNum_ventas()
						+ "\n			-------------------------------------------------------------------------------\n");

		// Prueba reseteaContador() de ventas,calculaTrienio y calculaSalario
		System.out.println("\n	*******  AL FINALIZAR EL MES (DIA 30), EL COMERCIAL C2 TIENE UN TOTAL DE "
				+ c2.getNum_ventas() + " VENTAS MENSUALES, LO QUE CORRESPONDE A UN IMPORTE DE "
				+ c2.getNum_ventas() * Comercial.imp_venta + "euros .\n			 	TIENE UNA ANTIGÜEDAD DE "
				+ c2.getAntiguedad() + " ANOS, LO QUE SE CORRESPONDE CON UN IMPORTE DE " + c2.calculaTrienios()
				+ " euros" + "  *******\n						SU SALARIO ESTE MES ES DE " + c2.calculaSalario());
		c2.reseteaContador();
		System.out.println("\n	*******  AL INICIAR EL MES (DIA 1), EL COMERCIAL C2 TIENE UN TOTAL DE "
				+ c2.getNum_ventas() + " VENTAS MENSUALES.  *******\n");

		// Creacion y cumulo de dietas y km mensuales Repartidor r1
		System.out.println(
				"__________________________________________________________________________________________________________________________________\n\n		REPARTIDOR R1: CREACION,ACUMULACION KMS Y SALARIO AL INICIO Y FIN DE MES\n__________________________________________________________________________________________________________________________________");
		Repartidor r1 = new Repartidor("Pedro", "Delgado", 38, 1500, 25, "SUR", "1495LOP", 100, 150, 20);
		System.out.println("Se crea el repartidor r1:\n" + r1);
		r1.añadirDieta(15);
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 15 euros de dietas.\nImporte dietas total:" + r1.getDietas());
		r1.añadirDieta(30);
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 30 euros de dietas.\nImporte dietas total:" + r1.getDietas());

		// Prueba calculaSalario
		System.out.println("\n	*******  AL FINALIZAR EL MES, EL REPARTIDOR R1 TIENE UN TOTAL DE " + r1.getDietas()
				+ " euros EN DIETAS MENSUALES.\n			 	TIENE UN KILOMETRAJE DE "
				+ (r1.getKmFinMes() - r1.getKmInicioMes()) + " km, LO QUE SE CORRESPONDE CON UN IMPORTE DE "
				+ 0.45 * (r1.getKmFinMes() - r1.getKmInicioMes()) + " euros"
				+ "  *******\n						SU SALARIO ESTE MES ES DE " + r1.calculaSalario());

		// POLIMORFISMO
		System.out.println(
				"_________________________________________________________________________________________\n\n					POLIMORFISMO\n_________________________________________________________________________________________");
		Empleado e = new Comercial("Sonia", "Jaro", 34, 2000, 4, 7);
		System.out.println("Añadiendo ventas...");

		// e.contabilizaVentas(5); // NO PODEMOS HACER ESTO PUESTO QUE ES UN METODO DE
		// COMERCIAL Y E ES UN
		// EMPLEADO. DEBEMOS HACER UNA CONVERSION CASTING PREVIA

		((Comercial) e).contabilizaVentas(5); // CONVERSION DE E A TIPO COMERCIAL. OJO! ESTO REALIZA UNA COPIA, NO
												// CONVIERTE E EN UN COMERCIAL!!

		System.out.println("El salario de Sonia es " + e.calculaSalario()); // AL HABER POLIMORFIRMOS EN ESTE METODO, LO
																			// BUSCA EN LA SUPERCLASE Y LO COMPLETA CON
																			// LA SUBCLASE. POR TANTO, FINALMENTE VA AL
																			// METODO DE CALCULAR SALARIO EN COMERCIAL.

		System.out.println(
				"_________________________________________________________________________________________\n\n       	        		    POLIMORFISMO- ARRAY\n_________________________________________________________________________________________");
		Empleado lista[] = new Empleado[5];
		lista[0] = new Empleado("Luis", "Lopez", 45, 1400, 2);
		lista[1] = new Comercial("Ana", "Martin", 33, 1650, 7, 6);
		lista[2] = new Comercial("Juan", "Gomez", 36, 1800, 4, 3);
		lista[3] = new Repartidor("Pedro", "Marin", 55, 1970, 17, "Extremadura", "1111PLK", 63540, 68730, 125);
		lista[4] = new Repartidor("Julia", "Martinez", 61, 2058, 24, "Murcia", "1578GHB", 122584, 126312, 89);

		System.out.println("Mostrando listado de empleados...\n");
		for (int i = 0; i <= 4; i++) {
			System.out.println(lista[i]);
			System.out.println("Salario este mes "+lista[i].calculaSalario());
		}
		
		
		// Calculo todal de km al mes. Al ser metodo de la clase repartidor, debemos usar un casting
		double total=0;
		for (int i = 0; i <= 4; i++) {
			if(lista[i] instanceof Repartidor) {
				Repartidor aux=(Repartidor)lista[i];
				total=total+aux.getKmFinMes()-aux.getKmInicioMes();
			}
		}
		System.out.println("\n		*******  Se han recorrido este mes "+total+" kms. 	******* ");

	}

}

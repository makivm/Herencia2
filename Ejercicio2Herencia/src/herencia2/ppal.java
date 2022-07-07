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
				+ c1.getNum_ventas() + " VENTAS MENSUALES, LO QUE CORRESPONDE A UN IMPORTE DE "+c1.getNum_ventas()*Comercial.imp_venta+"euros .\n			 	TIENE UNA ANTIGÜEDAD DE "+c1.getAntiguedad()+" ANOS, LO QUE SE CORRESPONDE CON UN IMPORTE DE "+c1.calculaTrienios()+ " euros"+"  *******\n						SU SALARIO ESTE MES ES DE "+c1.calculaSalario());
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
				+ c2.getNum_ventas() + " VENTAS MENSUALES, LO QUE CORRESPONDE A UN IMPORTE DE "+c2.getNum_ventas()*Comercial.imp_venta+"euros .\n			 	TIENE UNA ANTIGÜEDAD DE "+c2.getAntiguedad()+" ANOS, LO QUE SE CORRESPONDE CON UN IMPORTE DE "+c2.calculaTrienios()+ " euros"+"  *******\n						SU SALARIO ESTE MES ES DE "+c2.calculaSalario());
		c2.reseteaContador();
		System.out.println("\n	*******  AL INICIAR EL MES (DIA 1), EL COMERCIAL C2 TIENE UN TOTAL DE "
				+ c2.getNum_ventas() + " VENTAS MENSUALES.  *******\n");
		
		
		
		// Creacion y cumulo de dietas y km mensuales Repartidor r1
		System.out.println(
				"__________________________________________________________________________________________________________________________________\n\n		REPARTIDOR R1: CREACION,ACUMULACION KMS Y SALARIO AL INICIO Y FIN DE MES\n__________________________________________________________________________________________________________________________________");
		Repartidor r1 = new Repartidor("Pedro", "Delgado", 38, 1500,25,"SUR","1495LOP", 100,150,20);
		System.out.println("Se crea el repartidor r1:\n" + r1);
		r1.añadirDieta(15);
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 15 euros de dietas.\nImporte dietas total:" + r1.getDietas());
		r1.añadirDieta(30);
		System.out.println("-------------------------------------------------------------------------------\n"
				+ "Se añaden 30 euros de dietas.\nImporte dietas total:" + r1.getDietas());

		
		// Prueba calculaSalario
		System.out.println("\n	*******  AL FINALIZAR EL MES, EL REPARTIDOR R1 TIENE UN TOTAL DE "
				+ r1.getDietas() + " euros EN DIETAS MENSUALES.\n			 	TIENE UN KILOMETRAJE DE "+	(r1.getKmFinMes()-r1.getKmInicioMes())+" km, LO QUE SE CORRESPONDE CON UN IMPORTE DE "+0.45*(r1.getKmFinMes()-r1.getKmInicioMes())+ " euros"+"  *******\n						SU SALARIO ESTE MES ES DE "+r1.calculaSalario());
			
	}

}

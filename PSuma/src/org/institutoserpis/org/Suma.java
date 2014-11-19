package org.institutoserpis.org;
import java.math.BigDecimal;
import java.util.Scanner;
public class Suma {

	public static void main(String[] args) {
		
		System.out.println("programa para sumar dos numeros");
		
		System.out.print("introduce el primero: ");
		Scanner scanner = new Scanner(System.in);
		String primerDato = scanner.nextLine();
		
		System.out.println("Has introducido "+primerDato);
		
		BigDecimal primerNumero= new BigDecimal(primerDato);
		System.out.println("primer numero="+primerNumero);
		
		
		System.out.println("introduce el segundo: ");
		String segundoDato= scanner.nextLine();
		
		BigDecimal segundoNumero= new BigDecimal(segundoDato);
		System.out.println("segundo numero ="+segundoNumero);
		
		BigDecimal suma = primerNumero.add(segundoNumero);
		
//		con float tendremos problemas con el "redondeo"
//		
//		System.out.println("Has introducido "+primerDato);
//		
//		float primerNumero= Float.parseFloat(primerDato);
//		System.out.println("primer numero="+primerNumero);
//		
//		
//		System.out.println("introduce el segundo: ");
//		String segundoDato= scanner.nextLine();
//		
//		float segundoNumero= Float.parseFloat(segundoDato);
//		
//		System.out.println("segundo numero = "+segundoNumero);
//		
//		float suma = primerNumero+segundoNumero;
		
		System.out.println("La suma es= "+suma);

		
	}

}

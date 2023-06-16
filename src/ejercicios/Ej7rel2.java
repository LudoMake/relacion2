package ejercicios;

import java.util.Scanner;

public class Ej7rel2 {

	public static void main(String[] args) {
		Scanner bisiesto = new Scanner(System.in);
		
		System.out.println("Ingresa un año y dime si es bisiesto o no lo es");
		
		        int anio = bisiesto.nextInt();
		        
		        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
		            System.out.println("El año " + anio + " es bisiesto");
		        } else {
		            System.out.println("El año " + anio + " no es bisiesto");
		        }
		        
		        /**
		         * if ((anio%4)==0) {
		         * 	if ((anio%100)==0) && ((anio%400)!=0) {
		         * 	system.out.println ("No es bisiesto");
		         * }
		         * else {
		         * 	system.out.println ("Es bisiesto");
		         * }
		         * else {
		         * 	system.out.println("No es bisiesto");
		         * }
		         * }
		         */
		        bisiesto.close();
	}

}

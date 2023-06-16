package ejercicios;

import java.util.Scanner;

public class Ej1rel2 {

	public static void main(String[] args) {
		Scanner enteros = new Scanner(System.in);
		
		System.out.println("indica los numeros mayor, menor o si son iguales");

		        System.out.print("Ingrese el primer número: ");
		        int numero1 = enteros.nextInt();

		        System.out.print("Ingrese el segundo número: ");
		        int numero2 = enteros.nextInt();

		        if (numero1 > numero2) {
		            System.out.println(numero1 + " es mayor que " + numero2);
		            System.out.println(numero2 + " es menor que " + numero1);
		        } else if (numero1 < numero2) {
		            System.out.println(numero1 + " es menor que " + numero2);
		            System.out.println(numero2 + " es mayor que " + numero1);
		        } else {
		            System.out.println(numero1 + " y " + numero2 + " son iguales");
		        }
		        enteros.close();
		    }
}

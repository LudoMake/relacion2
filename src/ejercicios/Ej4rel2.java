package ejercicios;

import java.util.Scanner;

public class Ej4rel2 {

	public static void main(String[] args) {
		Scanner enteros = new Scanner(System.in);
		
		System.out.println("indica 3 numeros y dime si existe algun triangulo con esas dimensiones");
		
		        System.out.print("Ingrese el primer número: ");
		        int num1 = enteros.nextInt();

		        System.out.print("Ingrese el segundo número: ");
		        int num2 = enteros.nextInt();
		        
		        System.out.print("Ingrese el tercer número: ");
		        int num3 = enteros.nextInt();

		        if ((num1 + num2 > num3) && (num2 + num3 > num1) && (num3 + num1 > num2))
		        	System.out.println("Existe");
		        			        	
		        else
		        	System.out.println("No existe");
		        
		        enteros.close();
		    }
		
}
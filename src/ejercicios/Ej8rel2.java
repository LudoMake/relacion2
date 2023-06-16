package ejercicios;

import java.util.Scanner;

public class Ej8rel2 {

	public static void main(String[] args) {
		Scanner SwitchCase = new Scanner(System.in);
		
		System.out.println("Programa aritmetica");
		System.out.println("Inserta 2 numeros");
		
		        double num1 = SwitchCase.nextDouble();
		        double num2 = SwitchCase.nextDouble();
		        
		System.out.println("Inserta operador");
		String cuenta = SwitchCase.next();
		        double res = 0;
		        
		switch (cuenta)
		{
		case "suma":
			res = num1+num2;
			break;
		case "resta":
			res = num1-num2;
			break;
		case "multiplica":
			res = num1*num2;
			break;
		case "divide":
			res = num1/num2;
			break;
		case "eleva":
			res = Math.sqrt(num1);
			break;
		case "raiz":
			res = Math.pow(num1, num2);
			break;
			default :
				System.out.println("No se puede resolver");
		}
		
		System.out.println(res);
		SwitchCase.close();
		/*
		 * System.out.println("sumar");
		 * System.out.println("restar");
			System.out.println("multiplicar");
			System.out.println("dividir");
			System.out.println("raiz cuadrada");
			System.out.println("exponente");
		 */
	}

}

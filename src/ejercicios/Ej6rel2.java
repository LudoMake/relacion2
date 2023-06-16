package ejercicios;

import java.util.Scanner;

public class Ej6rel2 {

	public static void main(String[] args) {
		Scanner rectas = new Scanner(System.in);
		
		System.out.println("Indica 2 rectas y dime si son: coincidentes, paralelas o secantes");
		
		System.out.print("Ingrese el primer numero: ");
       // int num1 = rectas.nextInt();
         int a1 = rectas.nextInt();
		 int b1 = rectas.nextInt();
		 int c1 = rectas.nextInt();
		 
        System.out.print("Ingrese el segundo numero: ");
       // int num2 = rectas.nextInt();
        int a2 = rectas.nextInt();
        int b2 = rectas.nextInt();       
        int c2 = rectas.nextInt();
        
        if ((a1/a2)!=(b1/b2)) {
        	System.out.println("Es una linea secante");
        	if ((a1/b1)==(-b2/a2)) {
        		System.out.println("Es una linea perpendicular");
        	}
        }
        else if ((a1/a2)==(b1/b2)) {
        	System.out.println("Ees una linea paralela");
        	if ((a1/a2)==(b1/b2) && (b1/b2)==(c1/c2)) { 
            	System.out.println("Es una linea coincidente");
            }
        }
       else 
        	System.out.println("No existe");
        
	}

}

package ejercicios;

import java.util.Scanner;

public class Ej5rel2 {

	public static void main(String[] args) {
		Scanner ajedrez = new Scanner(System.in);
		
		System.out.println("indica 2 casillas y dime si la casilla está en fila, columna o diagonal");
		
		        System.out.print("Ingrese la primera fila: ");
		        int fil1 = ajedrez.nextInt();

		        System.out.print("Ingrese la segunda fila: ");
		        int fil2 = ajedrez.nextInt();
		        
		        System.out.print("Ingrese la primera columna: ");
		        int col1 = ajedrez.nextInt();

		        System.out.print("Ingrese la segunda columna: ");
		        int col2 = ajedrez.nextInt();
		        
		        if ((col1 == col2) && (fil1 == fil2))
		        	System.out.println("Estan en la misma casilla");
		           
		        else
		        	{
		        	if (col1==col2)
		        		System.out.println("estan en la misma columna");
		        	else if (fil1==fil2)
		        		System.out.println("estan en la misma fila");
		        	else if (Math.abs(col1 - col2) == Math.abs(fil1 - fil2))
		        			System.out.println("Estan en la misma diagonal");
		        	else
		        	System.out.println("No esta en la misma casilla");
		        	}
		        
		        ajedrez.close();
	}

}

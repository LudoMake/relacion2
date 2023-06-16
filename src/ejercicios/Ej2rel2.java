package ejercicios;

import java.util.Scanner;

public class Ej2rel2 {

	public static void main(String[] args) {
		Scanner menor = new Scanner(System.in);

		        System.out.println("Ingrese el primer número:");
		        int num1 = menor.nextInt();

		        System.out.println("Ingrese el segundo número:");
		        int num2 = menor.nextInt();

		        System.out.println("Ingrese el tercer número:");
		        int num3 = menor.nextInt();

		        int meno = obtenerMenor(num1, num2, num3);
		        System.out.println("El número menor es: " + meno);
		    
		        menor.close();
	}
	
		    public static int obtenerMenor(int num1, int num2, int num3) {
		        int meno = num1;

		        if (num2 < meno) {
		            meno = num2;
		        }
		        
		        if (num3 < meno) {
		            meno = num3;
		        }

		        return meno;
		    }
		    
		}

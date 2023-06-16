package ejercicios;

/*import java.util.Arrays;*/
import java.util.Scanner;

public class Ej3rel2 {

	    public static void main(String[] args) {
	        Scanner central = new Scanner(System.in);

	        System.out.println("Ingrese el primer número:");
	        float num1 = central.nextFloat();

	        System.out.println("Ingrese el segundo número:");
	        float num2 = central.nextFloat();

	        System.out.println("Ingrese el tercer número:");
	        float num3 = central.nextFloat();
	       
	        if ((num1 > num2)&&(num1<num3) || ((num1 > num3)&&(num1 < num2))) {
	        	System.out.println("El numero central es " + num1);
	        	}
	        	else if ((num2 > num1)&&(num2<num3) || ((num2 > num3)&&(num2 < num1))) {
	        	System.out.println("El numero central es " + num2);
	        	}
	        	else if ((num3 > num2)&&(num3<num1) || ((num3 > num1)&&(num3 < num2))) {
	        	System.out.println("El numero central es " + num3);
	        	}
	        else
	        	System.out.println("El numero esta fuera de rango");
	        /*
	        float numcent = obtenerNumeroCentral(numero1, numero2, numero3);
	        System.out.println("El número central es: " + numcent);
	        */
	        central.close();
	    }	   

	    /*public static float obtenerNumeroCentral(float num1, float num2, float num3) {
	        float[] numeros = {num1, num2, num3};
	        Arrays.sort(numeros);

	        return numeros[1];
	    }*/
}
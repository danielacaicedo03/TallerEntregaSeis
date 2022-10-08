import java.util.*;
import java.util.Scanner;
public class Siete {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int i;
	        double sum = 0, prom;

	        double[] notas = new double[5]; 
	        
	        System.out.println("Digite los 5 resultados de las pruebas presentadas: ");
	        
	        for (i = 0; i < notas.length; i++) {
	            System.out.print("Puntaje N." + (i + 1) + ": ");
	            notas[i] = sc.nextDouble();
	        }

	        for (i = 0; i < notas.length; i++) {
	            sum = sum + notas[i];
	        }

	        prom = sum / notas.length;

	        System.out.printf("Promedio de notas ingresadas es: %.2f %n", prom);
	}
}

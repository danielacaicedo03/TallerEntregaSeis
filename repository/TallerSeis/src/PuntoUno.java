import java.util.Scanner;
import java.util.*;
public class PuntoUno {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nota = new int[9];
		
		int i = 0;
		
		System.out.println("Ingrese las 9 notas del curso: ");
		
		for(i = 0; i < nota.length; i++) {
			
			System.out.println("Digite la nota " + (i +1 ) + ": ");
			nota[i] = sc.nextInt();
		}
		
		System.out.println("Las notas digitadas son: ");
		
		for(i = 0; i < 9; i++) {
			System.out.println("Nota " + (i + 1) + ": " + nota[i]);
		}
	}
}
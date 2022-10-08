import java.util.Scanner;
public class PuntoDos {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		float[][] precio = new float[10][3];
		
		for(int i = 0; i < precio.length; i++){
			
		for(int j = 0; j < precio[i].length; j++){
			
		System.out.println("Digite un valor para la fila " + i + ", column " + j); 
		precio[i][j] = in.nextInt();

			}
		}
	}
}
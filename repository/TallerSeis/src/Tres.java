import java.util.Scanner;
public class Tres {
	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		long[][] precio = new long[4][3];
		
		for(int i = 0; i < precio.length; i++){
			
		for(int j = 0; j < precio[i].length; j++){
			
		System.out.println("Digite un valor para la fila " + i + ", column " + j); 
		precio[i][j] = l.nextLong();
			}
		}
	}
}
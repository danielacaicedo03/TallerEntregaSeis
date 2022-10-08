import java.util.InputMismatchException;
import java.util.Scanner;
public class Ocho {
    
    public static int[][] multiplicar(int mat1[][],int mat2[][],int dimension){
    	
        int multi[][] = new int[dimension][dimension];
        System.out.println("Multiplicación de las matrices: ");
        int suma = 0;
        for(int i = 0; i<mat1.length; i++){
            for(int j = 0; j <mat1[i].length; j++){
                suma = 0;
                for(int k = 0; k<dimension; k++){
                    suma = suma + mat1[i][k] * mat2[k][j];
                }
                multi[i][j] = suma;
                System.out.print(multi[i][j] + " ");
                
            }
            
            System.out.println(" ");
        }
        return multi;
    }
    
    public static int [][]restar(int mat1[][],int mat2[][],int dimension){
    	
        int resta[][] = new int[dimension][dimension]; 
        System.out.println("Resta de las matrices: ");
        for(int i = 0; i< mat1.length; i++){
            for(int j = 0;j < mat1[i].length; j++){
                resta[i][j] = mat1[i][j] - mat2[i][j];
                System.out.print(resta[i][j] + " ");
            }
            System.out.println(" ");
        }
        return resta;
    }
    
    public static int [][]sumar(int mat1[][],int mat2[][],int dimension){
    	
        int suma[][] = new int[dimension][dimension]; 
        System.out.println("Suma de las matrices: ");
        for(int i = 0; i< mat1.length; i++){
            for(int j = 0; j < mat1[i].length; j++){
                suma[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(suma[i][j] + " ");
            }
            System.out.println(" ");
        }
        return suma;
    }
    
    public static void mostrar(int mat[][],int matriz){
    	
        System.out.println("Mostrando la matriz " + matriz);
        for(int i = 0; i< mat.length; i++){
            for(int j = 0;j < mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
    public static void rellenar(int mat[][],int matriz){
    	
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j <mat[i].length; j++){
                mat[i][j] = (int)(Math.random() * 9);
            }
        }
    }
    
    
    public static void main(String[] args) {
    	
        Scanner miteclado = new Scanner(System.in);
        boolean salir=false;
        int num = 0;
        while(!salir){
            try{
            	
                System.out.println("De cuántas filas y columnas será la matriz: ");
                num = miteclado.nextInt();
                salir = true;
            }catch(InputMismatchException e){
            	
                System.out.println("Digite un número válido");
                miteclado.nextLine();
            }
        }
        salir = false;
        int op = 0;
        while(!salir){
            try{
            	
                System.out.println("1-sumar matrices\n2-restar matrices\n3-multiplicar matrices\n4-salir");
                op=miteclado.nextInt();
                salir=true;
            }catch(InputMismatchException e){
            	
                System.out.println("Digite un número válido");
                miteclado.nextLine();
            }
        }
        int matriz1[][] = new int[num][num];
        int matriz2[][] = new int[num][num];
        
        switch(op){
        
            case 1:{
                rellenar(matriz1,1);
                rellenar(matriz2,2);
                mostrar(matriz1,1);
                mostrar(matriz2, 2);
                sumar(matriz1, matriz2, num);
                
                break;
            }
            case 2:{
                rellenar(matriz1,1);
                rellenar(matriz2,2);
                mostrar(matriz1,1);
                mostrar(matriz2, 2);
                restar(matriz1, matriz2, num);
                break;
            }
            case 3:{
                rellenar(matriz1,1);
                rellenar(matriz2,2);
                mostrar(matriz1,1);
                mostrar(matriz2, 2);
                multiplicar(matriz1, matriz2, num);
                
                break;
            }
            case 4:{
                break;
            }
                
        }
               
    }
    
}
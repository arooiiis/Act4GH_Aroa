import java.util.Scanner;

public class ArrayAleatorio {

	public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
		        
	   int CANTIDAD =30;
		        
	   int INICIOINTERVALO = 1;
		        
	   int FINALINTERVALO = 10;
		               
	   int [] elementos = new int [CANTIDAD]; 
	   
	   // Cambio la cantiddad del array
	   
	   int[] repeticiones = new int[30];

	    for (int i = 0; i < CANTIDAD; i++) {
	    	elementos[i] = (int)(Math.random() * (FINALINTERVALO - INICIOINTERVALO + 1) + INICIOINTERVALO);
	        if (elementos[i] > 0) {
	          if (elementos[i] == elementos[i]) {
	            repeticiones[elementos[i]]++;  
	          }
	        }
	      }

	      for(int i = 0; i < CANTIDAD; i++) {
	        System.out.print(elementos[i] + " ");
	      }
	      
	      System.out.println();
	      
	      for(int i = 0; i < CANTIDAD; i++) {
	        System.out.println("El número " + elementos[i] + " se repite " + repeticiones[i] + " veces.");
	      }
	      	}

}

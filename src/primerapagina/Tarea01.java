package primerapagina;
import java.util.Scanner;

public class Tarea01 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		
		double A,Pot,Raiz;
		
		System.out.println("Ingrese el numero: ");
		A = SC.nextDouble();
		
		if (A <= 0) {
	        System.out.println("Error,el valor no puede ser menor o igual a Cero");    
	        System.out.println("Saliendo del programa...");
	    } else {
	    	Pot=Math.pow(A, 2);
	    	Raiz=Math.sqrt(A);
	    			
	    	        System.out.println("Del numero "+A);
	    			System.out.println("Su cuadrado es : "+Pot);
	    	        System.out.println("Y su raiz es: " +String.format("%.2f",Raiz));
	    }
		
		
			
			
			
			
			SC.close();
		System.out.println("The end");
			

	}

}

package segundapagina;
import java.util.Scanner;
public class tarea12 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		int N,suma=0;
		
		  System.out.println("Ingrese el numero: ");
		  N= SC.nextInt();
		  
		  for(int i=1;i <=N; i++) {
			  
			  suma=suma+i;
		  }
		
		  
		  System.out.println("La suma de los "+ N +" primeros numeros es: "+ suma);
		  
		  System.out.println("Fin del programa");
	      
	      SC.close();
	}

}

package primerapagina;
import java.util.Scanner;
public class tarea02 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		int entrada;
		double PA;
		
		System.out.println("Bienvenido a curso de grado superior");
		System.out.println("Para acceder necesitas un titulo de bachiller.Tienes titulo de bachiller?");
		System.out.println("1.Si  ");
		System.out.println("2.No ");
		entrada=SC.nextInt();
		
		switch(entrada) {
		
		case 1: 
			System.out.println("Puedes cursar un ciclo formativo de nivel superior!:D");
		break;
		
		
		case 2:
			System.out.println("Otra forma es aprobando una prueba de admision");
			System.out.println("Cuanto sacaste en tu prueba de admision?");
			PA=SC.nextDouble();
			
			if(PA>=60 ) {
				
				System.out.println("Puedes cursar un ciclo formativo de nivel superior!:D");
				
			}else {
				System.out.println("Lo siento.No puedes cursar un ciclo formativo de nivel superior :(");
				
				break;
			}
		
		}
		

	       System.out.println("The end");
	        
	        SC.close();

	}

}

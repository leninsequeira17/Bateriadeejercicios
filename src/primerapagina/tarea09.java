package primerapagina;
import java.util.Scanner;
public class tarea09 {

	public static void main(String[] args) {
Scanner SC=new Scanner(System.in);
		
		int Mes,Monto;
		double Des,MontoTotal;
		
		System.out.println("Bienvenido a pull&bear");
		System.out.println(" Ingrese el monto de su compra: ");
		Monto=SC.nextInt();
		
		System.out.println("En que mes hizo su compra? ( En numero )");
		Mes=SC.nextInt();
	
		if (Mes != 2) {
	        	       MontoTotal=Monto;
	        	       System.out.println("El monto total es de: " +MontoTotal);
	        } else {
	            Des= (Monto*0.15);  
	            MontoTotal=(Monto-Des);
	            System.out.println("El Monto Total es de: "+MontoTotal);
	        }
		
		SC.close();

	}

}

package primerapagina;
import java.util.Scanner;
public class tarea07 {

	public static void main(String[] args) {
Scanner SC=new Scanner(System.in);
		
		double A,B,C,Prod,Suma;
	System.out.println("Introduzca el primer valor: ");
	 A = SC.nextDouble();


	System.out.println("Introduzca el segundo valor: ");
	B = SC.nextDouble();
	
	System.out.println("Introduzca el tercer valor: ");
	C= SC.nextDouble();
	
	
	if (A < 0) {
		Prod=A*B*C;
        System.out.println("El producto de los tres es: "+Prod);                                             
    } else {
    	Suma=A+B+C;
        System.out.println("La suma de los tres es : " + Suma);     
    }
	System.out.println("like it");
	SC.close();

	}

}

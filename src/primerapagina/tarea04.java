package primerapagina;
import java.util.Scanner;

public class tarea04 {

	public static void main(String[] args) {

		Scanner SC=new Scanner(System.in);
		
		double A,B,C;
	System.out.println("Ingrese el primer numero: ");
	 A = SC.nextDouble();


	System.out.println("Ingrese el segundo numero: ");
	B = SC.nextDouble();
	
	System.out.println("Ingrese el tercer numero: ");
	C= SC.nextDouble();
	
	if (A > B) {
        if (A > C) {
            System.out.println("El mayor es: " + A);                                             
        } else {
            System.out.println("El mayor es: " + C);     
        }
    } else if (B > C) {
        System.out.println("El mayor es: " + B);
    } else {
        System.out.println("El mayor es: " + C);
    }
System.out.println("The end ");
SC.close();

	}

}

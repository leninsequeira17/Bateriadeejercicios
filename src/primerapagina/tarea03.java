package primerapagina;

import java.util.Scanner;
public class tarea03 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		
		double A,B,Ax;
	System.out.println("Ingrese el valor de A: ");
	 A = SC.nextDouble();


	System.out.println("Ingrese el valor de B: ");
	B = SC.nextDouble();

	Ax=A;
	A=B;
	B=A;

	System.out.println("El valor de A es: "+B);
	System.out.println("El valor de B es: "+Ax);

	System.out.println("The end");


	SC.close();

	}

}

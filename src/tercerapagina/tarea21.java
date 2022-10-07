package tercerapagina;
import java.util.Scanner;
public class tarea21 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
        System.out.print("Introducir el numero de filas: ");
        int numFilas = SC.nextInt();
 
        for(int i = 1; i <= numFilas; i++) {
			for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println("");
		}
 
        SC.close();
        System.out.println("Fin del programa");
		

	}

}

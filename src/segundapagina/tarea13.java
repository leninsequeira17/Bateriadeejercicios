package segundapagina;
import java.util.Scanner;

public class tarea13 {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		int num,contador,suma;
		
		System.out.println("Ingrese el numero: ");
		num=SC.nextInt();
		
		contador = 0;
		suma=0;
		int limite = num;
		while(contador < limite){
			if(num % 2==0) {
				suma = num + suma;
				contador= contador + 1;
				
			}
			num= num+1;
		}
		System.out.println("La suma es " + suma);

		System.out.println("Fin del programa");
		SC.close();

	}

}

package primerapagina;
import java.util.Scanner;
public class tarea06 {

	public static void main(String[] args) {
int numero;
		
		numero=0;
        Scanner SC = new Scanner( System.in );
        
        
        

        
        do {
        	System.out.println( "Introduzca un numero entero: " );
            numero = SC.nextInt();
        
            if(numero==0) {
         	   System.out.println(" Error.Introduzca de nuevo el numero ");
            }
            else if ( numero % 2 == 0 )
        {
            System.out.println( "ES PAR" );
        }
        else
        {
            System.out.println( "ES IMPAR" );
        }
  
       
        }while (numero ==0 );
        
       
      
      
      
      
      
       System.out.println("finish");
        
        SC.close();

	}

}

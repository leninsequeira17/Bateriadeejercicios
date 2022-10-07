package pagina4;
import java.util.Scanner;
public class tarea25 {

	public static void main(String[] args) {
		String sino;
		double celsius;
        	Scanner es = new Scanner(System.in); 
        	System.out.println("¿Desea convertir de c a f o viceversa?");
        	sino=es.nextLine();
        	
			System.out.println("Ingresa los grados celsius: ");
			celsius = es.nextFloat();
		
        
        double fahrenheit = celsiusAFahrenheit(celsius);
        System.out.printf("%f grados celsius son %f grados fahrenheit", celsius, fahrenheit);
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 1.8f) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8f;
    }

	}



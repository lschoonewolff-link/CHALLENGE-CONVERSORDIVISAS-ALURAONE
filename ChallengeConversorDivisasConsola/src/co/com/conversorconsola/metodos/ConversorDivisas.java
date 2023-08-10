package co.com.conversorconsola.metodos;

import java.util.Scanner;

public class ConversorDivisas {
	
	public static void verMenu() {
		/*- Convertir de la moneda de tu pa�s a D�lar
      - Convertir de la moneda de tu pa�s  a Euros
      - Convertir de la moneda de tu pa�s  a Libras Esterlinas
      - Convertir de la moneda de tu pa�s  a Yen Japon�s
      - Convertir de la moneda de tu pa�s  a Won sul-coreano
      
      - Convertir de D�lar a la moneda de tu pa�s
        - Convertir de Euros a la moneda de tu pa�s
        - Convertir de Libras Esterlinas a la moneda de tu pa�s
        - Convertir de Yen Japon�s a la moneda de tu pa�s
        - Convertir de Won sul-coreano a la moneda de tu pa�s
      */
		
		   	System.out.println("****************************************"); 					
			System.out.println("*                                      *"); 					
			System.out.println("* BIENVENIDO A MI CONVERSOR DE DIVISAS *"); 					
			System.out.println("*                                      *"); 					
			System.out.println("****************************************"); 					
			System.out.println("*                                      *"); 					
			System.out.println("* 1. COP a USD                         *"); 					
			System.out.println("* 2. COP a EUR                         *"); 					
			System.out.println("* 3. COP a GBP                         *"); 					
			System.out.println("* 4. COP a JPY                         *"); 					
			System.out.println("* 5. COP a KRW                         *"); 					
			System.out.println("* 6. USD a COP                         *"); 					
			System.out.println("* 7. EUR a COP                         *"); 					
			System.out.println("* 8. GBP a COP                         *"); 					
			System.out.println("* 9. JPY a COP                         *"); 					
			System.out.println("* 10. KRW a COP                        *"); 					
			System.out.println("* 11. SALIR                            *"); 					
			System.out.println("*                                      *"); 					
			System.out.println("****************************************"); 					
	        System.out.print("Elija una Opci�n: ");  
	        
	}
	                                                                       
	public static void conversion(String Origen, String Destino, double proporcion, Scanner lector) {
		
		System.out.println("Opcion escogida: " + Origen + " a " + Destino);
		System.out.print("Ingrese el valor a convertir: ");
		double valor = lector.nextDouble();
		double valorFinal = valor * proporcion;
		System.out.println("El valor final es: " +  + valorFinal);
		System.out.println();
	
	}
	
}

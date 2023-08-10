package co.com.conversorconsola.metodos;


import java.util.Scanner;


public class ConversorMain {
	
	public static void main(String[] args) {
		
		//valores de peso colombiana a otra moneda
		double usd=0.00025; double eur=0.00023; double gbp=0.00020; 
		double jpy=0.035; double krw=0.32;
		
		//valores de otras monedas a pesos colombiano
		double usdCop=4042.79; double eurCop=4421.58; double gbpcop=5138.37;
		double jpyCop=28.19; double krwCop=3.11;
		
		Scanner scanner = new Scanner(System.in);
		int option;
		
		do {
			
			ConversorDivisas.verMenu();
			while (!scanner.hasNextInt()) {
                System.out.println("Opción inválida. Inténtelo nuevamente.");
                scanner.next(); // Limpiamos la entrada incorrecta del scanner
            }
            option = scanner.nextInt();
            if (option < 1 || option > 11) {
                System.out.println("Opción inválida. Inténtelo nuevamente.");
            } else {
               
            	switch(option) {                                                  			
 	         	case 1:                                                          			
 	         		 ConversorDivisas.conversion("COP", "USD", usd, scanner);
  	         	     break;                                                      			
 	         	case 2:  
 	         		 ConversorDivisas.conversion("COP", "EUR", eur, scanner); 
 	                  break;                                                   			
 	         	case 3: 
 	         		 ConversorDivisas.conversion("COP", "GBP", gbp, scanner);
 	                  break;                                                   			
 	         	case 4:
 	         		 ConversorDivisas.conversion("COP", "JPY", jpy, scanner);
 	         	     break;                                                      			
 	         	case 5: 
 	         		 ConversorDivisas.conversion("COP", "KRW", krw, scanner);
 	         	     break;                                                      			
 	         	case 6:
 	         		 ConversorDivisas.conversion("USD", "COP", usdCop, scanner);                                                        			
 	         		 break;                                                         			
 	         	case 7: 
 	         		 ConversorDivisas.conversion("EUR", "COP", eurCop, scanner);
 	         	     break;                                                      			
 	         	case 8:  
 	         		 ConversorDivisas.conversion("GBP", "COP", gbpcop, scanner);
 	         	     break;                                                      			
 	         	case 9:
 	         		 ConversorDivisas.conversion("JPY", "COP", jpyCop, scanner);
 	         		break;                                                          			
 	         	case 10:
 	         		 ConversorDivisas.conversion("KRW", "COP", krwCop, scanner);
 	         		break;                                                          			
 	         	case 11:  	                                                      			
 	         		System.out.println("Adios Saliendo del programa... :(");           			
 	                 break;                                                    			
 	                                                                           			
 	             default: 
 	            	
 	             	System.out.println("Opción inválida.");   
 	             	//System.out.println(GREEN + "Este texto es de color verde" + RESET);
 	             	                              			
 	             	return;                                                      			
 	         }
            }
        } while (option != 11);
		
		scanner.close();	
		System.out.print("\u001B[2J"); 
    } 
	

}

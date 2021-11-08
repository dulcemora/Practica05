/*Clase Main donde damos los datos de una cuenta
*@version 1.0
*/
import java.util.Scanner;

public class Main{
    /*Metodo principal donde vemos datos de una cuenta
    *@param args Argumentos
    */    
    public static void main(String[] args){

	/*Creamos una nueva cuenta y utilizamos el Scanner
	 */
	Cuenta cuenta = new Cuenta();
	Scanner in = new Scanner(System.in);

	System.out.println("CUENTA");
	
	/*Utilizando un constructor con valores predeterminados*/
	System.out.println("CONSTRUCTOR CON VALORES PREDETERMINADOS");
	Cuenta constructor1 = new Cuenta();
	System.out.println("Titular: " + constructor1.titular);
	System.out.println("Dinero Disponible: " + constructor1.dineroDisponible);
	/*usando constructor en el que damos el nombre pero el dinero disponible es cero*/
	System.out.println("\nCONSTRUCTOR 2");
	Cuenta constructor2 = new Cuenta("Mildred Calvillo");
	System.out.println("Titular: " + constructor2.titular);
	System.out.println("Dinero disponible: " + constructor2.dineroDisponible);
	/*Utilizando los metodos set y get*/
	System.out.println("\nMetodo set-get");
	//Metodo get-set titular
	System.out.print("Nombre del titular: ");
	cuenta.setTitular("Alejandro Juarez");
	System.out.println(cuenta.getTitular());

	//Método get-set dinero disponible
	System.out.print("Dinero Disponible: ");
	cuenta.setDineroDisponible(500.00);
	System.out.println(cuenta.getDineroDisponible());

	//toString
	System.out.println("\ntoString");
	System.out.println(constructor2);
    
    }
}

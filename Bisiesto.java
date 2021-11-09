/**Clase Bisiesto donde determinamos si un año es bisiesto o no
 *@version 1.0
 **/
import java.util.Scanner;

public class Bisiesto {
    /**Metodo principal donde determinamos si un año es bisiesto o no a partir de un año dado
    *@param args Argumentos
    **/    
    public static void main (String [] args){

	//Utilizando Scanner para obtener un año por parte del usuario
	    Scanner in = new Scanner(System.in);

	    System.out.println("**Bisiesto**");
	    System.out.print("Ingresa el año que deseas saber si es bisiesto o no: ");
	    int año = in.nextInt();

       //Determinaminamos si el año es bisiesto y en caso de serlo lo imprimimos que se trata de un año bisiesto y en caso de no serlo imprimimos que no lo es
     	    if(año % 4 == 0){
		System.out.println("El año " +año +" es bisiesto");
		}else{
		    System.out.println("El año " +año +" no es bisiesto");
		    }
	    }
    }

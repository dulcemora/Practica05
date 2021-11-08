/*Clase Condicionales donde a partir de dos numeros decidimos cual es mayor
*@version 1.0
*/
import java.util.Scanner;

public class Condicionales {
    public static void main (String[] args){

        //Utilizando Scanner para obtener dos numeros por parte del usuario
	    Scanner in = new Scanner(System.in);

	    System.out.println("**Condicionales**");
	    System.out.print("Dame el número 1: ");
	    double n1 = in.nextDouble();  
	    System.out.print("Dame el número 2: ");
	    double n2 = in.nextDouble();

	    /*Determinamos cual de los dos numeros es mayor y lo imprimimos con la leyenda "El numero mayor es n"*/
	    if(n1 > n2){
	    System.out.println("El número con mayor valor es: " +n1);
	    }else{
		 System.out.println("El número con mayor valor es: " +n2);
		 }
	    }
	    }
	 

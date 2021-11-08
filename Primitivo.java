/*Clase Primitivo donde damos los tipos de datos primitivos de java y su tamaño
*@version 1.0
*/
public class Primitivo {
    /*Metodo principal donde se imprimen los tipos de datos primitivos de java con su tamaño en bytes
    *@param args Argumentos
    */    
    public static void main (String [] args){

	System.out.println("***Tipos primitivos***");
      	System.out.println("El tamaño de un byte es: " + Byte.BYTES + " byte");
      	System.out.println("El tamaño de un short es: " + Short.BYTES + " bytes");
       	System.out.println("El tamaño de un int es: " + Integer.BYTES + " bytes");
        System.out.println("El tamaño de un long es: " + Long.BYTES + " bytes");
        System.out.println("El tamaño de un float es: " + Float.BYTES + " bytes");
      	System.out.println("El tamaño de un double es: " + Double.BYTES + " bytes");
       	System.out.println("El tamaño de un boolean es: 1 bit ");
       	System.out.println("El tamaño de un char es: " + Character.BYTES +" bytes");
	
	    }
    }

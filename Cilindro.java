/*Clase Cilindro donde calculamos area y volumen de un cilindro
*@version 1.0
*/
public class Cilindro {
    /*Metodo principal donde calculamos area y volumen de un cilindro con valores dados
    *@param args Argumentos
    */
    public static void main (String [] args) {

	//Se declaran dos variables de tipo entero que guardan radio y altura respectivamente
	    int radio = 10;
	    int altura = 20;

	    //Dos variables que guardan el area y volumen respectivamente 
	    double area = (2 * 3.1416) * (radio)*(radio +  altura);
	    double volumen =(3.1416 * radio) * (radio * altura);

	    //Nos imprime en pantalla, el area y el volumen del cilindro
	    System.out.println("** Área y volumen de un cilindro **");
	    System.out.println("El área del cilindro es: " + area + " cm²");
	    System.out.println("El volumen del cilindro es: " + volumen + " cm³");
	    
	    }
    }

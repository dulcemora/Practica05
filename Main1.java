/*Clase Main1 donde creamos rectangulos y calculamos area y perimetro
*@version 1.0
*/
import java.util.Scanner;

public class Main1{
    /*Metodo principal donde vemos bases y alturas de rectangulos
    *@param args Argumentos
    */
    public static void main(String[] args){

	/*Creamos una nueva cuenta y utilizamos el Scanner
	 */
	Rectangulo rectangulo = new Rectangulo();
	Scanner in = new Scanner(System.in);
	
	/*usando constructor con valores predeterminados*/
	System.out.println("CONSTRUCTOR 1");
	Rectangulo constructor1 = new Rectangulo();
	System.out.println("Base: " + constructor1.base);
	System.out.println("Altura: " + constructor1.altura);
	
	/*Usando constructor donde damos los valores*/
	System.out.println("\nCONSTRUCTOR 2");
	Rectangulo constructor2 = new Rectangulo(30, 20);
    
	System.out.println("Base: " + constructor2.base);
	System.out.println("Altura: " + constructor2.altura);

	System.out.println("\nMETODO SET Y GET CON VALORES PREDETERMINADOS");

	//Metodo get-set base
	System.out.println("Base: ");
	rectangulo.setBase(50);
	System.out.println(rectangulo.getBase());

	//Método get-set altura
	System.out.println("Altura: ");
	rectangulo.setAltura(100);
	System.out.println(rectangulo.getAltura());
    
	System.out.println("\nUTILIZANDO VALORES ANTERIORES PARA METODO AREA Y PERIMETRO");
	/*Utilizando valores del metodo get-set para obtener area y perimetro con los metodos area y perimetro*/
	//Metodo area
	System.out.println("El area es: " + rectangulo.area());

	//Metodo perimetro
	System.out.println("El perimetro es: " + rectangulo.perimetro());

	/*Utilizando el toString de la clase*/
	System.out.println("\ntoString");
	System.out.println(constructor2);

	/*Utilizando scanner para crear un nuevo rectangulo con datos dados por el usuario y obtener su area y perimetro con ayuda de los metodos area y perimetro*/
	System.out.print("\nDame un valor para la base: ");
	double base2 = in.nextDouble();
	System.out.print("Dame un valor para la altura: ");
	double altura2 = in.nextDouble();

        Rectangulo rectangulo2 = new Rectangulo(base2 , altura2);

	System.out.println("El area es: " + rectangulo2.area());
	System.out.println("El perimetro es: " + rectangulo2.perimetro());
    }
}

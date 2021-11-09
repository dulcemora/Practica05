/**Clase Ciclo While donde damos los numeros primos de 1 a 1000 utilizando el ciclo do while
*@version 1.0
**/
public class CicloWhile{
    /**Metodo principal donde determinamos que numeros son primos entre 1 y 1000
    *@param args Argumentos
    **/    
    public static void main (String[] args){

	//Se declaran dos variables de tipo entero y una booleana
	int i = 2;
	int  j = 2;
	boolean esPrimo = true;

	System.out.println("Los numeros primos de 1 a 1000 son: ");

	//Se anidan dos ciclos while por los que pasan todos los número entre 2 y 1000; se va evaluando en cada caso si cumple las condiciones de ser primo y en caso de serlo lo imprime.
	while(i <= 1000){	      
		    j = 2;
		    esPrimo = true;
	     while(j < i){
	      
	     if (i%j==0){
		 esPrimo = false;
		 break;
	     }
	       j++;
	     }
	     
		    if (esPrimo){
			System.out.println(i);
			 }
		    i++;
		  }
		
    }
    }


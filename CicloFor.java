/**Clase Ciclo For donde damos los numeros primos de 1 a 1000 utilizando el ciclo for
*@version 1.0
**/
public class CicloFor {
    /**Metodo principal donde determinamos que numeros son primos entre 1 y 1000
    *@param args Argumentos
    **/    
    public static void main (String [] args){

	System .out.print("Todos los números primos que hay entre 0 y 1000 son: ");

	//Por medio de un ciclo que nos permite pasar todos los números empezando en 2 hasta 1000 va haciendo el proceso y determinando si se trata de un numero primo o no.
	for(int i = 2; i<=1000; i++){
	    int np = 0;
	for(int j = 2; j<=i/2; j++){
	    if (i % j == 0){
		np++;  }
	}

	//El "if" ve si la condición se cumple para poder imprimir el número como primo
	if (np==0){
       System.out.println(i);
        }
 }
   }
    }

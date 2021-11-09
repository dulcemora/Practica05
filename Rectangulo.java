/**Clase que nos da rectangulos
* @author Dulce Mora
* @version 1.0
**/
public class Rectangulo {

    //Atributos
    //La base de un rectangulo
    public double base;
    //La altura de un rectangulo
    public double altura;

    /**Constructor con valores definidos base (10) y altura (20)
    **/
    public Rectangulo() {
	this.base = 10;
	this.altura = 20;
    }
 
    /**Constructor que recibe dos valores de tipo double
     * @param base El parametro que representa la base
     * @param altura El parametro que representa la altura
     **/
    public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
    }

    /**Metodo que devuelve la base
     *@return La base
     **/
    public double getBase(){
    return this.base;
    }
    //Metodo que modifica el valor de la base
    public void setBase(double base){
    this.base = base;
    }

    /**Metodo que devuelve la altura
     *@return La altura
     **/
    public double getAltura(){
    return this.altura;
    }
    //Metodo que modifica el valor de altura
    public void setAltura(double altura){
    this.altura = altura;
    }

    /**Metodo que da el area de un rectangulo 
    * @return El area de un rectangulo 
    **/
    public double area(){
    return (this.base * this.altura);
    }

    /**Metodo que da el perimetro de un rectangulo 
     *@return El perimetro de un rectangulo
     **/
    public double perimetro(){
    return (this.base + this.base) + (this.altura + this.altura);
    }
    
    //toString de la clase: Nos devuelve los valores de la base y la altura.
    public String toString() {
    return "Base: " + base + "\nAltura: " + altura;
    }
}

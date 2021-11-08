/*Clase que nos da el titular y dinero disponible de una cuenta
* @author Dulce Mora
* @version 1.0
*/
public class Cuenta {
   
    //Atributos
    //El nombre del titular de la cuenta
    public String titular;
    //El dinero disponible de la cuenta
    public double dineroDisponible = 0;

    /*Constructor con valores definidos
     * @param titular El parametro que representa el nombre del titular, que por ser predeterminado es Dulce Mora
     * @param dineroDisponible El parametro que representa el dinero disponible de la cuenta que en este caso es 1070.20
     */
    public Cuenta() {
    this.titular = "Dulce Mora";
    this.dineroDisponible = 1070.20;
    }
    
   /*Constructor que recibe un valor String
     * @param titular El parametro que representa el nombre del titular
     * @param dineroDisponible El parametro que representa el dinero disponible y en este caso es 0
     */
    public Cuenta(String titular) {
    this.titular = titular;
    this.dineroDisponible = 0;
    }

    /*Metodo que devuelve el titular
     *@return El nombre del titular
     */
    public String getTitular(){
    return this.titular;
    }
    /*Metodo que modifica el nombre del titular
     */
    public void setTitular(String titular){
    this.titular = titular;
    }
    
    /*Metodo que devuelve el dinero disponible
     *@return El dinero disponible de la cuenta
     */
    public double getDineroDisponible(){
    return this.dineroDisponible;
    }
    /*Metodo que modifica el dinero disponible
     */
    public void setDineroDisponible(double dineroDisponible){
    this.dineroDisponible = dineroDisponible;
    }

    /*toString de la clase
    *Nos devuelve el nombre del titular y el dinero disponible
    */
    public String toString() {
    return "Nombre del titular: " + titular + "\n" + "Dinero Disponible: " + dineroDisponible;
   }
}


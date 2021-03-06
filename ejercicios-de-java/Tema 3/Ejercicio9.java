/**
 * Ejercicio9
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio9 {
  public static void main(String[] args) {
    double numeroPi = 3.141516;
    
    System.out.print("Por favor, introduce el radio del cono: ");
    double r = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce la altura del cono: ");
    double h = Double.parseDouble(System.console().readLine());
    
    /*Para declarar una constante se usa final delante de int o double.
    En ese caso, si intentamos modificar la variable, el programa no lo
    permitirá.*/
    
    System.out.print("Siguiendo la fórmula, el volumen del cono es " + (numeroPi/3) * (r * r) * h);
  }
}

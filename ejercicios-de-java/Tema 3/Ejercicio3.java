/**
 * Ejercicio3
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce el número de pesetas a convertir: ");
    String cantidad = System.console().readLine();
    double pesetas = Double.parseDouble(cantidad);
    
    System.out.print("La cantidad en euros es " + (double)pesetas / 166.376);
  }
}

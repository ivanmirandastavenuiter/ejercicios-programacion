/**
 * Ejercicio2
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce el número de euros a convertir: ");
    String cantidad = System.console().readLine();
    double euros = Double.parseDouble(cantidad);
    
    System.out.print("La cantidad en pesetas es " + (double)euros * 166.376);
  }
}

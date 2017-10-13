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
    
    //Para hacer la salida formateada:
    //Con printf se ponen los datos separados por comas
    //System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
    //Se reservan caracteres solo cuando se alinea, si no no tiene mucho
    //sentido.
    //EL GUIÓN FUNCIONA TANTO CON NÚMEROS COMO CON CARACTERES:
    //sirve para alinear a la izquierda
    
    System.out.print("La cantidad en euros es " + (double)pesetas / 166.376);
  }
}

/**
* Ejercicio6
*
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.print("Para saber el área de un triángulo, primero introduce su base en cm: ");
    String cantidad = System.console().readLine();
    int base = Integer.parseInt(cantidad);
    
    System.out.print("Ahora introduce la altura del triángulo en cm: ");
    cantidad = System.console().readLine();
    int altura = Integer.parseInt(cantidad);
    
    System.out.println("El área del triángulo es " + (base * altura)/2);
  }
}

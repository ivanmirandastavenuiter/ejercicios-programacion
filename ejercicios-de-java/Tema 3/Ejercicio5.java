/**
* Ejercicio5
*
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.print("Para saber el área de un rectángulo, primero introduce su longitud en cm: ");
    String cantidad = System.console().readLine();
    int longitud = Integer.parseInt(cantidad);
    
    System.out.print("Ahora introduce la anchura del rectángulo en cm: ");
    cantidad = System.console().readLine();
    int anchura = Integer.parseInt(cantidad);
    
    System.out.println("El área del rectángulo será " + longitud * anchura);
  }
}

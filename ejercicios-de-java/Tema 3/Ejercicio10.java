/**
* Ejercicio10
*
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Introduce la cantidad de MB que quieres convertir: ");
    double megaBytes = Double.parseDouble(System.console().readLine());
    
    System.out.print("El resultado en kilobytes es de " + megaBytes * 1024);
  }
}

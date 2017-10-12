/**
* Ejercicio11
*
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Introduce la cantidad de KB que quieres convertir: ");
    double kiloBytes = Double.parseDouble(System.console().readLine());
    
    System.out.print("El resultado en megabytes es de " + kiloBytes / 1024);
  }
}

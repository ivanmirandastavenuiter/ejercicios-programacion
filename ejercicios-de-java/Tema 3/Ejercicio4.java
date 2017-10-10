/**
 * Ejercicio4
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número: ");
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduce un segundo número: ");
    double segundoNumero = Double.parseDouble(System.console().readLine());
    
    System.out.println("Si sumamos ambos números el resultado sería " + (primerNumero + segundoNumero));
    System.out.println("Si restamos ambos números el resultado sería " + (primerNumero - segundoNumero));
    System.out.println("Si multiplicamos ambos números el resultado sería " + (primerNumero * segundoNumero));
    System.out.println("Si dividimos ambos números el resultado sería " + (primerNumero / segundoNumero));
  }
}

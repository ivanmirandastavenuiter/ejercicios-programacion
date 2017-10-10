/**
* Ejercicio1
*
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número: ");
    String nombre = System.console().readLine();
    int primerNumero = Integer.parseInt(nombre);
    
    System.out.print("Por favor, introduce otro más: ");
    nombre = System.console().readLine();
    int segundoNumero = Integer.parseInt(nombre);
    
    System.out.println("El resultado si multiplicamos ambos números es " + primerNumero * segundoNumero);
  }
}

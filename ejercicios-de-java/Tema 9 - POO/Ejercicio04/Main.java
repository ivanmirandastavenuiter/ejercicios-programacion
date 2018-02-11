/*
 * Programa principal en el que se ejecutan los métodos de la clase 
 * Fracción.
 */
package ejercicio04;

/**
 *
 * @author Iván Miranda
 */
public class Main {
  public static void main(String[] args) {
    
    // Declaro la instancia prueba.
    
    Fraccion prueba = new Fraccion(90,-120);
    
    // Ejecuto las distintas funcionalidades de los métodos.
    
    System.out.println("Vamos a tomar como prueba la siguiente fracción: " +
      prueba);
    System.out.println("*______________________________________________________*");
    
    System.out.println("Invertida: " + prueba.invierte());
    System.out.println("Simplificada: " + prueba.simplifica());
    System.out.println("Multiplicación x 6, por ejemplo: " + prueba.multiplicaEntero(6));
    System.out.println("Multiplicación x 3/5, por ejemplo: " + prueba.multiplicaFraccion(3, 5));
    System.out.println("División x 3/5, por ejemplo: " + prueba.divideFraccion(3, 5)); 
  }
}
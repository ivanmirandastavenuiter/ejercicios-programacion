/*
 * Programa Main con las funcionalidades de la clase Tiempo.
 */
package ejercicio06;

/**
 *
 * @author Iván Miranda.
 */
public class Main {
  public static void main(String[] args) {
    
    // Creo el objeto t1 y t2 de la clase tiempo.
 
    Tiempo t1 = new Tiempo(06,3,42);
    Tiempo t2 = new Tiempo(01,48,53);
    
    // Mediante toString veo los resultados.
    
    System.out.println("Tiempo 1: " + t1);
    System.out.println("Tiempo 2: " + t2);
    
    // Aplico la función de suma().
    
    Tiempo t3 = t1.suma(t2);
    System.out.println("Si sumamos ambos intervalos, el resultado es: " + t3);
    
    // Aplico la función de resta().
    
    t3 = t1.resta(t2);
    System.out.println("Si restamos ambos intervalos, el resultado es: " + t3);
  }
}

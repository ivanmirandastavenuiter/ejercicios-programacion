/*
 * Muestra los números primos que hay entre 1 y 1000.
 */
package funciones;

/**
 *
 * @author Iván Miranda
 */

public class Ejercicio15 {
  public static void main(String[] args) {
    
    for (int a = 1; a < 1001; a++) {
      if (funciones.Funciones.esPrimo(a)) {
        System.out.print(a + " ");
      }
    }
  }
}
  

   
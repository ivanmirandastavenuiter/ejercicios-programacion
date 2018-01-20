/*
 * Muestra los números capicúa que hay entre 1 y 99999.
 */
package funciones;

/**
 *
 * @author Iván Miranda
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    for (int a = 1; a < 99999; a++) {
      
      if (funciones.Funciones.esCapicua(a)) {
        System.out.print(a + " ");
      }
    }
  }
}
  

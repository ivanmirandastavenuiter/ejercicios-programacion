
package funciones;

/**
 * Ejercicio 35.
 * Convierte un número entero en el sistema de palotes.
 * 
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el número para convertir en palotes: ");
    int numero = sc.nextInt();
    
    System.out.println(funciones.bibliotecaFunciones.convierteEnPalotes(numero));
  }
}
    
 
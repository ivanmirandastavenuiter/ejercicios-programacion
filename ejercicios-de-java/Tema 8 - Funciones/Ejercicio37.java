
package funciones;

/**
 * Ejercicio 37.
 * Toma un número entero y lo transforma en código morse.
 * 
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el número para convertirlo: ");
    int numero = sc.nextInt();
    System.out.println(funciones.bibliotecaFunciones.convierteEnMorse(numero));
  }
}
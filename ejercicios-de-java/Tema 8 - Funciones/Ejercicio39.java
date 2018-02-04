
package funciones;

/**
 * Ejercicio 39.
 * Filtra un número tomado como parámetro devolviendo los números escritos con palabras.
 * 
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el número: ");
    int numero = sc.nextInt();
    
    System.out.println(funciones.bibliotecaFunciones.convierteEnPalabras(numero));
  }
}
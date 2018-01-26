
package funciones;

/**
 * Ejercicio 38.
 * Filtra un array tomado como parámetro devolviendo solo los capicúas.
 * 
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio38 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el intervalo mínimo: ");
    int minimo = sc.nextInt();
    System.out.println("Introduce el intervalo máximo: ");
    int maximo = sc.nextInt();
    
    int[] original = new int[100];
    
    for (int a = 0; a < 100; a++) {
      original[a] = (int)(Math.random() * ((maximo - minimo) + 1 ) + minimo);
      System.out.print(original[a] + " ");
    }
    System.out.println();
    
    System.out.println("Este es el array solo con capicúas: ");
    
    int[] soloCapis = funciones.bibliotecaFunciones.filtraCapicuas(original);
    
    for (int a : soloCapis) {
      System.out.print(a + " ");
    }
    System.out.println();
  }
}
    
  
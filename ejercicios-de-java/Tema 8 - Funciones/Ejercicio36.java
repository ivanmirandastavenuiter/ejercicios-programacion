
package funciones;

/**
 * Ejercicio 36.
 * Filtra un array tomado como parámetro devolviendo solo los primos.
 * 
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el intervalo mínimo: ");
    int minimo = sc.nextInt();
    System.out.println("Introduce el intervalo máximo: ");
    int maximo = sc.nextInt();
    
    int[] original = new int[20];
    
    for (int a = 0; a < 20; a++) {
      original[a] = (int)(Math.random() * ((maximo - minimo) + 1 ) + minimo);
      System.out.print(original[a] + " ");
    }
    System.out.println();
    
    System.out.println("Este es el array solo con primos: ");
    
    int[] soloPrimos = funciones.bibliotecaFunciones.filtraPrimos(original);
    
    for (int a : soloPrimos) {
      System.out.print(a + " ");
    }
    System.out.println();
  }
}
    
  
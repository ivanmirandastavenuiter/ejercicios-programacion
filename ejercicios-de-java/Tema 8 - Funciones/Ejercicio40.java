
package funciones;

/**
 * Ejercicio 40.
 * Extrae todos los números que contienen un 7.
 * 
 * @author Iván Miranda
 */

import java.util.Scanner;

public class Ejercicio40 {
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
    
    System.out.println("Este es el array solo con aquellos números que contienen el 7: ");
    
    int[] sietes = funciones.bibliotecaFunciones.filtraCon7(original);
    
    for (int a : sietes) {
      System.out.print(a + " ");
    }
    System.out.println();
  }
}
    
    
    
    
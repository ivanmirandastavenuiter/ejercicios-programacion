/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 * A continuación, el programa deberá dar la posición tanto del máximo como
 * del mínimo.
 */

package ejercicio05;

/**
 *
 * @author Iván Miranda
 */

public class Ejercicio05 {
  public static void main(String[] args) {
    int[][] a = new int[6][10];
    int numero;
    int maximo = 0;
    int minimo = 1001;
    int fila;
    int columna;
    
    System.out.printf("%6s", " ");
    
    for(columna = 0; columna < 10; columna++) {
      System.out.printf("%10s %2d", "Columna", columna);
    }
    System.out.println();
    
    for (fila = 0; fila < 6; fila++) {
      System.out.printf("%5s %1d", "Fila:", fila);
        for(columna = 0; columna < 10; columna++) {
          numero = (int)(Math.random() * 1001);
          a[fila][columna] = numero;
          System.out.printf("%3s %4d %4s", " ", numero, " ");
            if (numero > maximo) {
              maximo = numero;
            } 
            if (numero < minimo) {
              minimo = numero;
            }
        }
      System.out.println();
    }
    System.out.println();
    
    for (fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        if (a[fila][columna] == maximo) {
          System.out.print("El máximo número localizado se encuentra en ");
          System.out.println("la fila " + fila + ", columna " + columna);
        } else if (a[fila][columna] == minimo) {
          System.out.print("El mínimo número localizado se encuentra en ");
          System.out.println("la fila " + fila + ", columna " + columna);
        }
      }
    }
    System.out.println();
    System.out.printf("%6s", " ");
    
    for(columna = 0; columna < 10; columna++) {
      System.out.printf("%10s %2d", "Columna", columna);
    }
    System.out.println();
    
    for (fila = 0; fila < 6; fila++) {
      System.out.printf("%5s %1d", "\033[30mFila:", fila);
        for(columna = 0; columna < 10; columna++) {
      
          if (a[fila][columna] == maximo) {
            System.out.printf("%2s %1s %4d %-4s", " ", "\033[31m", a[fila][columna], "!");
          } else if (a[fila][columna] == minimo) {
              System.out.printf("%2s %1s %4d %-4s", " ", "\033[31m", a[fila][columna], "!");
            } else {
               System.out.printf("%2s %1s %4d %4s", " ", "\033[30m", a[fila][columna], " ");
              }
        }
      System.out.println();
    }
  }
}
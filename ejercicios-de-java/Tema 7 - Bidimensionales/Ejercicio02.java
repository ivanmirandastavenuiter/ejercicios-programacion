/*
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 */

package ejercicio02;
import java.util.Scanner;

/**
 *
 * @author Iván Miranda
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int[][] tabla = new int[4][5];
    int fila;
    int columna;
    int respuesta;
    int sumaFila = 0;
    int sumaColumna = 0;
    int sumaFinal = 0;
    
    System.out.println("Introduce 20 números para rellenar el array: ");
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        respuesta = Integer.parseInt(sc.nextLine());
        tabla[fila][columna] = respuesta;
      }
    }
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        sumaFila += tabla[fila][columna];
        if (columna == 4) {
          System.out.printf("%5d %4s %5d", tabla[fila][columna], "|", sumaFila);
        } else {
          System.out.printf("%5d", tabla[fila][columna]);
        }
      }
        sumaFinal += sumaFila;
        sumaFila = 0;
        System.out.println();
    }
    
    System.out.print("------------------------------------------\n");
    
    for (columna = 0; columna < 5; columna++) {
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += tabla[fila][columna];
      }
      if (columna == 4) {
        System.out.printf("%5d %4s %5d", sumaColumna, "|", sumaFinal);
        System.out.println();
      } else {
        System.out.printf("%5d", sumaColumna);
      }
      sumaColumna = 0;
    }
  }
}
      
  
    

    
    


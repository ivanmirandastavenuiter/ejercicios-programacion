/*
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 */

package ejercicio03;

/**
 *
 * @author Iván Miranda
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;
    int numero;
    int sumaFila = 0;
    int sumaColumna = 0;
    int sumaFinal = 0;
    
    System.out.println("Introduce 20 números para rellenar el array: ");
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        numero = (int)(Math.random() * 900 + 100);
        tabla[fila][columna] = numero;
      }
    }
    
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        sumaFila += tabla[fila][columna];
        if (columna == 4) {
          System.out.printf("%7d %4s %7d", tabla[fila][columna], "|", sumaFila);
        } else {
          System.out.printf("%7d", tabla[fila][columna]);
        }
      }
        sumaFinal += sumaFila;
        sumaFila = 0;
        System.out.println();
    }
    
    System.out.print("-----------------------------------------------------\n");
    
    for (columna = 0; columna < 5; columna++) {
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += tabla[fila][columna];
      }
      if (columna == 4) {
        System.out.printf("%7d %4s %7d", sumaColumna, "|", sumaFinal);
        System.out.println();
      } else {
        System.out.printf("%7d", sumaColumna);
      }
      sumaColumna = 0;
    }
  }
}
      
  
    

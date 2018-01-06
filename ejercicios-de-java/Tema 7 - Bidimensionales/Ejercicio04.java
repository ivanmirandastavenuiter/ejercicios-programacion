/*
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 */

package ejercicio04;

/**
 *
 * @author Iván Miranda
 */

public class Ejercicio04 {
  public static void main(String[] args) 
    throws InterruptedException { 
    
    int[][] tabla = new int[4][5];
    int fila;
    int columna;
    int numero;
    int sumaFila = 0;
    int sumaColumna = 0;
    int sumaFinal = 0;
    
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
          Thread.sleep(500);
        } else {
          System.out.printf("%7d", tabla[fila][columna]);
          Thread.sleep(500);
        }
      }
      sumaFinal += sumaFila;
      sumaFila = 0;
      System.out.println();
    }
    
    Thread.sleep(500);
    System.out.print("-----------------------------------------------------\n");
    Thread.sleep(500);
    
    for (columna = 0; columna < 5; columna++) {
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += tabla[fila][columna];
      }
      if (columna == 4) {
        System.out.printf("%7d %4s %7d", sumaColumna, "|", sumaFinal);
        Thread.sleep(500);
        System.out.println();
      } else {
          System.out.printf("%7d", sumaColumna);
          Thread.sleep(500);
        }
      sumaColumna = 0;
    }
  }
}
      
  
    
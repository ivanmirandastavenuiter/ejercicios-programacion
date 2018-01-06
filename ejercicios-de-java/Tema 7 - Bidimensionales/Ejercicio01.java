/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 */

package ejercicio01;

/**
 *
 * @author Iván Miranda
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    
    int[][] num = new int [3][6];
    
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    System.out.printf("%8s","Array num");
    
    for (int i = 0; i < 6; i++) {
      System.out.printf("%10s %1d", "Columna", i);
    }
    System.out.println();
    
    for (int i = 0; i < 3; i++) {
      System.out.printf("%6s %1d", "Fila", i);
        for (int r = 0; r < 6; r++) {
          System.out.printf("%6s %2d %2s", " ", num[i][r], " ");
        }
      System.out.println();
    }
  }
}
    
    
    
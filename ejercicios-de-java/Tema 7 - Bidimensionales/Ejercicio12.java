/*
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 */
package ejercicio08;

/**
 *
 * @author Iván Miranda
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    
    int[][] matriz = new int[9][9];
    int numero;
    int mayor = 0;
    int menor = 999;
    
    for (int a = 0; a < 9; a++) {
      for (int b = 0; b < 9; b++) {
        numero = (int)(Math.random() * 401 + 500);
        matriz[a][b] = numero;
        System.out.print(matriz[a][b] + " ");
      }
      System.out.println();
    }
    
    int auxiliarX = 8;
    int auxiliarY = 0;
    int[] diagonal = new int[9];
    int suma = 0;
    
    System.out.println();
    for (int a = 0; a < 9; a++) {
      diagonal[a] = matriz[auxiliarX][auxiliarY];
      System.out.print(diagonal[a] + " ");
      auxiliarX--;
      auxiliarY++;
      
      if (diagonal[a] > mayor) {
        mayor = diagonal[a];
      } else if (diagonal[a] < menor) {
        menor = diagonal[a];
      }
      suma += diagonal[a];
    }
      System.out.println();
      System.out.println();
      System.out.println("El número más alto es: " + mayor);
      System.out.println("El número más bajo es: " + menor);
      System.out.println("La media de los números es: " + (double)(suma/9));
  }
}

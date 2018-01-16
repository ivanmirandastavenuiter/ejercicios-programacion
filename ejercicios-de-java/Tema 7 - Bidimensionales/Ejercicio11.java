/*
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 */
package ejercicio07;

/**
 *
 * @author Iván Miranda Stavenuiter
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    int[][] matriz = new int[10][10];
    int numero;
    int mayor = 0;
    int menor = 999;
    int suma = 0;
    
    for (int a = 0; a < 10; a++) {
      for (int b = 0; b < 10; b++) {
        numero = (int)(Math.random() * 101 + 200);
        matriz[a][b] = numero;
        System.out.print(matriz[a][b] + " ");
      }
      System.out.println();
    }
    
    int auxiliarX = 0;
    int auxiliarY = 0;
    int indiceDiagonal = 0;
    int[] diagonal = new int[10];
    
    for (int a = 0; a < 10; a++) {
      diagonal[indiceDiagonal] = matriz[auxiliarX][auxiliarY];
      indiceDiagonal++;
      auxiliarX++;
      auxiliarY++;
    }
    System.out.println();
    
    for (int a = 0; a < 10; a++) {
      System.out.print(diagonal[a] + " ");
      
      if (diagonal[a] > mayor) {
        mayor = diagonal[a];
      } else if (diagonal[a] < menor) {
        menor = diagonal[a];
      }
      suma += diagonal[a];  
    }
    System.out.println();
    System.out.println();
    System.out.println("El mayor número es: " + mayor);
    System.out.println("El menor número es: " + menor);
    System.out.println("La media es de : " + ((double)suma/10));
  }
}

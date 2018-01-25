/*
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 */
package funciones;

/**
 *
 * @author Iván Miranda Stavenuiter
 */
import java.util.Scanner;

public class Ejercicios29a34 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce las filas del array: ");
    int a = sc.nextInt();
    System.out.println("Introduce las columnas del array: ");
    int b = sc.nextInt();
    System.out.println("Introduce el mínimo de los valores: ");
    int c = sc.nextInt();
    System.out.println("Introduce el máximo de los valores: ");
    int d = sc.nextInt();
    
    // Genera el array y lo almacena.
    int[][]array = funciones.arraysBi.generaArrayBiInt(a, b, c, d);
    
    // Imprime el array.
    funciones.arraysBi.muestraArrayBiInt(array);
    
    // Imprime la fila que elijas.
    System.out.println("Introduce la fila: ");
    int e = sc.nextInt();
    int[] fila = funciones.arraysBi.filaDeArrayBiInt(array, e);
    funciones.arraysBi.muestraArrayUnidimensional(fila);
    System.out.println();
    
    // Imprime la columna que elijas.
    System.out.println("Introduce la columna: ");
    int f = sc.nextInt();
    fila = funciones.arraysBi.columnaDeArrayBiInt(array, f);
    funciones.arraysBi.muestraArrayUnidimensional(fila);
    System.out.println();
    
    // Te dice si el número que elijas está o no en el array.
    System.out.println("Introduce un número para ver si está en el array.");
    System.out.println("Si no aparece, verás como respuesta -1, -1.");
    int g = sc.nextInt();
    System.out.println(funciones.arraysBi.coordenadasEnArrayBiInt(array, g));
    
    // Te dice si el número que elijas es o no punto de silla.
    int[][] arrayManual = funciones.arraysBi.arrayManual();
    funciones.arraysBi.muestraArrayBiInt(arrayManual);
    System.out.println("A partir del array que ves en pantalla, ¿cual dirías que es"
      + " el punto de silla?: ");
    int h = sc.nextInt();
    System.out.println(funciones.arraysBi.esPuntoDeSilla(arrayManual,h));
    
    // Dibuja una diagonal según la posición y la dirección insertada.
    System.out.println("Vamos a dibujar una diagonal.");
    System.out.println("Introduce fila: ");
    int i = sc.nextInt();
    System.out.println("Introduce columna: ");
    int j = sc.nextInt();
    System.out.println("Ahora la dirección: ");
    String direccion = sc.next();
    
    int[] r = funciones.arraysBi.diagonal(array, i, j, direccion);
    
    for (int k = 0; k < r.length; k++) {
      System.out.print(r[k]+ " ");
    } 
  }
}
    

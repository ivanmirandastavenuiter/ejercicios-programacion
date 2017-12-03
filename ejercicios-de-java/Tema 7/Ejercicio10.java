/**
 * Ejercicio10
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
 * es necesario.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio10 {
  public static void main(String[] args) {
  
  // Vamos a ir paso a paso. Vamos a hacer la primera línea: 20 números
  // entre 0 y 100 y que se almacenen en un array.
  
  int[] n = new int[20];
  int numero;
  
  for (int i = 0; i < 20; i++) {
    numero = (int)(Math.random() * 101);
    n[i] = numero;
    System.out.print(numero + " ");
  }
    System.out.println();
    System.out.println();
  
  // Vamos ahora con la segunda parte: creo un array auxiliar y recorro
  // el anterior identificando los pares y almacenándolos en el nuevo.
  // Además, creo la variable posición, que se encarga de mantener ordenados
  // los pares.
  
  int[] aux = new int[20];
  int posicion = 0;
  
  for (int i = 0; i < 20; i++) {
    
    if (n[i] % 2 == 0) {
      aux[posicion] = n[i];
      posicion++;
    }
  }
  
  // Ahora hago lo mismo pero con los impares y almacenando a partir del
  // del último par. Si la posición se ha quedado en 6, ahí empezará a
  // almacenar los impares.
  
  for (int i = 0; i < 20; i++) {
    
    if (n[i] % 2 != 0) {
      aux[posicion] = n[i];
      posicion++;
    }
  }
  
  // Ya están ordenados pero en el array auxiliar. Para almacenarlos en el
  // original, volvemos a hacer un for y listo.
  
  System.out.println("Con los pares primero quedaría de este modo: ");
  System.out.println();
  
  for (int i = 0; i < 20; i++) {
    n[i] = aux[i];
    System.out.print(n[i] + " ");
    }
  }
}
    
    
  
  
  
  
  
  
  
  
  
  

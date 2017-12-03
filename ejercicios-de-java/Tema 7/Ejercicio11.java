/**
 * Ejercicio11
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que
 * no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 * el array resultante.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
  int[] n = new int[10];
  int numero;
  int primo;
  
  System.out.println("Por favor, introduce diez números seguidos. Tras hacerlo,");
  System.out.println("verás los números tal y como los has introducido y,");
  System.out.println("justo debajo, verás en primer lugar los primos.");
  System.out.println();
  
  for (int i = 0; i < 10; i++) {
    numero = Integer.parseInt(System.console().readLine());
    n[i] = numero;
  }
    
    System.out.println("\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  
  int[] aux = new int[10];
  int posicion = 0;
  
  // Almacenamiento en auxiliar de los números primos
  
  for (int i = 0; i < 10; i++) {
    
    primo = 0;
    
    for (int r = 2; r < n[i]; r++) {
    
      if (n[i] % r == 0) {
        primo++;
      }
    }
    
    if (primo == 0) {
      aux[posicion] = n[i];
      posicion++;
    }
  }
  
  // Almacenamiento en auxiliar de los números no primos
  
  for (int i = 0; i < 10; i++) {
    
    primo = 0;
    
    for (int r = 2; r < n[i]; r++) {
    
      if (n[i] % r == 0) {
        primo++;
      }
    }
    
    if (primo > 0) {
      aux[posicion] = n[i];
      posicion++;
    }
  }
  
  // Retornamos los valores al array original y listo.
  
  for (int i = 0; i < 10; i++) {
    n[i] = aux[i];
  }
    
  System.out.println("\nArray final:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
  


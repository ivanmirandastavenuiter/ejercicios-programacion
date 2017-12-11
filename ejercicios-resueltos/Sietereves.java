/**
 * Este programa coloca todos los números acabados en 7 al principio del array.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Sietereves {
  public static void main(String[] args) {
    
    int[] n = new int[10];
    int numero;
    int contador = 0;
    
    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random() * 101);
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
    
    System.out.println();
    
    int[] ordenado = new int[10];
    int indiceOrdenado = 0;
    int modulo = 0;
    
    for (int i = 0; i < 10; i++) {
      
      modulo = n[i] % 10;
      
      if (modulo == 7) {
        ordenado[indiceOrdenado] = n[i];
        indiceOrdenado++;
        contador++;
      }
    }
    
    // Los que acaben en 7 ya están guardados. Ahora recorremos por si hubiera no
    // acabados en 7.
    
    
    for (int i = 0; i < 10; i++) {
      
      modulo = n[i] % 10;
      
      if (modulo != 7) {
        ordenado[indiceOrdenado] = n[i];
        indiceOrdenado++;
      }
    }
    
    if (contador > 0) {
    
      // Ahora imprimimos el array ordenado con los números acabados en 7 al principio.
    
      System.out.println("\nArray final:");
      System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
      System.out.print("│ Índice ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
      }
      System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
      System.out.print("│ Valor  ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", ordenado[i]);
      }
      System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    } else {
      System.out.println("No se ha encontrado ningún 7 en la secuencia del array.");
    }
  }
}
    
      

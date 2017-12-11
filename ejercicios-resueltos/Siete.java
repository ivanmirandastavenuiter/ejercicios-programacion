/**
 *
 *
 * Este programa coloca los números acabados en siete al final del array.
 * 
 * 
 * @author Iván Miranda Stavenuiter
 */

public class Siete {
  public static void main(String[] args) {
    
    int[] n = new int[10];
    int numero;
    
    System.out.print("Original: ");
    
    for (int i = 0; i < 10; i++) {
      numero = (int)(Math.random() * 101);
      n[i] = numero;
      System.out.print(numero + " ");
    }
    
    System.out.println();
    
    int[] ordenado = new int[10];
    int indiceOrdenado = 0;
    int modulo = 0;
    
    for (int i = 0; i < 10; i++) {
      
      modulo = n[i] % 10;
      
      if (modulo != 7) {
        ordenado[indiceOrdenado] = n[i];
        indiceOrdenado++;
      }
    }
    
    // Los que no acaben en 7 ya están guardados. Ahora recorremos por si hubiera
    // acabados en 7.
    
    
    for (int i = 0; i < 10; i++) {
      
      modulo = n[i] % 10;
      
      if (modulo == 7) {
        ordenado[indiceOrdenado] = n[i];
        indiceOrdenado++;
      }
    }
    
    // Ahora imprimimos el array ordenado con los números acabados en 7 al final.
    
    System.out.print("Array ordenado: ");
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print(ordenado[i] + " ");
    }
  }
}
    
      
      

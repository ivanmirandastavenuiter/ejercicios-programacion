/**
 * Repaso25
 *
 * @author Iván Miranda Stavenuiter
 */

public class Repaso25 {
  public static void main(String[] args) {
    
    int[] inicial = new int[15];
    int numero;
    
    System.out.println("Array original: ");
    
    for (int i = 0; i < 15; i++) {
      
      numero = (int)(Math.random() * 501);
      System.out.print(numero + " ");
      inicial[i] = numero;
    }
    
    int[] resultado = new int[15];
    
      for (int i = 0; i < 15; i++) {
      
        if (inicial[i] % 5 == 0) {
          resultado[i] = inicial[i];
        } else {
          
          for (int r = 0; inicial[i] % 5 != 0; r++) {
            inicial[i]++;
          }
          
          resultado[i] = inicial[i];
        }
      }
      
    System.out.println();
    System.out.println("Array final: ");
    
    for (int i = 0; i < 15; i++) {

      System.out.print(resultado[i] + " ");

    }
  }
}

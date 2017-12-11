/**
 *
 *
 * Pide 5 números favoritos y genera otros 100 indicando ME GUSTA o 
 * no me gusta, con mayúscula o minúscula respectivamente.
 * 
 * 
 * @author Iván Miranda Stavenuiter
 */

public class Numerosfavoritos {
  public static void main(String[] args) {
    
    int numero;
    int[] favoritos = new int[5];
    boolean favorito = false;
    
    System.out.println("Introduce tus 5 números favoritos: ");
    
    for (int i = 0; i < 5; i++) {
      
      numero = Integer.parseInt(System.console().readLine());
      favoritos[i] = numero;
    }
    
    for (int i = 1; i < 101; i++) {
      
      favorito = false;
      
      for (int r = 0; r < 5; r++) {
        
        if (favoritos[r] == i) {
          favorito = true;
        } 
      }
      
      if (favorito == true) {
        System.out.print(i + " ME GUSTA,");
      } else {
        System.out.print(i + " no me gusta,");
      }
      
      if (i % 5 == 0) {
        System.out.println();
      }
    }
  }
}
          
          
          
          
          
          
          

/**
 *
 *
 * Escalera con bolita aleatoria
 * 
 * 
 * @author Iván Miranda Stavenuiter
 */

public class Escalera {
  public static void main(String[] args) {
    
    int peldaño = 4;
    int altura = 4;
    int anchura = 8;
    int bolita = bolita = (int)(Math.random() * 4); 
    
    for (int e = 0; e < altura; e++) {
      
      
      for (int i = 0; i < peldaño; i++) {
      
        for (int r = 0; r < anchura; r++) {
          System.out.print("*");
        }
        
        if ((e == bolita) && (i == 3)) {
          System.out.print(" O");
        }
          System.out.println();
        }
      
      anchura += 2;
    }
  }
}

      

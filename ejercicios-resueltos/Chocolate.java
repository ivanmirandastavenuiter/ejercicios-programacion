/**
 *
 *
 * Este programa simula una tableta de chocolate con bocados aleatorios
 * en una probabilidad de 1 a 5.
 * 
 * 
 * @author Iván Miranda Stavenuiter
 */

public class Chocolate {
  public static void main(String[] args) {
    
    System.out.println("Seleccione la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Seleccione la anchura: ");
    int ancho = Integer.parseInt(System.console().readLine());
    
    int numero;
    
    for (int i = 0; i < altura; i++) {
      
      for (int r = 0; r < ancho; r++) {
        
        numero = (int)(Math.random() * 5 + 1);
        
        switch(numero) {
          case 1:
          case 2:
          case 3:
          case 4:
            System.out.print("#");
            break;
          case 5:
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

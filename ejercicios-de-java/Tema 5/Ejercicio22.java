/**
* Ejercicio22
* 
* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra por pantalla todos los números");
    System.out.println("primos comprendidos entre 2 y 100, ambos incluidos:");
    
    for (int i = 2; i <= 100; i++) {
      
      int div = 2;
      int noPrimo = 0;
      
      while (div < i) {
        
        if (i % div == 0) {
          noPrimo++;
        }
          div++;
        }
        
       if (noPrimo == 0) {
          System.out.print(i + " ");
        }
      }
    }
  }
        
        
        
  
    
    

      

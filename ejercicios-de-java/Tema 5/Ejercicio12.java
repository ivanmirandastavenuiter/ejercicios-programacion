/**
* Ejercicio12
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    
    int a = 0;
    int b = 1;
    int c = a + b;
    
    do {
      System.out.println(a + ", " + b + ", " + c);
      a = b;
      b = c;
      c = a + b;
      } while (c < 100);
    }
  }


    
    
      
      
      
      

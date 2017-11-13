/**
* Ejercicio14
* 
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Introduce una base: ");
    int base = Integer.parseInt(System.console().readLine());
        
    System.out.println("Introduce un exponente: ");
    int expo = Integer.parseInt(System.console().readLine());
    
    int resultado = base * base;
    
    switch (expo) {
      
      case 0:
      System.out.println("El resultado de la potencia es 1");
      break;
      
      case 1:
      System.out.println("El resultado de la potencia es " + base);
      break;
      
      default:
      while (expo > 1) {
        
        if (expo == 2) {
          expo--;
      } else if (expo > 2) {
          resultado = resultado * base;
          expo--;
        }
      }
      System.out.println("El resultado de la potencia es " + resultado);
    }
  }
}
      


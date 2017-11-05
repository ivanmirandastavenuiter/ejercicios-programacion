/**
* Ejercicio12
* 
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Introduce la cantidad de números que quieras ");
    System.out.println("ver de la secuencia de Fibonacci: ");
    int numIntroducido = Integer.parseInt(System.console().readLine());
    
    switch (numIntroducido) {
      case 1:
      System.out.println("0");
      break;
      
      case 2:
      System.out.println("0 1");
      break;
      
      default:
      System.out.print("0 1");
      int a = 0;
      int b = 1;
      int aux;
  
      while (numIntroducido > 2) {
        aux = a;
        a = b;
        b = b + aux;
        System.out.print(" " + b);
        numIntroducido--;
      }
    }
  }
}
        

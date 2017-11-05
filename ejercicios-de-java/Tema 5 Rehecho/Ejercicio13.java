/**
* Ejercicio13
* 
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Introduce diez números (positivos o negativos): ");
    
    int numNeg = 0;
    int numPos = 0;
    
    for (int i = 1; i < 11; i++) {
      
      int numIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numIntroducido < 0) {
        numNeg++;
      } else {
        numPos++;
      }
    }
    
    System.out.println("Has introducido " + numNeg + " números negativos");
    System.out.println("y " + numPos + " números positivos");
  }
}
        

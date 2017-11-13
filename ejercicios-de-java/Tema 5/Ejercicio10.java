/**
* Ejercicio10
* 
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    
    int numerosPositivos = 0;
    int numerosNegativos = 0;
    int total = 0;
    int num;
    
    do {
      System.out.println("Introduce un número: ");
      num = Integer.parseInt(System.console().readLine());
      
      if (num > 0) {
        numerosPositivos++;
        total += num;
      } else {
        numerosNegativos++;
      }
      
    } while (num > 0);
      System.out.println("Has introducido " + numerosPositivos + " números positivos.");
      System.out.println("La media de la suma total es " + (total / numerosPositivos) + ".");
  }
}
    

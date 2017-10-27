/**
* Ejercicio17
* 
* Math.abs(x) = valor absoluto de un número. Si es negativo, lo pone positivo.
* Si es positivo, lo pone igual. 
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Dime un número y yo te digo cuál es el último dígito: ");
    int num = Integer.parseInt(System.console().readLine());
    
    System.out.println("La última cifra de ese número tan bonito que has puesto es " + (num % 10));
  }
}

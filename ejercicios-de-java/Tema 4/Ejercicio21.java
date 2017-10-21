/**
* Ejercicio21
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Introduce un número de hasta cinco cifras y");
    System.out.println("te voy a decir, agárrate, si es capicúa o no: ");
    
    int num = Integer.parseInt(System.console().readLine());
  
    System.out.println(num / 10);
    System.out.println(num / 100);
    System.out.println(num / 1000);
    System.out.println(num / 10000);
    
    System.out.println(num % 10);
    System.out.println(num % 100);
    System.out.println(num % 1000);
    System.out.println(num % 10000);
  }
}

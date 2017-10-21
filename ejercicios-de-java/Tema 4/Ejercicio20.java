/**
* Ejercicio20
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Introduce un número de hasta cinco cifras y");
    System.out.println("te voy a decir, agárrate, si es capicúa o no: ");
    
    int num = Integer.parseInt(System.console().readLine());

    if ((num > 10) && (num < 100) && (num / 10 == num % 10)) {
      System.out.println("¡Tu número es capicúa!");
    }
    if ((num > 100) && (num < 1000) && (num / 100 == num % 10)) {
      System.out.println("¡Tu número es capicúa!");
    }
    if ((num > 1000) && (num < 10000) && (num / 1000 == num % 10) && (((num / 100) % 10) == ((num /10) % 10))) {
      System.out.println("¡Tu número es capicúa!");
    }
    if ((num > 10000) && (num < 100000) && (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10)))) {
      System.out.println("¡Tu número es capicúa!");
    }
      System.out.println("Anda eh, ¿cómo te quea?");
  }
}

    
    

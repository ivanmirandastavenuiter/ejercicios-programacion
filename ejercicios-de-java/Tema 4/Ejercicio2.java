/**
* Ejercicio2
* Si usamos System.console().readLine(); más .toLowercase(), se pasa
* todo a minúscula.
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.print("Dime una hora concreta, por favor: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <=12)) {
      System.out.println("Buenos días");
    }
    if ((hora >= 13) && (hora <=20)) {
      System.out.println("Buenas tardes");
    }
    if ((hora >= 21) && (hora <=24)) {
      System.out.println("Buenas noshe loco");
    }
    if ((hora >= 0) && (hora <=5)) {
      System.out.println("Buenas noches");
    }
    if ((hora < 0) || (hora >= 24)) {
      System.out.println("Has introducido una hora incorrecta");
    }
  }
}

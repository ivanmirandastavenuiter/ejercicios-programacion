/**
* Ejercicio9
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio9 {
  public static void main(String[] args) {
    
    int num;
    
    do {
      System.out.println("Por favor, introduce un número y te muestro la ");
      System.out.println("cantidad de cifras que tiene: ");
      num = Integer.parseInt(System.console().readLine());
      
      if ((num >= 10) && (num < 100)) {
      System.out.println("Ese número tiene dos cifras");
      } else if (num < 1000) {
      System.out.println("Ese número tiene tres cifras");
      } else if (num < 10000) {
      System.out.println("Ese número tiene cuatro cifras");
      } else if (num < 100000) {
      System.out.println("Ese número tiene cinco cifras");
      } else if (num < 1000000) {
      System.out.println("Ese número tiene seis cifras");
      }
    } while (num < 1000000);
      
      if (num > 1000000) {
      System.out.println("Tas pasao");
    }
  }
}


    

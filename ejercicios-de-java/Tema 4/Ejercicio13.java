/**
* Ejercicio13
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Dime tres números que te los ordeno chaval: ");
    
    int uno = Integer.parseInt(System.console().readLine());
    int dos = Integer.parseInt(System.console().readLine());
    int tres = Integer.parseInt(System.console().readLine());
    
    if ((uno < dos) && (uno < tres)) {
      System.out.println(uno + ", " + dos + ", " + tres);
    }
  }
}
    
    
    

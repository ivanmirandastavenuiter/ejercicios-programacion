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
    
    if ((uno < dos) && (dos < tres)) {
      System.out.println(uno + ", " + dos + ", " + tres);
    }
    if ((uno < tres) && (tres < dos)) {
      System.out.println(uno + ", " + tres + ", " + dos);
    }
    if ((dos < uno) && (uno < tres)) {
      System.out.println(dos + ", " + uno + ", " + tres);
    }
    if ((dos < tres) && (tres < uno)) {
      System.out.println(dos + ", " + tres + ", " + uno);
    }
    if ((tres < dos) && (dos < uno)) {
      System.out.println(tres + ", " + dos + ", " + uno);
    }
    if ((tres < uno) && (uno < dos)) {
      System.out.println(tres + ", " + uno + ", " + dos);
    }
  }
}
    
    
    

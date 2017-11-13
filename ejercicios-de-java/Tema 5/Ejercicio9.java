/**
* Ejercicio9
* 
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio9 {
  public static void main(String[] args) {
    System.out.println("Introduce el número que quieras: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int digitos = 1;
    int n = num;
    
    while (n > 10) {
      n /= 10;
      digitos++;
    }
    
    System.out.println(num + " tiene " + digitos + " dígito/s");
  }
}
    
    

/**
* Ejercicio8
* 
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.println("Introduce el número que quieras: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    int operador;
    
    for (operador = 0; operador < 11; operador++) {
      System.out.println(digito + " x " + operador + " = " + (digito * operador));
    }
  }
}

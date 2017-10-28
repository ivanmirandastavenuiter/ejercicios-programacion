
/**
* Ejercicio8
* 
* @author Iván Miranda Stavenuiter
*/

public class Ejercicio8 {
  public static void main(String[] args) {
    
    int op = 0;
    
    System.out.println("Por favor, introduce un número y te muestro la ");
    System.out.println("tabla de multiplicar correspondiente: ");
    int num = Integer.parseInt(System.console().readLine());
    
    for (op = 0; op < 11; op++) {
      System.out.println(num + " x " + op + " = " + (num * op));
    }
  }
}


    

 

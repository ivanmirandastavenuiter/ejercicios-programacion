/**
* Ejercicio15
* 
*Escribe un programa que dados dos números, uno real (base) y un entero
*positivo (exponente), saque por pantalla todas las potencias con base el
*numero dado y exponentes entre uno y el exponente introducido. No se deben
*utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
*se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Introduce una base: ");
    int base = Integer.parseInt(System.console().readLine());
        
    System.out.println("Introduce un exponente: ");
    int expo = Integer.parseInt(System.console().readLine());
    
    int resultado = 1;
    
    for (int i = 0; i < expo; i++) {
      resultado *= base;
      System.out.print (resultado + " ");
    }
  }
}

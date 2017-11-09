/**
* Ejercicio25
* 
* Realiza un programa que pida un número por teclado y que luego muestre ese
* número al revés.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio25 {
  public static void main(String[] args) {
    System.out.println("Este programa le da la vuelta al que pongas en pantalla.");
    System.out.println("Pon uno y comprueba el resultado: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    while (num > 0) {
      int cambiado = num % 10;
      System.out.print(cambiado);
      num = num / 10;
    }
  }
}

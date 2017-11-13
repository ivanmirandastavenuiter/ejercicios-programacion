/**
* Ejercicio17
* 
* Realiza un programa que sume los 100 números siguientes a un número entero
* y positivo introducido por teclado. Se debe comprobar que el dato introducido
* es correcto (que es un número positivo).
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Este programa caulcula la suma de los 100 números");
    System.out.println("siguientes al que introduzcas: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int suma = 0;
    int limite = num + 100;
    
    if (num >= 0) {
      
      for (int i = num; i < limite; i++) {
        suma += i;
      }
      System.out.println("La suma de los 100 números siguientes al introducido es " + suma);
    } else {
      System.out.println("El número introducido debe ser positivo.");
    }
  }
}
      
    
    

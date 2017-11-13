/**
* Ejercicio39
* 
* Escribe un programa que pida un número entero positivo por teclado y que
* muestre a continuación los números desde el 1 al número introducido junto
* con su factorial.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio39 {
  public static void main(String[] args) {
    
    System.out.println("Este programa te calcula el factorial de todos los números");
    System.out.println("comprendidos entre 1 y el que tú pongas. Introduce uno: ");
    int num = Integer.parseInt(System.console().readLine());
    
    //Cuidado al declarar la variable y en qué altura se hace. Si factorial
    //se deja por encima del do, el valor no se iguala a 1 en cada vuelta,
    //lo que hace que el ejercicio de un resultado erróneo. Para ello hay
    //que ponerlo dentro del do while, de modo que se reinicie con cada
    //pasada. 
    
    int numeros = 1;
    
    do {
      
      int factorial = 1;
    
      for (int i = 1; i <= numeros; i++) {
        factorial *= i;
      }
    
      System.out.println("El factorial de " + numeros + " es " + factorial + ".");
      numeros++;
    
    } while (numeros <= num);
  }
}

    
    


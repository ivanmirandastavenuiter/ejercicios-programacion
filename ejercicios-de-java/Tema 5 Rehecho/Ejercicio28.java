/**
* Ejercicio28
* 
* Escribe un programa que calcule el factorial de un número entero leído por
* teclado.
* 
* Ejemplo:
* Por favor, introduzca un número entero: 6
* 6! = 720
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio28 {
  public static void main(String[] args) {
    
    //El factorial de un número es el resultado de multiplicar todos los
    //que le preceden a partir del 1. Se puede hacer con un for que acumule
    //el resultado de las multiplicaciones como se ha venido haciendo con
    //las sumas
    
    System.out.println("Este programa te calcula el factorial del número que elijas.");
    System.out.println("Compruébalo e introduce un número cualquiera: ");
    int num = Integer.parseInt(System.console().readLine());
    
    int factorial = 1;
  
    for (int i = 1; i < num; i++) {
      factorial *= i;
    }
    
    System.out.println("El factorial de " + num + " es " + (factorial * num) + ".");
  }
}

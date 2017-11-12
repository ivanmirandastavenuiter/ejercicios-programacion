/**
* Ejercicio41
* 
* Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
* hay dentro de un número. Se recomienda usar long en lugar de int ya que el
* primero admite números más largos.

* Ejemplo 1:
* Por favor, introduzca un número entero positivo: 406783
* El 406783 contiene 4 dígitos pares y 2 dígitos impares.

* Ejemplo 2:
* Por favor, introduzca un número entero positivo: 3177840
* El 3177840 contiene 3 dígitos pares y 4 dígitos impares.

* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio41 {
  public static void main(String[] args) {
    
    System.out.println("Este programa identifica los dígitos pares e impares");
    System.out.println("de un número introducido por teclado. Pon el que quieras: ");
    long num = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int pares = 0;
    int impares = 0;
    long auxNum = num;
    long modulo;
    
    do {
      
      modulo = auxNum % 10;
      
      if (modulo % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
      
      auxNum /= 10;
      
    } while (auxNum > 0);
    
      System.out.println("El número " + num + " tiene " + pares + " dígitos pares.");
      System.out.println("El número " + num + " tiene " + impares + " dígitos impares.");
    }
  }
      
      
      
      
      
      
      
      
      
      
      
      
      

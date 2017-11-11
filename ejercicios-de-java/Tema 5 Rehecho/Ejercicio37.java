/**
* Ejercicio37
* 
* Escribe un programa que diga si un número introducido por teclado es o no
* capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
* programa debe aceptar números de cualquier longitud siempre que lo permita
* el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
* long en lugar de int ya que el primero admite números más largos.

* Ejemplo 1:

* Por favor, introduzca un número entero positivo: 678
* El 678 no es capicúa.

* Ejemplo 2:

* Por favor, introduzca un número entero positivo: 2019102
* El 2019102 es capicúa.
*
* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio37 {
  public static void main(String[] args) {
    
    System.out.println("Este programa te dice si el número introducido es capicúa.");
    System.out.println("Pon un número, de la longitud que quieras: ");
    long num = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    //Es simplemente voltear el número y comprobar si son iguales.
    
    long aux = 0;
    long volteado = 0;
    long numAux = num;
    
    while (numAux > 0) {
    
      aux = numAux % 10;
      volteado = volteado * 10 + aux;
      numAux /= 10;
    }
    
    if (num == volteado) {
      System.out.println("El número " + num + " es capicúa.");
    } else {
      System.out.println("Vaya, parece que ese número no es capicúa.");
    }
  }
}
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

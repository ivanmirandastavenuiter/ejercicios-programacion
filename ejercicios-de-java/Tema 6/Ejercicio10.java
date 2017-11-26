/**
 * Ejercicio10
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por carac-
 * teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
 * entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 * aleatoria entre 1 y 40 caracteres.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio10 {
  public static void main(String[] args) {
  
  //El ejercicio pide tres parámetros: uno fijo y dos aleatorios. Hay que 
  //hacer un bucle principal que se repita diez veces y que incluya los 
  //seis caracteres posibles mediante un switch y dentro de ellos poner un 
  //for que los repita tantas veces como indique otro número aleatorio.
  
  int lineas = 10;
  int simbolo;
  int iteraciones;
  
  do {
    
    simbolo = (int)(Math.random() * 6 + 1);
    iteraciones = (int)(Math.random() * 40 + 1);
    
    switch (simbolo) {
      
      case 1:
      
        for (int i = 0; i < iteraciones; i++) {
          System.out.print("*");
        }
        break;
      
      case 2:
      
        for (int i = 0; i < iteraciones; i++) {
          System.out.print("-");
        }
        break;
        
      case 3:
      
        for (int i = 0; i < iteraciones; i++) {
          System.out.print("=");
        }
        break;
        
      case 4:
      
        for (int i = 0; i < iteraciones; i++) {
          System.out.print(".");
        }
        break;
        
      case 5:
      
        for (int i = 0; i < iteraciones; i++) {
          System.out.print("|");
        }
        break;
        
      case 6:
      
        for (int i = 0; i < iteraciones; i++) {
          System.out.print("@");
        }
        break;
      }
        System.out.println();

        lineas--;
    } while (lineas > 0);
  }
}





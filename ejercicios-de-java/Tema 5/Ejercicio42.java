/**
* Ejercicio42
* 
* Escribe un programa que pida un número entero positivo por teclado y que
* muestre a continuación los 5 números consecutivos a partir del número
* introducido. Al lado de cada número se debe indicar si se trata de un primo o
* no.
*
* Ejemplo:
* Por favor, introduzca un número entero positivo: 17
* 17 es primo
* 18 no es primo
* 19 es primo
* 20 no es primo
* 21 no es primo

* @author Iván Miranda Stavenuiter
* 
*/

public class Ejercicio42 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los cinco números siguientes al que");
    System.out.println("introduzcas y te dice si se trata de un número primo o no.");
    System.out.println("Pon un número cualquiera: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int limite = num + 5;
    int inicio = num + 1;
    
    for (int n = inicio; n <= limite; n++) {
      
      int primo = 0;
      
      //Cuidado de nuevo con donde ponemos las variables. Queremos que primo
      //se reinicie a cada vuelta. Si lo ponemos antes del primer for, 
      //acumula dígitos en cada suma y no nos vale luego para la prueba
      //por no haberse iniciado a cero donde debía.
      
      for (int i = 2; i < n; i++) {
        
        if (n % i == 0) {
          primo++;
        }
      }
      
        if (primo == 0) {
          System.out.println("El número " + n + " es un número primo.");
        } else {
          System.out.println("El número " + n + " no es un número primo.");
        }
      }
    }
  }
      
      
      
      
      
      
    

/**
 * Ejercicio13
 * 
 * Escribe un programa que rellene un array de 100 elementos con números ente-
 * ros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 *
 * @author Iván Miranda Stavenuiter
 */

public class Ejercicio13 {
  public static void main(String[] args) {
    
    int[] n = new int[100];
    int numero;
    long mayor = 0;
    long menor = 9999999;
    int opcion;
    
    for (int i = 0; i < 100; i++) {
      
      numero = (int)(Math.random() * 501);
      n[i] = numero;
      System.out.print(n[i] + " ");
      
      if (n[i] > mayor) {
        mayor = n[i];
      }
      if (n[i] < menor) {
        menor = n[i];
      }
    }
     System.out.println();
     System.out.println("?Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
     opcion = Integer.parseInt(System.console().readLine());
     
     switch (opcion) {
      case 1:
      
        for (int i = 0; i < 100; i++) {
          
          if (n[i] == menor) {
            System.out.print("**" + n[i] + "** ");
          } else {
            System.out.print(n[i] + " ");
          }
        }
        break;
      
      case 2:
      
        for (int i = 0; i < 100; i++) {
          
          if (n[i] == mayor) {
            System.out.print("**" + n[i] + "** ");
          } else {
            System.out.print(n[i] + " ");
          }
        }
        break;
      }
    }
  }
      
            
        
          
          
          
          
          
          
          
          
